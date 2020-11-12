package Exercitii.Section5;

public class ForExercise {
    public static int sum=0;
    public static int count=0;

    public static void sumOfTheFirstFiveNumbersDivideBy3And5(){
        for (int i = 1; i <1000 ; i++) {
            if(i%3==0&&i%5==0){
                System.out.println(i+" it is divide by 3 and 5 ");
                sum+=i;
                count++;
                if (count==5){
                    System.out.println("\n"+" Exit the loop- You find already 5 numbers divide by 3 and 5");
                    break;
                }
            }

        }
        System.out.println(sum+" this is the sum for the first 5 numbers");
    }
}
