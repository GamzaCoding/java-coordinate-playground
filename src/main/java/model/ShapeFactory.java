package model;

import java.util.List;

public class ShapeFactory {
    public static Shape getInstance(List<Point> pointList){
        if(pointList.size() == Line.POINTS_SIZE){
            return new Line(pointList);
        }

        if(pointList.size() == Square.POINTS_SIZE){
            return new Square(pointList);
        }

        if(pointList.size() == Triangle.POINTS_SIZE){
            return new Triangle(pointList);
        }

        throw new IllegalArgumentException("유요하지 않은 도형입니다.");
    }
}
