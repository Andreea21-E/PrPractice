package Exercitii.Section7.OOP;

public class HealthyBurger extends Hamburger {

    private String healthyAddition1Name;
    private double healthyAddition1Price;

    private String healthyAddition2Name;
    private double healthyAddition2Price;

    public HealthyBurger( String meat, double basicBurgerPrice) {
        super("Healthy burger", "Brown rye", meat, basicBurgerPrice);

    }

    public void addHealthyAddition1Name(String name, double price) {
        this.healthyAddition1Name = name;
        this.healthyAddition1Price = price;
    }

    public void addHealthyAddition2Name(String name, double price) {
        this.healthyAddition2Name = name;
        this.healthyAddition2Price = price;
    }


    @Override
    public double calculateTotalPriceForBurger() {
        double healthyBurgerPrice= super.calculateTotalPriceForBurger();
        if (healthyAddition1Name!=null){
            healthyBurgerPrice+=healthyAddition1Price;
            System.out.println("Additional added:" + this.healthyAddition1Name+"-> additional price: "+ this.healthyAddition1Price);
        }
        if (healthyAddition2Name!=null){
            healthyBurgerPrice+=healthyAddition2Price;
            System.out.println("Additional added:" + this.healthyAddition2Name+"-> additional price: "+ this.healthyAddition2Price);
        }
        return healthyBurgerPrice;
    }
}
