package Exercitii.Section4;

public class Array {
//    Write a Java program to calculate the
//    average value of array elements: [1, 7, 3,10, 9].

    public static void AverageValue(int[] array){
       int average=0;
        for (int i = 0; i <array.length; i++) {
           average+=array[i];
        }
        average=average/array.length;
        System.out.println(average);
    }

//    Write a Java program to print all odd
//    numbers from an array: [1, 7, 3, 10, 9].

    public static void oddNumbersArray(int[] oddArray){
//        int[] oddArray={ 1,7,2,10,9};

        for (int i = 0; i <oddArray.length ; i++) {
            if((oddArray[i]%2)!=0){
                System.out.println(oddArray[i]+" -Odd number");

            }
            else {
                System.out.println(oddArray[i]+" -even number");

            }

        }
    }
//    Write a Java program to reverse an array
//    of integer values: [1, 7, 3, 10, 9]

    public static void reverseArray(){
        int[] reverseNumber={1, 7, 3, 10, 9};
        for (int i = 0; i <reverseNumber.length ; i++) {
            reverseNumber[i]=reverseNumber[reverseNumber.length-(i+1)];
            System.out.println(reverseNumber[i]);
        }
    }
}
