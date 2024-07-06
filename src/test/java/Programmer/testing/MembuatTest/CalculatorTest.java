package Programmer.testing.MembuatTest;

import org.junit.jupiter.api.*;
import Programmer.testing.MembuatTest.Calculator;

public class CalculatorTest {

    @BeforeAll
    static void setupAll() {
        System.out.println("Initializing shared resources...");
        Object calculator = new Calculator();
        System.out.println(calculator);
    }

    @AfterAll
    static void cleanupAll() {
        System.out.println("Releasing shared resources...");
    }

    @BeforeEach
    void setup() {
        System.out.println("Preparing test environment...");
    }

    @AfterEach
    void cleanup() {
        System.out.println("Cleaning up test environment...");
    }

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