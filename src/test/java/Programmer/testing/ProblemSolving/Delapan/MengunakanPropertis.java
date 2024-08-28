package Programmer.testing.ProblemSolving.Delapan;



import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperties;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledIfSystemProperties;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;




public class MengunakanPropertis {

    @Test
    void panggilPropertis() {
        var dataPropertis = System.getProperties();

//        dataPropertis.forEach(new BiConsumer<Object, Object>() {
//            @Override
//            public void accept(Object o, Object o2) {
//                System.out.println(" DATA SATU : " + o + " DATA DUANYA : " + o2);
//            }
//        });

        dataPropertis.forEach((o, o2) -> System.out.println(" DATA SATU : " + o + " DATA DUANYA : " + o2));

    }

    @Test
    @EnabledIfSystemProperties({
            @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")})
    void bisaDiOrackel(){
        System.out.println("JALANKAN sysTEM PROPeRTIS JAVA ORACLE");
    }

    @Test
    @DisabledIfSystemProperties({
            @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")})
    void janganJalankanDiOrackel(){
        System.out.println("Tidak Di jalankan");
    }
}
