package model;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RectangularTest {

    Shape shape;

    @BeforeEach
    void setUp(){
        List<Point> pointList = Arrays.asList(Point.create(0,0),Point.create(1,1),
                Point.create(0, 1), Point.create(1,0));
        shape = ShapeFactory.createShape(pointList);
    }
    @Test
    @DisplayName("동일 객체 테스트")
    void create(){
        assertThat(shape)
                .isInstanceOf(Rectangular.class)
                .isEqualTo(new Rectangular(Arrays.asList(Point.create(0,0),Point.create(1,1),
                        Point.create(0, 1), Point.create(1,0))));
    }
    @Test
    @DisplayName("Area값 테스트")
    void area(){
        assertThat(shape.calculateArea()).isEqualTo(1.0);
    }
}
