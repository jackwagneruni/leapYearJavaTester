package bsu.edu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearCalculatorTest {

    public void test2024IsLeapYear()
    {
        LeapYearCalculatorTest learYear = new LeapYearCalculatorTest(); // create object
        boolean result = LeapYear.isLeapYear(2024);// will need to create this method
        Assertions.assertTrue(result);
    }

}
