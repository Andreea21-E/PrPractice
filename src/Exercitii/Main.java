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
        System.out.println(result+"\n");

        result = EqualSumChecker.hasEqualSum(1, 1, 2);
        System.out.println(result+"\n");

        result = EqualSumChecker.hasEqualSum(1, -1, 0);
        System.out.println(result+"\n");


        System.out.println("\n" + "******** Number Check *********");
        boolean numberCheck=TeenNumberChecker.hasTeen(9,99,19);
        System.out.println(numberCheck+"\n");

        numberCheck=TeenNumberChecker.hasTeen(23,15,42);
        System.out.println(numberCheck+"\n");

        numberCheck=TeenNumberChecker.hasTeen(22,23,34);
        System.out.println(numberCheck+"\n");



       Boolean numberCheckOneNumber=TeenNumberChecker.isTeen(9);
        System.out.println(numberCheckOneNumber+"\n");

        numberCheckOneNumber=TeenNumberChecker.isTeen(13);
        System.out.println(numberCheckOneNumber+"\n");


        System.out.println("\n" + "******** Method Overloading *********");

        double transformation=MethodOverloading.calcFeetAndInchesToCentimeters(6,10);
// rotunjirea la zecimale se face cu String.format("%.2f", numele variabilei ), 2+ repreyinta numarul de zecimale dupa virgula
        System.out.println("2 decimal return value : " + String.format("%.4f", transformation)+"\n");

      transformation=MethodOverloading.calcFeetAndInchesToCentimeters(7,5);
        System.out.println(String.format("%.4f", transformation)+"\n");

        transformation=MethodOverloading.calcFeetAndInchesToCentimeters(0,1);
        System.out.println(String.format("%.4f", transformation)+"\n");


        MethodOverloading.calcFeetAndInchesToCentimeters(0,1);
        MethodOverloading.calcFeetAndInchesToCentimeters(6,-10);
        MethodOverloading.calcFeetAndInchesToCentimeters(6,0);
    }
}

