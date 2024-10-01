import controller.CoordinateController;
import model.Shape;
import view.InputView;
import view.OutputView;

public class Application {
    public static void main(String[] args) {
        CoordinateController coordinateController = new CoordinateController();
        coordinateController.run();
    }

}
