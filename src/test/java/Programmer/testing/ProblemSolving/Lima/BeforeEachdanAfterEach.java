package Programmer.testing.ProblemSolving.Lima;

import org.junit.jupiter.api.*;

public class BeforeEachdanAfterEach {

    @BeforeAll
    public static void BeforeAllApp(){
        System.out.println("BEFORE ALL HARUS STATIC");
    }

    @AfterAll
    public static void AfterAllApp(){
        System.out.println("AFRER ALL HARUS STATIC");
    }

    @BeforeEach
    public void BeforeApp(){
        System.out.println("BEFORE APP");
    }
    @AfterEach
    public void AfterEachApp(){
        System.out.println("AfterEach");
    }

    @Test
    public void testing(){
        System.out.println("BUAT TESTING");
    }

    @Test
    @Disabled
    public  void testingKeDua(){
        System.out.println("TESTING KE DUA");
    }
}
