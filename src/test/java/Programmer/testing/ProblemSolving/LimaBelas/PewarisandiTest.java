package Programmer.testing.ProblemSolving.LimaBelas;

import Programmer.testing.MembuatTest.Calculator;
import Programmer.testing.ProblemSolving.empatbelas.DependencyInjectiondiTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

@Extensions({@ExtendWith(DependencyInjectiondiTest.class)})
public class PewarisandiTest {

    public Calculator dataCalkulator = new Calculator();

    @BeforeAll
    static void beforeAll() {
        System.out.println("PANGGIL BEFORE ALL");
    }
}
