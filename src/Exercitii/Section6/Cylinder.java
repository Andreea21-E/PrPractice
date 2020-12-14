package Exercitii.Section6;

public class Cylinder extends Circle {

    private double height;

    public double getHeight() {
        return height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height; // initialize the height field
        if (height < 0) {
            this.height = 0;
        }
    }

    public double getVolume() {
        return getArea() * height;
    }
}
