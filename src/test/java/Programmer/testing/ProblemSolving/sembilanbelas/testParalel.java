package Programmer.testing.ProblemSolving.sembilanbelas;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.concurrent.TimeUnit;

@Execution(ExecutionMode.CONCURRENT)
public class testParalel {

    @Test
    @Timeout(value = 5,unit = TimeUnit.SECONDS)
    void testAppParalelSatu() throws InterruptedException{

        Thread.sleep(5_000);

    }

    @Test
    @Timeout(value = 5,unit = TimeUnit.SECONDS)
    void testAppParalelDua() throws InterruptedException{

        Thread.sleep(5_000);

    }

}
