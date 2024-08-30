package Programmer.testing.ProblemSolving.tujuhbelas;

import Programmer.testing.MembuatTest.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testingDengaanParameter {

    Calculator Objekkakulator = new Calculator();

    @DisplayName("testing dengan parameter")
    @ParameterizedTest(name = "{displayName} data ke {0}")
    @ValueSource(ints = {1,2,3,4,5})
    void tesringParameter(int dataNya){

        var hasil = dataNya+dataNya;
        assertEquals(hasil,Objekkakulator.add(dataNya,dataNya));


    }


    public static List<Integer> dataMetode(){
        return List.of(1,2,3,4,5,6,7,8,9,10);
    }


    @DisplayName("testing dengan parameter")
    @ParameterizedTest(name = "{displayName} data ke {0}")
    @MethodSource("dataMetode")
    void tesringParameterMetode(Integer dataNya){

        var hasil = dataNya+dataNya;
        assertEquals(hasil,Objekkakulator.add(dataNya,dataNya));


    }
}
