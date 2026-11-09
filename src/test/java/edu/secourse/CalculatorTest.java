
package edu.secourse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("add(): add two numbers")
    void add() {
        assertAll(
                () -> assertEquals(2, Calculator.add(1, 1)),
                () -> assertEquals(2, Calculator.add(2, 0)),
                () -> assertEquals(-1, Calculator.add(2, -3))
        );
    }

    @Test
    @DisplayName("multiply(): multiply two numbers")
    void multiply() {
        assertAll(
                () -> assertEquals(0.0, Calculator.multiply(-3.0, 0.0))
        );
    }

    @Test
    @DisplayName("Sqrt()")
    void sqrt(){
        assertAll(
                () -> assertEquals(9, Calculator.sqrt(81)
        ));;
    }
}
