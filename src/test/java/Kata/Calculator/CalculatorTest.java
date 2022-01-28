package Kata.Calculator;

import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class CalculatorTest {

    @Test
    void should_return_zero_when_given_empty_string() {
        assertThat(Calculator.add("")).isEqualTo(0);
    }
    @Test
    void should_return_one_when_given_one_as_input() {
        assertThat(Calculator.add("1")).isEqualTo(1);
    }
    @Test
    void should_return2() {
        assertThat(Calculator.add("")).isEqualTo(0);
    }
    @Test
    void should_return3() {
        assertThat(Calculator.add("")).isEqualTo(0);
    }
    @Test
    void should_return4() {
        assertThat(Calculator.add("")).isEqualTo(0);
    }
    @Test
    void should_return5() {
        assertThat(Calculator.add("")).isEqualTo(0);
    }

}
