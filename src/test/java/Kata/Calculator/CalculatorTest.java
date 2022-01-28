package Kata.Calculator;

import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class CalculatorTest {

    @Test
    void empty_string_should_return_zero() {
        assertThat(Calculator.add("")).isEqualTo(0);
    }
    @Test
    void ten_should_return_ten() {
        assertThat(Calculator.add("1")).isEqualTo(1);
    }
    @Test
    void two_and_six_should_return_eight() {
        assertThat(Calculator.add("2,6")).isEqualTo(8);
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
