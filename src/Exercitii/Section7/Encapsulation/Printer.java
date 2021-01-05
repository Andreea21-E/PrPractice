package Exercitii.Section7.Encapsulation;

public class Printer {
    public int tonerLevel;
    private int numberOfPage;
    private boolean duplexPrinter;
    private int fillToner;
    private int pagePrinted;


    public Printer(int tonerLevel, int numberOfPage, boolean duplexPrinter) {
        this.tonerLevel = tonerLevel;
        if (tonerLevel > 100) {
            System.out.println("The level of the toner is " + tonerLevel + " this must be less then 100%.");
            tonerLevel = 100;
            this.tonerLevel = tonerLevel;
            System.out.println("The toner is been filled correctly now. Toner level is:" + tonerLevel);
        } else if (tonerLevel <= 15 && tonerLevel > 0) {
            System.out.println("You must to fill the toner for the printer because  the level is: " + tonerLevel + "%");
        } else if (tonerLevel <= 0) {
            fillTheTonner();
        }
        this.numberOfPage = numberOfPage;
        this.duplexPrinter = duplexPrinter;
    }


    public int fillTheTonner() {
        if (tonerLevel <= 100 && tonerLevel >= 0) {
            fillToner = 100 - tonerLevel;
            System.out.println("The toner has been filled with " + fillToner);
            return fillToner;
        } else {
            System.out.println("\nThe toner does't need to be filled " + "\n the level of the toner is " + tonerLevel);
            return fillToner;
        }
    }

    public int printingPage(int pagePrinted) {
        if (pagePrinted > numberOfPage) {
            System.out.println("Error- you don't have enough page.You must to put in the printer:" + (pagePrinted - numberOfPage) + " page");
            return -1;
        }
        System.out.println("The number of page left is:" + (numberOfPage - pagePrinted) + "\nPage printed are: " + pagePrinted);
        return numberOfPage - pagePrinted;
    }

//TODO - the method printBothSide is not working

//    public int printBothSide(){
//        int pageOnBothSide=pagePrinted/2+ pagePrinted%2;
//        if(duplexPrinter){
//            System.out.println("Page printed are:" +pageOnBothSide);
//          return printingPage(pageOnBothSide);
//        }
//        else {
//            System.out.println("Error of printing on both sides");
//            return -1;
//        }
//}
}

