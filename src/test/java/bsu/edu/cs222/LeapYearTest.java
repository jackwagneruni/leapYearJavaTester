package bsu.edu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import java.util.Scanner;


public class LeapYearTest {

    @Test
    public void test2024isLeapYear() {
        /* int inputedYear = new int; */
        //Scanner userYearInput = new Scanner(System.in);
        //System.out.print("Please enter the year: ");
        //int inputedYear = userYearInput.nextInt();

        int testYear1 = 200;
        boolean result1 = LeapYearCalculator.isLeapYear(testYear1);
        Assertions.assertFalse(result1);
    }
}