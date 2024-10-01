package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.offset;

public class TriangleTest {


    Shape shape;
    @BeforeEach
    void setUp(){
        List<Point> pointList = Arrays.asList(Point.create(4,4), Point.create(8,12), Point.create(19, 10));
        shape = ShapeFactory.createShape(pointList);
    }

    @Test
    @DisplayName("동일 객체 테스트")
    void create(){
        assertThat(shape).isInstanceOf(Triangle.class)
                .isEqualTo(new Triangle(Arrays.asList(Point.create(4,4), Point.create(8,12), Point.create(19,10))));
    }

    @Test
    @DisplayName("Area값 테스트")
    void area(){
        assertThat(shape.calculateArea()).isEqualTo(48.0, offset(0.1));
    }
}
