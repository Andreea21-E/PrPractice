package Exercitii.Section5;

public class PrimeNumber {
    public static int count = 0;

    public static Boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void findTheFirstThreePrimeNumber() {
        for (int i = 5; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("The number " + i + " it is a prime number");
                if (count == 3) {
                    System.out.println("Exist the loop  because we found 3 prime numbers");
                    break;
                }
            }

        }

    }
}
