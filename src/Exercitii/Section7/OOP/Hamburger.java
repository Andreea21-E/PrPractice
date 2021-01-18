package Exercitii.Section7.OOP;

public class Hamburger {
    private String hamburgerName;
    private String breadRoll;
    private String meat;
    private double basicBurgerPrice;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String hamburgerName, String breadRoll, String meat, double basicBurgerPrice) {
        this.hamburgerName = hamburgerName;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.basicBurgerPrice = basicBurgerPrice;
    }


    public void addAddition1Name(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addAddition2Name(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addAddition3Name(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addAddition4Name(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double calculateTotalPriceForBurger() {
        double hamburgerPrice = this.basicBurgerPrice;

        System.out.println(
                "Burger name: " + hamburgerName + "\n" +
                        "Bread roll:" + this.breadRoll + "\n" +
                        "Meat:" + this.meat + "\n" +
                        "Basic price: " + this.basicBurgerPrice );
        if (this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Additional added:" + this.addition1Name+"-> additional price: "+ this.addition1Price);
        }
        if (this.addition2Name != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Additional added:" + this.addition2Name +"-> additional price "+ this.addition2Price);
        }
        if (this.addition3Name != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Additional added:" + this.addition3Name+"-> additional price "+ this.addition3Price);
        }
        if (this.addition4Name != null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Additional added:" + this.addition4Name+"-> additional price "+ this.addition4Price);
        }

//        return "Total price: "+String.format("%.2f", hamburgerPrice);
        return hamburgerPrice;
    }

}
