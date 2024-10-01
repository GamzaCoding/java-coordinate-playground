package model;

import java.util.List;

public class Line implements Shape {

    public static final int POINTS_SIZE = 2;
    private static final String INVALID_POINT_SIZE
            = String.format("선을 그리기 위한 점은 %s개 여야 합니다..", POINTS_SIZE);
    private static final String SAME_POINT_MESSAGE = "동일한 두 점은 선이 될 수 없습니다.";
    private static final String RESULT_PREFIX = "두 점 사이 거리는 ";

    private final List<Point> pointList;

    public Line(List<Point> points){
        validatePointSize(points);
        validateLine(points);

        this.pointList = points;
    }

    private void validateLine(List<Point> points) {
        if(points.get(0).equals(points.get(1))){
            throw new IllegalArgumentException(SAME_POINT_MESSAGE);
        }
    }

    private void validatePointSize(List<Point> points) {
        if(points.size() != POINTS_SIZE){
            throw new IllegalArgumentException(INVALID_POINT_SIZE);
        }
    }

    @Override
    public double calculateArea(){
        return pointList.get(0).calculateDistance(pointList.get(1));
    }
    @Override
    public String getDistanceInfo(){
        return RESULT_PREFIX + calculateArea();
    }

    @Override
    public boolean hasPoint(int x, int y){
        return pointList.stream().anyMatch(point -> point.isSame(x,y));
    }

}
