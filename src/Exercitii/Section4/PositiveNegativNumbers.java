package Exercitii.Section4;

public class PositiveNegativNumbers {
    public static void main(String[] args) {
checkNumber(-5);
        checkNumber(0);
        checkNumber(5);
    }
    public static void checkNumber(int number){

        if(number>0){
            System.out.println(number+" is positive number");
        }
        else if(number<0){
            System.out.println(number+" is negative number");
        }
        else
            System.out.println(number+" number is zero");
    }
}
