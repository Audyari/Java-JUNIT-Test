package Programmer.testing.ProblemSolving.sepuluh;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderAnotation {

    @Test
    @Order(1)
    void test() {
        System.out.println("TEST");
    }

    @Test
    @Order(3)
    void test2(){
        System.out.println("TEST");
    }

    @Test
    @Order(2)
    void test3(){
        System.out.println("TEST");
    }

}
