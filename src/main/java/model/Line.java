import java.util.List;
public class Line {
    private static final int POINTS_SIZE = 2;
    private static final String INVALID_POINT_SIZE
            = String.format("선을 그리기 위한 점은 %s개 여야 합니다..", POINTS_SIZE);
    private static final String RESULT_PREFIX = "두 점 사이 거리는";

    private Point firstPoint;
    private Point secondPoint;
    public Line(List<Point> points){
        if(points.size() != POINTS_SIZE){
            throw new IllegalArgumentException(INVALID_POINT_SIZE);
        }
        this.firstPoint = points.get(0);  // 하드코딩 부분인가???
        this.secondPoint = points.get(1); // 하드코딩 부분인가???
    }
    public double calculateDistance(){
        return firstPoint.calculateDistance(secondPoint);
    }
    public String result(){
        return RESULT_PREFIX + calculateDistance();
    }

}
