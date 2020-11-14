package Exercitii.Section5;

public class WhileExercise {

    public static int count;
    public static int sumEvenNumber;

    public void whileMethod(){
        count=0;
        while (count!=8){
            System.out.println("Count value is "+ count);
            count++;
        }
    }


    public static Boolean isEvenNumber (int number){
        while (number%2==0){
            System.out.println(number+" it is a even number");
            return true;
        }
//        System.out.println(number+"-this is not a even number it is a odd number- put another number ");
        return false;
    }

    public static void printEvenNumbers(int start, int end){
        count=0;
        sumEvenNumber=0;
        while (start<=end){
            start++;
            if(isEvenNumber(start)){
                sumEvenNumber+=start;
                count++;
                if(count==5){
                    System.out.println(sumEvenNumber+"- this is the sum of the first five even numbers");
                    break;
                }
                continue;
            }
        }
    }
}
