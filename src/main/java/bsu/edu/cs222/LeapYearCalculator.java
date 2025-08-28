package bsu.edu.cs222;

public class LeapYearCalculator {

    public static boolean isLeapYear(int year) {
        // A year is a leap year if:
        // 1. It's divisible by 4, AND
        // 2. If it's divisible by 100, it must also be divisible by 400

        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else {
            return year % 400 == 0;
        }
    }
}