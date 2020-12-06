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

//    public double distanceWithoutAnyParameters(){
//        double distance =(point.getX() - point1.getX())*(point.getX() - point1.getX())+(point.getY() - point1.getY())*(point.getY() - point1.getY());
//        return ;
//    }

    public double distanceXY(int x, int y){
        return x-y;
    }


}
