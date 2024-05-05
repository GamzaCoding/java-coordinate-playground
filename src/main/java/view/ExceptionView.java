package view;

public class ExceptionView {
    private static final String POINT_VALUE_LIMIT_MESSAGE = "x,y 좌표값은 24이하로 입력해야 됩니다.";


    public static String getPointValueLimitMessage(){
        return POINT_VALUE_LIMIT_MESSAGE;
    }

}
