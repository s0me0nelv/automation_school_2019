package practice;

public class LeapYear {

    public String isLeapYear(int year) {
        if (year >= 1900 && year <= 3000) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                return "Leap";
            } else {
                return "Regular";
            }
        } else {
            return "Not valid year";
        }
    }
}