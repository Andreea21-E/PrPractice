package Exercitii.Section7.Composition;

public class TV  extends RoomObject{

    private String brandCompany;

    public TV(int length, int weight, int height, String brandCompany) {
        super(length, weight, height);
        this.brandCompany = brandCompany;
    }
}
