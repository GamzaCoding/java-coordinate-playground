package model;
import java.util.List;
import java.util.Objects;

public class Triangle implements Shape{
    public static final int POINTS_SIZE = 3;
    private static final String INVALID_POINT_SIZE
            = String.format("삼각형을을 그리기 위한 점은 %s개 여야 합니다..", POINTS_SIZE);
    private static final String RESULT_PREFIX = "삼각형 넓이는  ";

    private final List<Point> pointList;

    public Triangle(List<Point> points){
        if(points.size() != POINTS_SIZE){
            throw new IllegalArgumentException(INVALID_POINT_SIZE);
        }
        this.pointList = points;
    }

    @Override
    public double calculateArea(){
        Point pointA = pointList.get(0);
        Point pointB = pointList.get(1);
        Point pointC = pointList.get(2);
        double lengthA = pointA.calculateDistance(pointB);
        double lengthB = pointB.calculateDistance(pointC);
        double lengthC = pointC.calculateDistance(pointA);

        return heronsFormula(lengthA,lengthB,lengthC);
    }

    private double heronsFormula(double lengthA, double lengthB, double lengthC) {
        double s = (lengthA + lengthB + lengthC) / 2;
        return Math.sqrt(s*(s-lengthA)*(s-lengthB)*(s-lengthC));
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
        Triangle triangle = (Triangle) o;
        return Objects.equals(pointList, triangle.pointList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointList);
    }
}
