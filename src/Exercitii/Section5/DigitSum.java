package Exercitii.Section5;

public class DigitSum {
    static int sumDigits;

    public static int printsumDigits(int number){
        if (number<10){
            return -1;
        }
         sumDigits =0;
        while (number>0){
            int digit=number%10;
            sumDigits+=digit;

            number/=10;
        }
        return sumDigits;
    }

}
