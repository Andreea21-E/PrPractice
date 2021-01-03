package Exercitii.Section7.Composition;

public class RoomObject {
    private int length;
    private int weight;
    private int height;

    public RoomObject(int length, int weight, int height) {
        this.length = length;
        this.weight = weight;
        this.height = height;
    }


    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
}
