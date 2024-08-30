package Programmer.testing.ProblemSolving.duabelas;

import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.Queue;

@DisplayName("testing Queue")
public class TestdidalamTestDenganNested {

    private Queue<String> testDataQueue;

    @Nested
    @DisplayName("Bikin Baru Queue")
    public class BikinBaru {

        @BeforeEach
        void setUp() {
            testDataQueue = new LinkedList<>();
        }

        @Test
        @DisplayName(" Test input data satu")
        void panggilDataSatu(){
            testDataQueue.add("AUDYARI");
            Assertions.assertEquals(1, testDataQueue.size());
        }

        @Test
        @DisplayName("Isi data ke Dua")
        void panggilDataDua(){
            testDataQueue.add("Audyari");
            testDataQueue.add("Budi");

            Assertions.assertEquals(2,testDataQueue.size());
        }
    }

    @Nested
    @DisplayName("Bikin Baru Queue")
    public class BikinBaru2 {

        @BeforeEach
        void setUp() {
            testDataQueue = new LinkedList<>();
        }

        @Test
        @DisplayName(" Test input data satu")
        void panggilDataSatu(){
            testDataQueue.add("AUDYARI");
            Assertions.assertEquals(1, testDataQueue.size());
        }

        @Test
        @DisplayName("Isi data ke Dua")
        void panggilDataDua(){
            testDataQueue.add("Audyari");
            testDataQueue.add("Budi");

            Assertions.assertEquals(2,testDataQueue.size());
        }
    }

}
