package Programmer.testing.MembuatTest;

import org.junit.jupiter.api.*;
//import Programmer.testing.MembuatTest.Calculator;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        long result = calculator.add(2, 3);
        Assertions.assertEquals(5, result);
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        long result = calculator.subtract(5, 3);
        Assertions.assertEquals(2, result);
    }

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        long result = calculator.multiply(3, 4);
        Assertions.assertEquals(12, result);
    }

    @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        long result = calculator.divide(10, 2);
        Assertions.assertEquals(5, result);
    }

    @Test
    void testDivideByZero() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }

    @Test
    void testOverflowInteger() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.add(Integer.MAX_VALUE, 1));
    }

    @Test
    void testUnderflowInteger() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.subtract(Integer.MIN_VALUE, 1));
    }
}