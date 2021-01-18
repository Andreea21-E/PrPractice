package Exercitii.Section7.Polymorphism;

public class Mitsubishi extends CarA {
    public Mitsubishi(int cylinder, String name) {
        super(cylinder, name);
    }

    public String startEngine() {
        return "The Mitsubishi started.";
    }

    public String accelerate() {
        return "The Mitsubishi is accelerating now.";
    }


    public String brake() {
        return "The Mitsubishi braked.";
    }
}
