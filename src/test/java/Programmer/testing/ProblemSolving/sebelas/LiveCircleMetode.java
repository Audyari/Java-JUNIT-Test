package Programmer.testing.ProblemSolving.sebelas;


import org.junit.jupiter.api.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LiveCircleMetode {

    private int nilai = 1;

    @Test
    void test1() {
        var hasil = nilai++;
        System.out.println(hasil);

    }

    @Test
    void test2() {
        var hasil = nilai++;
        System.out.println(hasil);

    }

    @Test
    void test3() {
        var hasil = nilai++;
        System.out.println(hasil);

    }

    @BeforeEach
    void setUp() {

    }



    @Test
    @BeforeAll
    void beforeAll() {
        System.out.println("test tanpa static");
    }

    @Test
    @AfterAll
    void afterAll() {
        System.out.println("Test Pake Static");
    }
}
