package Exercitii.CompositionEx;

public class MyBed {
    private String style;
    private int pillows;
    private double height;
    private int sheets;
    private int quilt;

    public MyBed(String style, int pillows, double height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }


    public void makeYourBed(){
        System.out.println("The bed is being made");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public double getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
