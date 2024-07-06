package Programmer.testing.MembuatTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    @DisplayName("Membagi dengan Nol")
    public void testBagiDenganNol() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        }, "Tidak dapat membagi dengan nol");
    }

    @Test
    @DisplayName("Overflow Integer")
    public void testOverflowInteger() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.add(Integer.MAX_VALUE, 1);
        }, "Overflow integer");
    }

    @Test
    @DisplayName("Underflow Integer")
    public void testUnderflowInteger() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.add(Integer.MIN_VALUE, -1);
        }, "Overflow integer");
    }

    @Test
    @DisplayName("Membagi Angka Positif")
    public void testBagiAngkaPositif() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(10, 2);
        Assertions.assertEquals(5, result);
    }

    @Test
    @DisplayName("Menambah Angka Positif")
    public void testTambahAngkaPositif() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        Assertions.assertEquals(8, result);
    }
}