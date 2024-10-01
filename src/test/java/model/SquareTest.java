package model;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SquareTest {

    @Test
    void calculateAreaTest(){
        List<Point> points0 = Arrays.asList(new Point(0,0), new Point(1,1),
                new Point(0,1), new Point(1,0));

        Square square = new Square(points0);

        double area = square.calculateArea();
        double expected = 1.0;


        assertThat(area).isEqualTo(expected, Offset.offset(0.1));

    }
}
