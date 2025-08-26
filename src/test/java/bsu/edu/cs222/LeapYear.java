package bsu.edu.cs222;

public class LeapYear {
    public static boolean isLeapYear(int i) {
        if (i % 400 == 0 || i % 4 == 0 || i % 100 == 0) {
            return true;
        }
        return false;
    }
}