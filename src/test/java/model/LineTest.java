package model;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class LineTest {
    @Test
    @DisplayName("Line 매개변수로 비허용된 Point 인스턴스 갯수에 대한 테스트")
    void exception(){
        List<Point> points0 = Arrays.asList(new Point(10,10), new Point(14,15), new Point(24,24));
        assertThatThrownBy(() -> new Line(points0)).isInstanceOf(IllegalArgumentException.class);

        List<Point> points1 = Arrays.asList(new Point(24,24));
        assertThatThrownBy(() -> new Line(points1)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void calculateDistance(){
        List<Point> points = Arrays.asList(new Point(10,10), new Point(14,15));
        Line line = new Line(points);
        double distance = line.calculateArea();
        double expected = 6.4;

        assertThat(distance).isEqualTo(expected, Offset.offset(0.1));
    }
}
