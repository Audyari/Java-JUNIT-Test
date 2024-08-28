package Programmer.testing.ProblemSolving.Delapan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariables;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariables;

public class MenggunakanEnvironmenVariabel {

    @Test
    @EnabledIfEnvironmentVariables({
            @EnabledIfEnvironmentVariable(named = "TESTING",matches = "DEV")
    })
    void testEnvironmenVariabel(){
        System.out.println("KONDISI BENAR DIJALANKAN");
    }
    @Test
    @DisabledIfEnvironmentVariables({
            @DisabledIfEnvironmentVariable(named = "TESTING",matches = "DEV")
    })
    void testdisableEnvironmenVariabel(){
        System.out.println("KONDISI BENAR DIJALANKAN");
    }
}
