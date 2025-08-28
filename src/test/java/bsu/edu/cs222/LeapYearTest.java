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
        int testYear2 = 400;
        boolean result2 = LeapYearCalculator.isLeapYear(testYear2);
        Assertions.assertTrue(result2);
    }
    @Test
    public void test2025isLeapYear() {
        int testYear3 = 2025;
        boolean result3 = LeapYearCalculator.isLeapYear(testYear3);
        Assertions.assertFalse(result3);
    }
    @Test
    public void test1900isLeapYear() {
        int testYear4 = 1900;
        boolean result4 = LeapYearCalculator.isLeapYear(testYear4);
        Assertions.assertFalse(result4);
    }

}