package Exercitii.Section6;

public class Animal {

    private String name;
    private String body;
    private int size;
    private int weight;

    public Animal(String name, String body, int size, int weight) {
        this.name = name;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
