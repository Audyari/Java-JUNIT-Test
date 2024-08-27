package Programmer.testing.ProblemSolving.Tiga;

import Programmer.testing.ProblemSolving.satu.Calkulator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//@DisplayName(" Test Display ")

@DisplayNameGeneration(DisplayNameGeneratorApp.class)
public class DisplayNameApp {

    @Test
    //@DisplayName("Test_Mengunakan_DIsplay")

    public void menggunakanDisplay() {

        //Calkulator testObjek = new Calkulator();
        var hasil = Calkulator.add(5,5);
        assertEquals(10,hasil);
    }
}
