import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.assertj.core.api.Assertions.assertThat;

@SpringJUnitConfig
public class AllSquaresUnderTest {


    @Test
    void firstTest() {
        String expectedOutput = "4 9 16";
        assertThat(AllSquaresUnder.findSquares(2,24)).isEqualTo(expectedOutput);
    }

    @Test
    void secondTest() {
        String expectedOutput = "1 4 9 16 25 36 49 64 81 100";
        assertThat(AllSquaresUnder.findSquares(1,100)).isEqualTo(expectedOutput);
    }
}