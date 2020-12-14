package Exercitii.Section6;

public class Vehicle {


    private String name;
    private int height;
    private int length;
    private String width;
    private int currentSpeed;

    public Vehicle(String name, int height, int length, String width, int currentSpeed) {
        this.name = name;
        this.height = height;
        this.length = length;
        this.width = width;
        this.currentSpeed = 0;
    }

    public void speedVehicle(int speed){
        this.currentSpeed+=speed;
        System.out.println("Current speed is:"+ currentSpeed);
    }

    public void stopVehicle(){
        this.currentSpeed=0;
        System.out.println("Current speed is:"+ currentSpeed);
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public String getWidth() {
        return width;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
