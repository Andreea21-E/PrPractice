package Exercitii;

import Exercitii.Section4.*;
import Exercitii.Section5.*;
import Exercitii.Section6.Calculator;

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
        double roundedArea = Area.calculeteArea(5.0);
        System.out.println(String.format("%.4f", roundedArea));
        System.out.println(Area.calculeteArea(-3));
        System.out.println(Area.calculeteArea(0));

        System.out.println("*****Area rectangle *****");
        System.out.println(Area.calculeteArea(5.0, 4.0));
        System.out.println(Area.calculeteArea(-5.0, 4.0));


        System.out.println("*****Minutes to years and days *****");

        MinutesToYear_DaysCalculator.printYearsAndDays(525600);
        MinutesToYear_DaysCalculator.printYearsAndDays(1051200);
        MinutesToYear_DaysCalculator.printYearsAndDays(561600);


        System.out.println("\n" + "*****Equality Printer*****");
        EqualityPrinter.printEqual(1, -1, 1);
        EqualityPrinter.printEqual(0, 0, 0);
        EqualityPrinter.printEqual(1, 0, 0);
        EqualityPrinter.printEqual(1, 2, 3);


        System.out.println("\n" + "***** Playing Cat *****");

        Boolean playingCat1 = PlaingCat.isCatPlaying(true, 10);
        System.out.println(playingCat1);

        Boolean playingCat2 = PlaingCat.isCatPlaying(false, 36);
        System.out.println(playingCat2);

        Boolean playingCat3 = PlaingCat.isCatPlaying(false, 35);
        System.out.println(playingCat3);


        System.out.println("\n" + "***** Swich Statemt *****");

        SwichEx.switchStatement(1);
        SwichEx.switchStatement(2);
        SwichEx.switchStatement(3);
        SwichEx.switchStatement(4);
        SwichEx.switchStatement(5);
        SwichEx.switchStatement(10);
        System.out.println("\n");

        SwichEx.switchAlphabet('A');
        SwichEx.switchAlphabet('B');
        SwichEx.switchAlphabet('C');
        SwichEx.switchAlphabet('D');
        SwichEx.switchAlphabet('E');
        SwichEx.switchAlphabet('W');


        SwichEx.switchSeasons("SuMmeR");

        System.out.println("\n" + "***** Day of the week *****");
        DayOfTheWeek.printDayOfTheWeek(-1);
        DayOfTheWeek.printDayOfTheWeekWithIfStatement(1);


        System.out.println("\n" + "***** Number from 0 to 9 *****");
        NumberInWord.printNumberInWord(-1);
        NumberInWord.printNumberInWord(0);
        NumberInWord.printNumberInWord(9);
        NumberInWord.printNumberInWord(10);


        System.out.println("\n" + "***** Leap year: *****");
        System.out.println(Leap_Year.isLeapYear(-1600));
        System.out.println(Leap_Year.isLeapYear(1600));
        System.out.println(Leap_Year.isLeapYear(2017));
        System.out.println(Leap_Year.isLeapYear(2000));


        System.out.println("\n" + "***** Bank interest *****");
        BankInterest.printInterest();


        System.out.println("\n" + "***** Prime Numbers *****");
        PrimeNumber.findTheFirstThreePrimeNumber();

        System.out.println("\n" + "*****  The sum of the first 5 numbers  divide by 3 and 5*****");
        ForExercise.sumOfTheFirstFiveNumbersDivideBy3And5();

//
//        System.out.println(new SumOdd().calculateSumOdd(100, 100));
//        System.out.println(new SumOdd().calculateSumOdd(13, 13));
//        System.out.println(new SumOdd().calculateSumOdd(1, 100));


        System.out.println("\n" + "*****  The sum of the odd number*****");
        System.out.println(SumOdd.calculateSumOdd(1, 100));
        System.out.println(SumOdd.calculateSumOdd(-1, 100));
        System.out.println(SumOdd.calculateSumOdd(100, 100));
        System.out.println( SumOdd.calculateSumOdd(13, 13));
        System.out.println( SumOdd.calculateSumOdd(100, -100));
        System.out.println( SumOdd.calculateSumOdd(100, 1000));

        System.out.println("\n" + "*****  The even number with while *****");
        WhileExercise.isEvenNumber(11);
        WhileExercise.printEvenNumbers(2,25);// it will not include the first number, 2 in this case


        System.out.println("\n" + "*****  The sum of the digits *****");
        System.out.println(new DigitSum().printsumDigits(32123));
        System.out.println(new DigitSum().printsumDigits(1526));

        System.out.println("\n" + "*****  Section 6 *****");
        System.out.println("\n" + "*****  Calculator *****");

        Calculator calculator= new Calculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("Add="+calculator.getAdditionResult());
        System.out.println("Subtract="+calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("Multiply="+calculator.getMultiplicationResult());
        System.out.println("Divide="+calculator.getDivisionResult());
    }
}

