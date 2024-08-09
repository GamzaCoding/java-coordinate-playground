import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class PointTest {
    @Test
    @DisplayName("비허용된 X,Y값 테스트")
    void disallowedPointRange(){
        assertThatThrownBy(()-> new Point(0,1)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Point(24,25)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("허용된 범위의 X,Y값 테스트")
    void allowedPointRange(){
    }
}
