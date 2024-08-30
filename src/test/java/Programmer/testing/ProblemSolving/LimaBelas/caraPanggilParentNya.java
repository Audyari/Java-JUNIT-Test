package Programmer.testing.ProblemSolving.LimaBelas;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class caraPanggilParentNya extends  PewarisandiTest{

    @Test
    void pemanggilanPakeParent(Random dataRandom){
        var a = dataRandom.nextInt();
        var b = dataRandom.nextInt();

        System.out.println(a);
        System.out.println(b);


        assertEquals(a + b, dataCalkulator.add(a, b));
    }

}
