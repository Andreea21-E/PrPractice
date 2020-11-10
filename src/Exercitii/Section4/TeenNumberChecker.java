package Exercitii.Section4;

public class TeenNumberChecker {
    public static Boolean hasTeen(int firstNumber,int secondNumber, int thirdNumber){
        if((firstNumber>=13&&firstNumber<=19)||(secondNumber>=13&&secondNumber<=19)||(thirdNumber>=13&& thirdNumber<=19)){
            System.out.println("True");
            return true;
        }
        else {
            System.out.println("False");
            return false;
        }
    }


    public static Boolean isTeen(int oneNumber){
        if(oneNumber>=13&&oneNumber<=19){
            System.out.println("**True");
            return true;
        }
        else {
            System.out.println("**False");
            return false;
        }

    }

}
