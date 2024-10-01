package model;

import java.util.List;

public class ShapeFactory {
    public static Shape createShape(List<Point> pointList){
        if(pointList.size() == Line.POINTS_SIZE){
            return new Line(pointList);
        }

        if(pointList.size() == Rectangular.POINTS_SIZE){
            return new Rectangular(pointList);
        }

        if(pointList.size() == Triangle.POINTS_SIZE){
            return new Triangle(pointList);
        }

        throw new IllegalArgumentException("유요하지 않은 도형입니다.");
    }
}
