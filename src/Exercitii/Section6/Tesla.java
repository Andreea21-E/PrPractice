package Exercitii.Section6;

public class Tesla extends Car {

    private int electricRange;


    public Tesla(String name, int height, int length, String width, int currentSpeed, int doors, boolean isManual, int electricRange) {
        super(name, height, length, width, currentSpeed, doors, isManual);
        this.electricRange = electricRange;
    }

    public int getElectricRange() {
        return electricRange;
    }

    public void setElectricRange(int electricRange) {
        this.electricRange = electricRange;
    }
}
