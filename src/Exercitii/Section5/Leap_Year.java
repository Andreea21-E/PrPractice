package Exercitii.Section5;



public class Leap_Year {

    //I must to check again - is not working well

    public static int leapYear;

    public static Boolean isLeapYear(int year){
        return ((year > 0 && year <= 9999) && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0));
//        if (year < 1 || year > 9999) {
//
//            return false;
//
//        }
//        return  ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));


    }
}
