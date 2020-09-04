import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.assertj.core.api.Assertions.assertThat;

@SpringJUnitConfig
public class FibonacciTest {


    @Test
    void firstTest() {
        String expectedOutput = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34";
        assertThat(Fibonacci.outputSequence(10)).isEqualTo(expectedOutput);
    }
}
