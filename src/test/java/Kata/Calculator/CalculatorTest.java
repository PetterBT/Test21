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
    void should_return_sum_of_all_numbers() {
        assertThat(Calculator.add("1,2,3,50,944")).isEqualTo(1000);
    }
    @Test
    void should_accept_new_line_instead_of_comma() {                    // Needs work
        assertThat(Calculator.add("2,\n")).isEqualTo(2);
    }
    @Test
    void should_change_delimiter_when_string_begins_with_two_forwardslash() {
        assertThat(Calculator.add("//;\n2;4;4")).isEqualTo(10);
    }

}
