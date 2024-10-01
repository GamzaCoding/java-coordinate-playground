package model;

import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.toSet;

public class Rectangular implements Shape{
    public static final int POINTS_SIZE = 4;
    public static final int ALLOWED_X_OR_Y_POINT_VALUE_SIZE= 2;
    private static final String INVALID_POINT_SIZE
            = String.format("사각형을을 그리기 위한 점은 %s개 여야 합니다..", POINTS_SIZE);
    private static final String INVALID_RECTANGLE = "직사각형을 만들 수 없는 좌표값 입니다.";
    private static final String RESULT_PREFIX = "사각형 넓이는  ";

    private final List<Point> pointList;

    public Rectangular(List<Point> points){
        validatePointsSize(points);
        validateSquare(points);

        this.pointList = points;
    }

    private void validateSquare(List<Point> points) {
        Set<Integer> xPoints = convertToUniqueXValues(points);
        Set<Integer> yPoints = convertToUniqueYValues(points);

        if(hasNotTwoPoints(xPoints)||hasNotTwoPoints(yPoints)){
            throw new IllegalArgumentException(INVALID_RECTANGLE);
        }
    }

    private Set<Integer> convertToUniqueXValues(List<Point> points) {
        return convertToUniqueValues(points, Point::getX);
    }

    private Set<Integer> convertToUniqueYValues(List<Point> points) {
        return convertToUniqueValues(points, Point::getY);
    }

    private Set<Integer> convertToUniqueValues(List<Point> points, Function<Point, Integer> function) {
        return points.stream()
                .map(function)
                .collect(toSet());
    }

    private boolean hasNotTwoPoints(Set<Integer> pointsValue) {
        return pointsValue.size() != ALLOWED_X_OR_Y_POINT_VALUE_SIZE;
    }

    private void validatePointsSize(List<Point> points) {
        if(points.size() != POINTS_SIZE){
            throw new IllegalArgumentException(INVALID_POINT_SIZE);
        }
    }
    @Override
    public double calculateArea(){
        Point standardPoint = pointList.get(0);
        List<Double> lineLength = new ArrayList<>();
        for (Point point : pointList) {
            lineLength.add(standardPoint.calculateDistance(point));
        }
        Collections.sort(lineLength);
        lineLength.remove(0);
        lineLength.remove(lineLength.size()-1);

        return lineLength.get(0) * lineLength.get(1);
    }

    @Override
    public boolean hasPoint(int x, int y){
        return pointList.stream().anyMatch(point -> point.isSame(x,y));
    }

    @Override
    public String getAreaInfo() {
        return RESULT_PREFIX + calculateArea();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangular rectangular = (Rectangular) o;
        return Objects.equals(pointList, rectangular.pointList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointList);
    }
}
