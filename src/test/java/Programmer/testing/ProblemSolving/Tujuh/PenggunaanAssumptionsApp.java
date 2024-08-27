package Programmer.testing.ProblemSolving.Tujuh;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class PenggunaanAssumptionsApp {

    @Test
    public void testGunakanAssumptionsApp(){
        Assumptions.assumeTrue("DEV".equals(System.getenv("PROVILE")));
        System.out.println("APLIKASI SATU JALAN");
    }

    @Test
    public void testGunakanAssumptionsAppDua(){
        Assumptions.assumeFalse("DEV".equals(System.getenv("PROVILE")));
        System.out.println("APLIKASI DUA JALAN");
    }
}
