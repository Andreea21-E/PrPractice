package Exercitii;

public class Main {
    public static void main(String[] args) {

        System.out.println("******** Convert Kilometers to miles *********");
        long miles = SpeedConverter.toMilesPerHour(10);
        System.out.println("Miles=" + miles);
        SpeedConverter.printConversation(10);

        System.out.println("\n" + "******** Convert kiloBytes to megaBytes *********");
        Convertor.printMegaBytesAndKiloBytes(2500);
        Convertor.printMegaBytesAndKiloBytes(-1024);
        Convertor.printMegaBytesAndKiloBytes(5000);

        System.out.println("\n" + "******** Barking dog *********");


//        DogNoise.shouldWakeUp(true,1);
//        DogNoise.shouldWakeUp(false,2);

        System.out.println("\n" + "******** Has equal sum *********");

        boolean result = EqualSumChecker.hasEqualSum(1, 1, 1);
        System.out.println(result + "\n");

        result = EqualSumChecker.hasEqualSum(1, 1, 2);
        System.out.println(result + "\n");

        result = EqualSumChecker.hasEqualSum(1, -1, 0);
        System.out.println(result + "\n");


        System.out.println("\n" + "******** Number Check *********");
        boolean numberCheck = TeenNumberChecker.hasTeen(9, 99, 19);
        System.out.println(numberCheck + "\n");

        numberCheck = TeenNumberChecker.hasTeen(23, 15, 42);
        System.out.println(numberCheck + "\n");

        numberCheck = TeenNumberChecker.hasTeen(22, 23, 34);
        System.out.println(numberCheck + "\n");


        Boolean numberCheckOneNumber = TeenNumberChecker.isTeen(9);
        System.out.println(numberCheckOneNumber + "\n");

        numberCheckOneNumber = TeenNumberChecker.isTeen(13);
        System.out.println(numberCheckOneNumber + "\n");


        System.out.println("\n" + "******** Method Overloading *********");

        double transformation = MethodOverloading.calcFeetAndInchesToCentimeters(6, 10);
// rotunjirea la zecimale se face cu String.format("%.2f", numele variabilei ), 2+ repreyinta numarul de zecimale dupa virgula
        System.out.println("2 decimal return value : " + String.format("%.4f", transformation) + "\n");

        transformation = MethodOverloading.calcFeetAndInchesToCentimeters(7, 5);
        System.out.println(String.format("%.4f", transformation) + "\n");

        transformation = MethodOverloading.calcFeetAndInchesToCentimeters(0, 1);
        System.out.println(String.format("%.4f", transformation) + "\n");


        MethodOverloading.calcFeetAndInchesToCentimeters(0, 1);
        MethodOverloading.calcFeetAndInchesToCentimeters(6, -10);
        MethodOverloading.calcFeetAndInchesToCentimeters(6, 0);
        MethodOverloading.calcFeetAndInchesToCentimeters(-10, -90);
        MethodOverloading.calcFeetAndInchesToCentimeters(6, 13);


        MethodOverloading.calcFeetAndInchesToCentimeters(100);
        MethodOverloading.calcFeetAndInchesToCentimeters(157);
        MethodOverloading.calcFeetAndInchesToCentimeters(-10);
//
//
//        System.out.println("\n" + "******** Hour/Minutes/ Seconds *********");
//        MinuteSecond.getDurationString(10, 0);
//        MinuteSecond.getDurationString(-1, -3);
//        MinuteSecond.getDurationString(130, 59);
//        MinuteSecond.getDurationString(122);
//        int seconds=MinuteSecond.getDurationString(120);
//        System.out.println(seconds);

        System.out.println("*****Average of the array {1, 7, 3, 10, 9}*****");
        Array.AverageValue(new int[]{1, 7, 3, 10, 9});
        System.out.println("****Odd numbers  from the array new int[]{1, 7, 3, 10, 9} ******");
        Array.oddNumbersArray(new int[]{1, 7, 3, 10, 9});
        Array.reverseArray();


        System.out.println("*****Time*****");
        System.out.println(Time.getStringTime(366, 59));
        System.out.println(Time.getStringTime(3758));


        System.out.println("*****Area Circle *****");
        System.out.println(Area.calculeteArea(5.0));
        double roundedArea=Area.calculeteArea(5.0);
        System.out.println(String.format("%.4f", roundedArea));
        System.out.println(Area.calculeteArea(-3));
        System.out.println(Area.calculeteArea(0));

        System.out.println("*****Area rectangle *****");
        System.out.println(Area.calculeteArea(5.0, 4.0));
        System.out.println(Area.calculeteArea(-5.0, 4.0));
    }
}

