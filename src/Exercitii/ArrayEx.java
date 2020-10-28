package Exercitii;

import com.sun.xml.internal.bind.v2.TODO;

public class ArrayEx {
    public static void main(String[] args) {


        array();
        averageArray();
        maxArray();
//       sumArray();- cum se face sa dai direct parametri din array ?

    }
    static void array(){
        double[] myArray = {3, 2.5, -8, 11};
        // PRINT ALL ELEMENTS
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " " +"\n");
        }
        // SUMMING ALL ELEMENTS
        double total = 0;
        for (int i = 0; i < myArray.length; i++) {
            total = total + myArray[i];
        }
        System.out.print("Total is: " + total+"\n");
    }

    static void averageArray(){
        int[] arrayNumbers={1,7,3,10,9};
        int total= 0;
        System.out.println(total);

        for (int i = 0; i <arrayNumbers.length ; i++) {
           total=total+arrayNumbers[i];
        }
        double average=total/arrayNumbers.length;
        System.out.println(average);
    }


    static void maxArray(){
        int[] numbers={5,4,7,2,9,1};
        int max=0;
//        int max= numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            if (max<numbers[i]){
                max=numbers[i];
            }
        }
        System.out.println(max);
    }

// To Do: this method to work
//    static void sumArray(int[]myArray){
//        int sum=0;
//        for (int i = 0; i <myArray.length ; i++) {
//            sum+=myArray[i];
//
//        }
//        System.out.println(sum);
//    }



  
}
