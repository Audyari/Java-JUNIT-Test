package Programmer.testing.ProblemSolving.delapanbelas;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TimeoutdiTest {

    @Test
    @Timeout(value = 5,unit = TimeUnit.SECONDS)
    void testBerdasarkanWaktu() throws InterruptedException{

        Thread.sleep(4_999);

    }

    @Test
    @Timeout(value = 5,unit = TimeUnit.SECONDS)
    void testBerdasarkanWaktuGagal() throws InterruptedException{

        Thread.sleep(5_000);

    }
}
