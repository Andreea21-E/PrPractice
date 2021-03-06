package Exercitii.Section6;

public class WallArea {
    private double width;
    private double height;

    public WallArea() {
    }

    public WallArea(double width, double height) {
        this.width = width;
        this.height = height;
        if (width < 0&&height < 0) {
            this.width = 0;
            this.height = 0;
        } else if (width < 0) {
            this.width = 0;
        }
        else if (height < 0){
            this.height = 0;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        if (width < 0) {
            this.width = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        if (height < 0) {
            this.height = 0;
        }
    }

    public double getArea(){
        double area =height*width;
        return area;
    }
}
