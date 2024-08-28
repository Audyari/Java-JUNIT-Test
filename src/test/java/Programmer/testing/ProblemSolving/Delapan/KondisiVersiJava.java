package Programmer.testing.ProblemSolving.Delapan;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

public class KondisiVersiJava {

    @Test
    @EnabledOnJre(JRE.JAVA_22)
    void versiJRE(){
        System.out.println("JAVA VERSI 22");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_19)
    void versiJREVersi19(){
        System.out.println("JAVA VERSI 19");
    }

    @Test
    @EnabledForJreRange(max = JRE.JAVA_22,min = JRE.JAVA_8)
    void versiJRERange(){
        System.out.println("JAVA VERSI 22");
    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_11,max = JRE.JAVA_22)
    void versiJRERangeKu(){
        System.out.println("JAVA VERSI 11");
    }

}
