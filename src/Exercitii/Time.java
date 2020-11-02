package Exercitii;

public class Time {
    private static int hour;
    private static long minute;
    private static long second;
    private static long remainingMinute;
    private static long remainingSecond;

    public static String getStringTime(long minute, long second) {

        if (minute >= 0 && (second >= 0 && second < 60)) {
            hour = (int) minute / 60;
            remainingMinute = (int) minute % 60;

            return hour + "hh " + remainingMinute + "mm " + second + "ss";
        } else
            return "Invalid value";
    }

    public static String getStringTime(long second) {
        if (second >= 60) {
            minute=second/60;
            remainingSecond=second%60;
            return getStringTime(minute,remainingSecond);
        }
        else
            return "Invalid value";
    }
}
