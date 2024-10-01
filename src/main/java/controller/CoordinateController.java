package controller;

import view.InputView;
import view.OutputView;

public class CoordinateController {
    public void run(){
        InputView inputView = new InputView();
        OutputView.createOutView(inputView.input());
    }
}
