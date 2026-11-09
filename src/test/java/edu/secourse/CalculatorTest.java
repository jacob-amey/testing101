
package edu.secourse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static final double DIFF = 1e-6;

    @Test
    @DisplayName("add(): add two double numbers")
    void add() {
        assertAll(
                () -> assertEquals(2.0, Calculator.add(1.0, 1.0)),
                () -> assertEquals(2.0, Calculator.add(2.0, 0.0)),
                () -> assertEquals(-1.0, Calculator.add(2.0, -3.0))
        );
    }

    @Test
    @DisplayName("add(): add two double numbers")
    void addInt() {
        assertAll(
                () -> assertEquals(2, Calculator.add(1, 1)),
                () -> assertEquals(2, Calculator.add(2, 0)),
                () -> assertEquals(-1, Calculator.add(2, -3))
        );
    }

    @Test
    @DisplayName("multiply(): multiply two double numbers")
    void multiply() {
        assertAll(
                () -> assertEquals(0.0, Calculator.multiply(-3.0, 0.0), DIFF)
        );
    }

    @Test
    @DisplayName("multiply(): multiply two double numbers")
    void multiplyInt() {
        assertAll(
                () -> assertEquals(0.0, Calculator.multiply(-3.0, 0.0), DIFF),
                () -> assertEquals(5, Calculator.multiply(5, 1), DIFF),
                () -> assertEquals(10, Calculator.multiply(5, 2), DIFF)
        );
    }

    @Test
    @DisplayName("sqrt(): Returns the square root of the number")
    void sqrt(){
        assertAll(
                () -> assertEquals(2, Calculator.sqrt(4.0),DIFF),
                () -> assertEquals(3, Calculator.sqrt(9.0),DIFF),
                () -> assertEquals(1.41421356, Calculator.sqrt(2.0), DIFF),
                () -> assertEquals(0, Calculator.sqrt(0.0),DIFF),
                () -> assertEquals(1, Calculator.sqrt(1.0),DIFF),
                () -> assertEquals(0.5, Calculator.sqrt(0.25),DIFF),
                () -> assertThrows(IllegalArgumentException.class,() -> Calculator.sqrt(-4))
        );
    }

    @Test
    @DisplayName("divide(): Divides two double numbers")
    void divide() {
        assertAll(
                () -> assertEquals(5.0, Calculator.divide(10,2),DIFF),
                () -> assertEquals(3.5, Calculator.divide(7,2),DIFF),
                () -> assertEquals(0.333333, Calculator.divide(1,3),DIFF),
                () -> assertEquals(-5.0, Calculator.divide(-10,2),DIFF),
                () -> assertEquals(-5.0, Calculator.divide(10,-2),DIFF),
                () -> assertEquals(0.0, Calculator.divide(0,2),DIFF),
                () -> assertEquals(10.0, Calculator.divide(10,1),DIFF),
                () -> assertEquals(1.0, Calculator.divide(10,10),DIFF),
                () -> assertEquals(2.0, Calculator.divide(1,0.5),DIFF),
                () -> assertEquals(1.0, Calculator.divide(-1,-1),DIFF)
        );
    }

    @Test
    @DisplayName("Divide(): Throws RuntimeException when dividing by zero")
    void divideByZero(){
        assertAll(
                () -> assertThrows(IllegalArgumentException.class,() -> Calculator.divide(5,0)),
                () -> assertThrows(IllegalArgumentException.class,() -> Calculator.divide(0,0)),
                () -> assertThrows(IllegalArgumentException.class,() -> Calculator.divide(-10,0))

        );
    }


}
