import org.junit.jupiter.api.BeforeEach;
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
}