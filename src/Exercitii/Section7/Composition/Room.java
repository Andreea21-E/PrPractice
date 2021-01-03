package Exercitii.Section7.Composition;

public class Room {

    private Bed bed;
    private TV tv;
    private Desk desk;

    public Room(Bed bed, TV tv, Desk desk) {
        this.bed = bed;
        this.tv = tv;
        this.desk = desk;
    }

    public void makingBed() {
        System.out.println("Bedroom- making bed");
        bed.make();
    }

    public TV getTv() {
        return tv;
    }

    public Desk getDesk() {
        return desk;
    }


}
