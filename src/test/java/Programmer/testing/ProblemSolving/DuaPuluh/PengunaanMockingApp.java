package Programmer.testing.ProblemSolving.DuaPuluh;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PengunaanMockingApp {

    @Test
    void tanpaMokingApp(){

        // Membuat list nyata
        List<String> data = new ArrayList<>();
        data.add("AUDY");

        // Memanggil metode pertama kali
        String result = data.get(0);
        System.out.println(result); // Panggil sekali

        // Memastikan hasil yang diharapkan
        assertEquals("AUDY", result); // Panggil kedua kali

        // Verifikasi manual
        int callCount = 0; // Menghitung jumlah panggilan
        if (data.size() > 0) {
            callCount++; // Hitung panggilan pertama
            // Panggilan kedua
            String secondResult = data.get(0);
            if (secondResult.equals("AUDY")) {
                callCount++; // Hitung panggilan kedua
            }
        }

        // Memastikan bahwa get(0) dipanggil tepat 2 kali
        assertEquals(2, callCount); // Memastikan jumlah panggilan

    }

    @Test
    void menggunakkanMocking(){
        List<String> dataMocking = Mockito.mock(List.class);

        Mockito.when(dataMocking.get(0)).thenReturn("AUDY");

        System.out.println(dataMocking.get(0)); //panggil sekali

        assertEquals("AUDY",dataMocking.get(0)); //panggil 2 kali

        Mockito.verify(dataMocking,Mockito.times(2)).get(0);
    }
}
