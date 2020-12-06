package Exercitii.Section6;

public class Carpet {
    private double carpetCost;

    public Carpet(double carpetCost) {
        this.carpetCost = carpetCost;
        if (carpetCost<=0){
            this.carpetCost=0;
        }
    }

    public double getCarpetCost(){
        return carpetCost;
    }


}
