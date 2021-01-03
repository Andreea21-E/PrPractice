package Exercitii.CompositionEx;

public class Lamp {
    private String style;
    private Boolean battery;
    private int globRating;

    public Lamp(String style, Boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }


    public void turnOn(){
        System.out.println("The lamp is turn on");
    }

    public String getStyle(){
        return style;
    }
    public int getGlobRating(){
        return globRating;
    }

}
