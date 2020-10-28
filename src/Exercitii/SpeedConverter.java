package Exercitii;

public class SpeedConverter {
    public static void main(String[] args) {

        System.out.println(toMilesPerHour(13.51));
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));
//
//        double kilometersPerHour=13.51;
//        System.out.println(kilometersPerHour+"km/h = "+toMilesPerHour(kilometersPerHour)+"mil/h");
//
//        kilometersPerHour=1.5;
//        System.out.println(kilometersPerHour+"km/h = "+toMilesPerHour(kilometersPerHour)+"mil/h");


        printConversation(25.41);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour <= 0) {
            return -1;
        } else {
            long milesPerHour = (long) Math.round((kilometersPerHour / 1.609));
            return milesPerHour;
        }
    }

    public static void printConversation(double kilometersPerHour) {

        if (kilometersPerHour <= 0) {
            System.out.println("invalid value");
        } else {
            double milesPerHours = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h = " + toMilesPerHour(kilometersPerHour) + "mil/h");
        }

    }

}


