package bsu.edu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {

    @Test
    public void test2024isLeapYear() {
        int testYear1 = 2024;
        boolean result1 = LeapYearCalculator.isLeapYear(testYear1);
        Assertions.assertTrue(result1);
    }
    @Test
    public void test400isLeapYear() {
        int testYear1 = 400;
        boolean result1 = LeapYearCalculator.isLeapYear(testYear1);
        Assertions.assertTrue(result1);
    }
    @Test
    public void test2025isLeapYear() {
        int testYear1 = 2025;
        boolean result1 = LeapYearCalculator.isLeapYear(testYear1);
        Assertions.assertFalse(result1);
    }

}