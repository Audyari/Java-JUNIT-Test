package Programmer.testing.ProblemSolving.tigabelas;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestInformation {

    @Test
    @DisplayName("Ini adalah Display-nya")
    @Tags({
            @Tag("my-tag"),
            @Tag("my-tag2")
    })
    void panggilMetodeInformation(TestInfo dataInformasi) {
        System.out.println(dataInformasi.getDisplayName());
        System.out.println(dataInformasi.getTestClass());
        System.out.println(dataInformasi.getTestMethod());
        assertTrue(dataInformasi.getTags().contains("my-tag"));
        System.out.println(dataInformasi.getTags());
    }
}