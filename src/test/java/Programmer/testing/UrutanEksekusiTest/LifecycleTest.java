package Programmer.testing.UrutanEksekusiTest;

import org.junit.jupiter.api.Test;

public class LifecycleTest {

    private String temp;

    @Test
    void testA() {
        temp = "Audyari W";
    }

    @Test
    void testB() {
        System.out.println(temp);
    }
}