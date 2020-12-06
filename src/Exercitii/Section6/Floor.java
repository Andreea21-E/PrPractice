package Exercitii.Section6;

public class Floor {
    private double length;
    private double width;

    public Floor(double length, double width) {
        this.length = length;
        this.width = width;

        if (length<=0&&width<=0){
            this.length=0;
            this.width=0;
        }
        else if(length<=0){
            this.length=0;
        }
        else if(width<=0){
            this.width=0;
        }
    }

    public double getArea(){
        double area=length*width;
        return area;
    }
}
