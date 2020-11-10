package Exercitii.Section4;

public class DogNoise {

    public static Boolean shouldWakeUp(boolean barking,int hourOfDay){
        if (hourOfDay<=8||hourOfDay>22){
            System.out.println("We must to wake up it is "+hourOfDay);
            return true;
        }
        else if(hourOfDay<0|| hourOfDay>23) {
            System.out.println(hourOfDay+" Error -This hour doesn't  exist");
            return false;
        }
        else {
            System.out.println("It is day you can sleep if you want "+"the hour is"+hourOfDay);
            return false;
        }

    }
}
