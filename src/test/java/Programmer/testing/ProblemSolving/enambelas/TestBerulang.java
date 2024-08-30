package Programmer.testing.ProblemSolving.enambelas;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class TestBerulang {

    @DisplayName("Pengetesan Berkali Kali = ")
    @RepeatedTest(
            value = 5,
            name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
    )
    void panggilbeberapakali() {
        System.out.println("test");
    }

    @DisplayName("Pengetesan Berkali Kali pake cara lain= ")
    @RepeatedTest(
            value = 5
    )
    void panggilbeberapakaliLagi(RepetitionInfo dataInfo, TestInfo dataTestInfo) {
        System.out.println(dataTestInfo.getDisplayName() + "Ke : " + dataInfo.getCurrentRepetition());
        System.out.println("test");
    }

}
