public class LeapYear {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        if (isLeapYear(year)) {
            System.out.println(args[0] + " is a leap year.");
        } else {System.out.println(args[0] + " is not a leap year.");
        }
    }
    /**check if Leap Year */
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 != 0 && year % 4 ==0) {
            return true;
        } return false;
    }
}
