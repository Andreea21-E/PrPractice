package Exercitii.CompositionEx;

import java.awt.*;

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private MyBed myBed;
    private Ceiling ceiling;
    private Lamp lamp;


    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, MyBed myBed, Ceiling ceiling, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.myBed = myBed;
        this.ceiling = ceiling;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }


    public void makeBed() {
        System.out.println("The bed must to be made.");
        myBed.makeYourBed();
    }

}
