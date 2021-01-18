package Exercitii.Section7.Polymorphism;

public class Ford extends CarA {
    public Ford(int cylinder, String name) {
        super(cylinder, name);
    }


    public String startEngine() {
        return "The Ford started.";
    }

    public String accelerate() {
        return "The Ford is accelerating now.";
    }


    public String brake() {
        return "The Ford braked.";
    }
}
