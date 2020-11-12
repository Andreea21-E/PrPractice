package Exercitii.Section4;

public class MinutesToYear_DaysCalculator {
    private static double year;
    private static double day;
    private static double hour;
    public static void printYearsAndDays(long minute) {
        if (minute < 0) {
            System.out.println("Invalid value");
        } else if (minute >= 60) {
            int remainingMinutes = (int) (minute % 60);

            hour = minute / 60;
            int remainingHour = (int) (hour % 24);

            day = hour / 24;
            int remainingDay = (int) (day % 365);
            year = day / 365;

            System.out.println(Math.round(year) + "year " + remainingDay + "days " + remainingHour + "hours " + remainingMinutes + "minutes ");
        } else {
            System.out.println(minute + "mintes");
        }
    }
}
