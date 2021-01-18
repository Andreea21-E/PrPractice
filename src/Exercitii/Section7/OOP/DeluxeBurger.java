package Exercitii.Section7.OOP;

public class DeluxeBurger extends Hamburger {


    public DeluxeBurger() {
        super("Deluxe burger", "white", "bacon", 15.6);
        super.addAddition1Name("Chips",3);
        super.addAddition2Name("Drink", 2.5);
    }


    @Override
    public void addAddition1Name(String name, double price) {
        System.out.println("For this menu you can't add anything else extra");
    }

    @Override
    public void addAddition2Name(String name, double price) {
        System.out.println("For this menu you can't add anything else extra");
    }

    @Override
    public void addAddition3Name(String name, double price) {
        System.out.println("For this menu you can't add anything else extra");
    }

    @Override
    public void addAddition4Name(String name, double price) {
        System.out.println("For this menu you can't add anything else extra");
    }
}
