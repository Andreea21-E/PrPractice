package Exercitii.Section7.Polymorphism;

public class Holden extends CarA {
    public Holden(int cylinder, String name) {
        super(cylinder, name);
    }


    public String startEngine() {
        return "The Holden started.";
    }

    public String accelerate() {
        return "The Holden is accelerating now.";
    }


    public String brake() {
        return "The Holden braked.";
    }
}
