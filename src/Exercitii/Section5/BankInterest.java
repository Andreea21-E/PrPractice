package Exercitii.Section5;

public class BankInterest {


    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));

    }


    public static void printInterest() {

        for (int i = 2; i < 5; i++) {
//            System.out.println("10 000 at "+i+"% interest = "+BankInterest.calculateInterest(10000, i));
            System.out.println("10 000 at " + i + "% interest = " + String.format("%.2f", BankInterest.calculateInterest(10000, i)));
        }
        System.out.println("\n**************");

        for (int i = 8; i >= 2; i--) {
//            System.out.println("10 000 at "+i+"% interest = "+BankInterest.calculateInterest(10000, i));
            System.out.println("10 000 at " + i + "% interest = " + String.format("%.2f", BankInterest.calculateInterest(10000, i)));
        }

    }
}



