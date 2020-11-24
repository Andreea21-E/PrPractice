package Exercitii.Section6;

public class VipCustomer {

    private String vipCustomerName;
    private double vipCustomerCreditLimit;
    private String vipCustomerEmail;

    public VipCustomer() {
        this("default name",5000.00,"default email");
        System.out.println(" Constructor with no parameters was called");
    }

    public VipCustomer(String vipCustomerName, double vipCustomerCreditLimit) {
        this(vipCustomerName,vipCustomerCreditLimit,"default email");

    }

    public VipCustomer(String vipCustomerName, double vipcustomerCreditLimit, String vipCustomerEmail) {
        this.vipCustomerName = vipCustomerName;
        this.vipCustomerCreditLimit = vipcustomerCreditLimit;
        this.vipCustomerEmail = vipCustomerEmail;
    }

    public String getVipCustomerName() {
        return vipCustomerName;
    }

    public double getVipcustomerCreditLimit() {
        return vipCustomerCreditLimit;
    }

    public String getVipCustomerEmail() {
        return vipCustomerEmail;
    }
}
