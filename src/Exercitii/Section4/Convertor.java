package Exercitii.Section4;

public class Convertor {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {


        //print the original value kiloBytes 1024kB= 1MB
        // print the calculated megabytes
        // print the calculated remaining kiloBytes

        int remaining_kiloBytes;
        int megaBytes;


        if (kiloBytes > 0) {
            megaBytes = kiloBytes / 1024;
            remaining_kiloBytes = kiloBytes % 1024;
            System.out.println("original value kiloBytes="+kiloBytes+"KB" +"\n"+
                    "calculated megabytes="+megaBytes+"MB"+"\n"+
                    "remaining kiloBytes="+remaining_kiloBytes+"KB");
            System.out.println("--------------");
            System.out.println(kiloBytes+"KB" +"="+
                    megaBytes+"MB"+" and "+
                    +remaining_kiloBytes+"KB"+"\n");
        } else {
            System.out.println("Invalid value"+"\n");
        }

    }
}
