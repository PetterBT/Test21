package org.example;

import org.example.triangle.Triangle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void test() {
        assertThat(true).isTrue();
    }

    @Test
    @DisplayName("Sum should return three for input one and two")
    void sumOfOneAndTwoReturnsThree() {
        // Arrange
        App app = new App();
        // Act
        var result = app.sum(1,2);
        // Assert
        assertEquals(3, result, "1 + 2 should return 3");
    }

    @Test
    void triangleWithSidesOfLength3AndBase5ShouldNotBeScalene() {
        // Arrange
        Triangle triangle = new Triangle(new double[]{3,3,5});
        // Act
        boolean result = triangle.isScalene();
        // Assert
        assertFalse(result, "Triangle with side-lengths of 3 and a base of 5 should not be scalene");

    }
}