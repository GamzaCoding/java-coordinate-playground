package domain;

public class CalculatorPoints {

    public static double calculatorPointsLine(Point A, Point B){

        double squareX = Math.pow(A.getX() - B.getX(), 2);
        double squareY = Math.pow(A.getY() - B.getY(), 2);


        return Math.sqrt(squareX + squareY);

    }
}
