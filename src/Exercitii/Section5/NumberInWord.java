package Exercitii.Section5;

public class NumberInWord {

    public static void printNumberInWord(int number){

        switch (number){
            case 0:
                System.out.println("zero-"+number);
                break;
            case 1:
                System.out.println("one-"+number);
                break;
            case 2:
                System.out.println("two-"+number);
                break;
            case 3:
                System.out.println("three-"+number);
                break;
            case 4:
                System.out.println("four-"+number);
                break;
            case 5:
                System.out.println("five-"+number);
                break;
            case 6:
                System.out.println("six-"+number);
                break;
            case 7:
                System.out.println("seven-"+number);
                break;
            case 8:
                System.out.println("eight-"+number);
                break;
            case 9:
                System.out.println("nine-"+number);
                break;
            default:
                System.out.println(number+" ->this number( less then 0 or bigger then 9 ");



        }
    }
}
