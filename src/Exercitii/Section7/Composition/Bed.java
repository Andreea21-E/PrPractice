package Exercitii.Section7.Composition;

public class Bed extends RoomObject{
    private int bedFeets;
    private Mattress bedMattress;

    public Bed(int length, int weight, int height, int bedFeets, Mattress bedMattress) {
        super(length, weight, height);
        this.bedFeets = bedFeets;
        this.bedMattress = bedMattress;
    }

    public int getBedFeets() {
        return bedFeets;
    }

    public Mattress getBedMattress() {
        return bedMattress;
    }

    public void make(){
        System.out.println("Bed is made");
    }
}
