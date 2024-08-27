package Programmer.testing.ProblemSolving.enam;

import org.junit.jupiter.api.Test;
import org.opentest4j.TestAbortedException;

public class MembatalkanTestApp {

    @Test
    public void TestBatalinApp(){
        var profile = System.getenv("PROFILE");
        if(!"DEV".equals(profile)){
            throw new TestAbortedException("UNIT TEST DIBATALKAN");
        }
    }

    @Test
    public void testUnit(){
        System.out.println("TESTING");
    }
}
