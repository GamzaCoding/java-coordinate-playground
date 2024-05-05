import domain.Point;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;

public class ExceptionTest {

    @Test
    @DisplayName("X,Y 값 24 이하만 허용 ")
    void XYValueLimitTest(){
        assertThatThrownBy(() -> new Point(0,25)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Point(25,0)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Point(25,25)).isInstanceOf(IllegalArgumentException.class);

        assertThatCode(() -> new Point(24,24)).doesNotThrowAnyException(); // 정상코드 실행시 assertThatCode()를 사용하자

    }
}
