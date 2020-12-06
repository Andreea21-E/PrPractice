package Exercitii.Section6;
//TODO this class

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }


    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }

//TODO - the distance between the point in this class

    public double distanceBetweenThisPointAndZeroPoint (){
        double distance =Math.sqrt(this.x*this.x+this.y*this.y);
        return distance ;
    }

    public double calculateDistanceXY(int x, int y)
    {
        double distanceXY =Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
        return distanceXY;
    }


}
