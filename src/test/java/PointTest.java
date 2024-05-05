import domain.CalculatorPoints;
import domain.Point;
import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PointTest {

    @Test
    @DisplayName("두 점 사이의 거리 구하기")
    void calculatorDistanceBetweenTowPoints(){
        Point pointA = new Point(1, 2);
        Point pointB = new Point(0, 0);

        assertThat(CalculatorPoints.calculatorPointsLine(pointA, pointB)).isCloseTo(Math.sqrt(5), Percentage.withPercentage(0.0000001));


    }
}
