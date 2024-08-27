package Programmer.testing.ProblemSolving.dua;

import Programmer.testing.MembuatTest.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PenggunaanAssertionsAppTest {

    public Calculator testData = new Calculator();

    @Test
    void testHasil(){
        var hasilnya = testData.add(10,10);

        assertEquals(20,hasilnya);
    }

    @Test
    void testPengurangan(){


    }

}
