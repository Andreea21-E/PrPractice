package Exercitii.Section6;

public class Dog extends Animal {

    private String skin;

    public Dog(String name, String body, int size, int weight, String skin) {
        super(name, body, size, weight);
        this.skin = skin;
    }

    public Dog(String name, String body, int size, int weight)
    {
        super(name, body, size, weight);
    }
}
