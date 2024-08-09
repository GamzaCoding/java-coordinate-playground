public class Point {
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 24;
    private static final String INVALID_POINT
            = String.format("포인트 값은 %s ~ %s 사이의 값이여야 합니다.", MIN_VALUE, MAX_VALUE);
    private int x;
    private int y;
    public Point(int x, int y) {
        if(invalidRange(x) || invalidRange(y)){
            throw new IllegalArgumentException(INVALID_POINT);
        }
        this.x = x;
        this.y = y;
    }
    private boolean invalidRange(int point){
        return (point < MIN_VALUE || point > MAX_VALUE);
    }

    public double calculateDistance(Point otherPoint){
        return Math.sqrt(Math.pow(this.x - otherPoint.getX(), 2) + Math.pow(this.y - otherPoint.getY(), 2));
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
