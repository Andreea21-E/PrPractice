package Exercitii;

public class IfClass {
    public static void main(String[] args) {
        ifClass(5, 7);
        evenOrOdd(6);
        year(2020);
        fizzBuzz(5);
        tryEx(15);
    }

    static void ifClass(Integer a, Integer b) {
        if (a > b) {
            System.out.println("a is gratter than b");
        } else {
            System.out.println("a is not gratter than b");
        }
    }


    static void evenOrOdd(Integer a) {
        if (a % 2 == 0) {
            System.out.println("a=" + a + " it is a even number");
        } else {
            System.out.println("a=" + a + " it is a odd number");
        }
    }

    static void year(int typeOfYear) {

        if ((typeOfYear % 4 == 0 && typeOfYear % 100 != 0) || (typeOfYear % 400 == 0 && typeOfYear % 100 != 0)) {
            System.out.println(typeOfYear+" The year is leap");
        } else {
            System.out.println(typeOfYear+" The year is not leap");
        }

    }

    static void fizzBuzz(int a) {
        if (a % 3 == 0&& a % 5 == 0) {
                System.out.println("fizzbuzz");
            }
        else if(a % 3 == 0) {
            System.out.println("fizz");
        }
        else if (a % 5 == 0){
            System.out.println("buzz");
        }
        else {
            System.out.println(a+"=this number is not divide by 3 or 5 ");
        }
    }

    static void tryEx(int a){
        System.out.println(a/3);
        System.out.println(a/5);
    }


    static void compareTwoNumbers(int a, int b){
      if(a>b)  {
          System.out.println(a);
      }
    }
}

