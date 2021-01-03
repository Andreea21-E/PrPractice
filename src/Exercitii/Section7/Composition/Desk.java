package Exercitii.Section7.Composition;

public class Desk extends RoomObject {

    private String color;

    public Desk(int length, int weight, int height, String color) {
        super(length, weight, height);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
