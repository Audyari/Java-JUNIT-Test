package Programmer.testing.TestBerdasarkanKondisi;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.util.Properties;

@DisplayName("Condition Test")
public class ConditionTest {

    @Test
    @DisplayName("Test System Properties")
    void testSystemProperties() {
        Properties properties = System.getProperties();
        properties.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    @Test
    @EnabledOnOs({OS.WINDOWS})
    @DisplayName("Test Enabled On Windows")
    public void testRunOnlyOnWindows() {

    }

    @Test
    @DisabledOnOs({OS.WINDOWS})
    @DisplayName("Test Disabled On Windows")
    public void testDisabledOnWindows() {

    }

    @Test
    @EnabledOnJre({JRE.JAVA_8})
    @DisplayName("Test Enabled On Java 8")
    void testEnabledOnJava8() {

    }

    @Test
    @DisabledOnJre({JRE.JAVA_8})
    @DisplayName("Test Disabled On Java 8")
    void testDisabledOnJava8() {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_15)
    @DisplayName("Test Enabled On Java 11 to 15")
    void testEnabledOnJava11To15() {

    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_15)
    @DisplayName("Test Disabled On Java 11 to 15")
    void testDisabledOnJava11To15() {

    }

    @Test
    @EnabledIfSystemProperties({
            @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    })
    @DisplayName("Test Enabled On Java Vendor Oracle")
    void testEnabledOnJavaVendorOracle() {

    }

    @Test
    @DisabledIfSystemProperties({
            @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    })
    @DisplayName("Test Disabled On Java Vendor Oracle")
    void testDisabledOnJavaVendorOracle() {

    }

    @Test
    @EnabledIfEnvironmentVariables({
            @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    })
    @DisplayName("Test Enabled On Profile DEV")
    void testEnabledOnProfileDev() {

    }

    @Test
    @DisabledIfEnvironmentVariables({
            @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    })
    @DisplayName("Test Disabled On Profile DEV")
    void testDisabledOnProfileDev() {

    }
}