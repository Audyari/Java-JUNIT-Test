package Programmer.testing.ProblemSolving.sembilan;

import org.junit.jupiter.api.Tag;

import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Tags({@Tag("Jalankan")
})

public class MenggunakanTagApp {

    // cara panggil tag nya : mvn test -Dgroups=tag1,tag2
    // mvn test -Dgroups=Jalankan

    @Test
    void test01() {
        System.out.println("test ke 1");
    }

    @Test
    void test02() {
        System.out.println("test ke 2 ");
    }
}
