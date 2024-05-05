package validator;

import domain.Point;
import view.ExceptionView;

public class PointValidator {
    public PointValidator(int x, int y){
        validateXYValueLimit(x,y);
    }

    private void validateXYValueLimit(int x, int y){
        if(x > 24){
            throw new IllegalArgumentException(ExceptionView.getPointValueLimitMessage());
        }
        if(y > 24){
            throw new IllegalArgumentException(ExceptionView.getPointValueLimitMessage());
        }

    }


}
