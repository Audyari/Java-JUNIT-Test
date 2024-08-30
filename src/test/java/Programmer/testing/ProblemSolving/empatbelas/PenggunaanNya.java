package Programmer.testing.ProblemSolving.empatbelas;

import Programmer.testing.MembuatTest.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Extensions({@ExtendWith(DependencyInjectiondiTest.class)})
public class PenggunaanNya {

    private Calculator dataCalkulator = new Calculator();

    @Test
    @BeforeAll
    static void beforeAll() {
        System.out.println("DIPANGGIL BEFORE ALL");
    }

    @Test
    void PanggilInjeksinya(Random dataRandom) {

        var a = dataRandom.nextInt();
        var b = dataRandom.nextInt();

        System.out.println(a);
        System.out.println(b);


        assertEquals(a + b, dataCalkulator.add(a, b));

    }
}
