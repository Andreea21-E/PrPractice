package Exercitii.Section6;

public class BankAccount {
    private String accountNumber;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;
    private double balance;


    public BankAccount() {
        this("default number","Default name","default email","074..", 0.00);
        System.out.println("Empty constructor called");
    }
    public BankAccount(String accountNumber, String customerName, String customerEmail, String customerPhoneNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
        System.out.println("\n"+"Account number: "+ accountNumber+"\n"
       +"Customer Name:"+customerName+"\n"
                +"Email: "+customerEmail+"\n"
                +"Phone Number: "+customerPhoneNumber+"\n"
                +"Balance: "+balance +"\n");
    }

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }


    public void getDepositFund(double depositFund){
        this.balance=balance+depositFund;
        System.out.println("You make a deposit of "+depositFund+" Your new balance is "+ balance);

    }

    public void getWithdrawFund(double withdrawFund){
        if(withdrawFund>=this.balance ){
            System.out.println("You don't have enough funds. "+"Your current balance is "+ this.balance);

        }
        else {
            this.balance=balance-withdrawFund;
            System.out.println("Your new balance is "+ this.balance +" Withdrawal of "+ withdrawFund +" porcessed");

        }

    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return customerEmail;
    }

    public void setEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }



}
