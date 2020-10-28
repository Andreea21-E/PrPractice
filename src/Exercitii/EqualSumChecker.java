package Exercitii;

public class EqualSumChecker {

    public static Boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber) {
        int sum = firstNumber + secondNumber;
        if (sum == thirdNumber) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;

        }
    }
}
