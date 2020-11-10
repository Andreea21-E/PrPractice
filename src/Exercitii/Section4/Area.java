package Exercitii.Section4;

public class Area {

    private static double area;
    private static double radius;
    private static double length;
    private static double width;


    public static double calculeteArea(double radius) {
        if (radius >= 0) {
            area = Math.PI* (radius * radius);
            return area;
        }
        return -1;
    }

    public static double calculeteArea(double length, double width) {
        if (length >= 0 && width >= 0) {
            area = length * width;
            return area;
        }
        return -1;
    }
}
