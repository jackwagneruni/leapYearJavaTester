package bsu.edu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearCalculatorTest {

    @Test
    public void test2024IsLeapYear() {
        int testYear = 2024;
        boolean result = LeapYearCalculator.isLeapYear(testYear);
        Assertions.assertTrue(result);
    }
}