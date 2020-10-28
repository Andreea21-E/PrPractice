package Exercitii;

public class MethodOverloading {
    static double centimeters = 0;


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet>=0)&&(inches >=0 && inches <=12)){
            centimeters= (feet * 30.48)+(inches / 0.39370);
            System.out.println(feet+"feet + "+inches+"inches = "+ String.format("%.4f", centimeters)+" centimeters");
            return centimeters;

        } else {

            System.out.println("Error- Invalid inches or feet");
            return -1;
        }

    }


    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            centimeters = inches / 0.39370;
            System.out.println(centimeters);
            return centimeters;

        } else {
            return -1;
        }

    }
}
