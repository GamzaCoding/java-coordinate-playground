package domain;

import validator.PointValidator;

public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y){
        new PointValidator(x, y);

        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
