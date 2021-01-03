package Exercitii.Section7.Composition;

public class Mattress extends RoomObject {

    private String material;


    public Mattress(int length, int weight, int height, String material) {
        super(length, weight, height);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
