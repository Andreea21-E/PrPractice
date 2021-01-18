package Exercitii.Section7.Polymorphism;

public class CarA {

    private boolean engine;
    private int cylinder;
    private String name;
    private int wheels;

    public CarA(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "The car started.";
    }

    public String accelerate() {
        return "The car is accelerating now.";
    }


    public String brake() {
        return "The car braked.";
    }


}
