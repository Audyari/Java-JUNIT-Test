package Programmer.testing.ProblemSolving.Tiga;


import org.junit.jupiter.api.DisplayNameGenerator;


import java.lang.reflect.Method;

public class DisplayNameGeneratorApp implements DisplayNameGenerator {

    @Override
    public String generateDisplayNameForClass(Class<?> testClass) {
        return "PAKE DISPLAY : " + testClass.getSimpleName();
    }

    @Override
    public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
        return "";
    }

    @Override
    public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
        return "INI METODE NYA : " + testClass.getSimpleName() + testMethod.getName();
    }
}

