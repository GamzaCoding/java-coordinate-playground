package view;

import model.Shape;
public class OutView {
    private static final String VERTICAL_AXIS = "|";
    private static final String HORIZONTAL_AXIS = "----";
    private static final String FOUR_BLANK = "    ";
    private static final String ORIGIN = ".";
    private static final int POSITION_MAX = 24;
    private static final int POSITION_MIN = 0;

    private static void createOutView(Shape shape){
        showVertical(shape);
        showHorizontalAxis();
    }

    private static void showVertical(Shape shape){
        for(int y = POSITION_MAX; y >= POSITION_MIN; y--){
            showAxisNumber(y);
            System.out.print(VERTICAL_AXIS);
            showPoints(shape, y);
            emptyLine();
        }
    }

    private static void showAxisNumber(int index){
        if(index % 2 == 0){
            System.out.print(String.format("%4d", index));
            return;
        }
        System.out.print(FOUR_BLANK);
    }

    private static void showPoints(Shape shape, int y){
        for(int x = POSITION_MIN; x <= POSITION_MAX; x++){
            if(shape.hasPoint(x,y)){
                System.out.print(String.format("%4s", ORIGIN));
                continue;
            }
            System.out.print(FOUR_BLANK);
        }
    }

    private static void showHorizontalAxis(){
        System.out.print(FOUR_BLANK + ORIGIN);
        for(int x = POSITION_MIN; x <= POSITION_MAX; x++){
            System.out.print(HORIZONTAL_AXIS);
        }
        emptyLine();
    }

    private static void showHorizontalNumbers(){
        for(int x = 0; x <= POSITION_MAX; x++){
            showAxisNumber(x);
        }
        emptyLine();
    }

    private static void emptyLine(){
        System.out.println();
    }

}
