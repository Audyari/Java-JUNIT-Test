package Programmer.testing.ProblemSolving.satu;

import org.junit.jupiter.api.NamedExecutable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalkulatorTest {

    Calkulator testKalkulator = new Calkulator();

    @Test
    void testAdd() {
        var hasil = testKalkulator.add(10, 10);
    }

    @Test
    void testhasilnull() {
        testKalkulator.add("DATA", 5.1);
    }

    @Test
    void testHasil() {
        var hasilnya = testKalkulator.add(10, 10);

        if (hasilnya == 20) {
            System.out.println("benar");
        } else {
            System.out.println("salah");
        }

        assertEquals(20, hasilnya);
    }

    @Test
    void testPembagian() {

        var hasil = Calkulator.divide(2, 2);
        System.out.println(hasil);
    }

    @Test
    void TestEror() {
//        var hasil = testKalkulator.divide(100,0);
//       System.out.println(hasil) ;


//        assertThrows(ArithmeticException.class, new NamedExecutable() {
//            @Override
//            public void execute() throws Throwable {
//               testKalkulator.divide(100,0);
//            }
//        });


//        assertThrows(IllegalArgumentException.class, new NamedExecutable() {
//            @Override
//            public void execute() throws Throwable {
//                Calkulator.divide(100,0);
//            }
//        });

        var data = Calkulator.divide(100, 0);
        System.out.println(data);
    }

    @Test
    void PenggunaanassertThrows() {

        // Contoh

//        assertThrows(IllegalArgumentException.class, new NamedExecutable() {
//            @Override
//            public void execute() throws Throwable {
//                Calkulator.divide(100,0);
//            }
//        });


        // CONTOH PAKE LAMDA
        // assertThrows(IllegalArgumentException.class, () -> Calkulator.divide(100, 0));
        System.out.println("Test assertThrows");

    }
}
