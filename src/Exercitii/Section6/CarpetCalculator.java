package Exercitii.Section6;

public class CarpetCalculator {

    private Floor floor;
    private Carpet carpet;


    public CarpetCalculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public  double getTotalCost(){
        double totalCost=floor.getArea()*carpet.getCarpetCost();
        return totalCost;
    }
}
