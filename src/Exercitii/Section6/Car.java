package Exercitii.Section6;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    public Car(String name, int height, int length, String width, int currentSpeed, int doors,  boolean isManual) {
        super(name, height, length, width, currentSpeed);
        this.wheels = 4;
        this.doors = doors;
        this.gears = 1;
        this.isManual = isManual;
    }

}
