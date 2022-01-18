package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void test() {
        assertThat(true).isTrue();
    }

    @Test
    @DisplayName("Sum should return three for input one and two")
    void sumOfOneAndTwoReturnsThree() {
        App app = new App();

        var result = app.sum(1,2);

        assertEquals(3, result, "1 + 2 should return 3");

    }
}