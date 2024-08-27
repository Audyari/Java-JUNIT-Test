package Programmer.testing.ProblemSolving.Delapan;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class KondisiSistemOperasi {

    @Test
    @EnabledOnOs(value = {OS.WINDOWS})
    public void jalandiWIndows(){
        System.out.println("JALAN DI WINDOWS");
    }

    @Test
    @DisabledOnOs(value = {OS.WINDOWS})
    public void JanganjalandiWIndows(){
        System.out.println("JANGAN JALAN DI WINDOWS");
    }

}
