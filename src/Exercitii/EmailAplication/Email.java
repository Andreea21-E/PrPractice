package Exercitii.EmailAplication;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String department;
    private int defaultPasswordLength = 10;
    private int mailBoxCapacity;
    private String alternateEmail;
    private String companySuffix = "woodcompany.com";

    // TODO -constructor with the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created for: " + this.firstName + " " + this.lastName);

        // Call a method asking for the department - return the department;
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // call a method that returns a random password;
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your random password is:" + this.password);

        email = firstName.toLowerCase() + "."
                + lastName.toLowerCase() + "@"
                + department.toLowerCase() + "."
                + companySuffix.toLowerCase();
        System.out.println("Email created is: " + email);

    }


    // TODO -ask for the department

    public String setDepartment() {
        System.out.print("Enter the department you are in:" +
                "\n1.Sales" +
                "\n2.Development" +
                "\n3.Accounting" +
                "\n4.None");

        Scanner scanner = new Scanner(System.in);
        int chosenDepartment = scanner.nextInt();
        if (chosenDepartment == 1) {
            return "sales";
        } else if (chosenDepartment == 2) {
            return "development";
        } else if (chosenDepartment == 2) {
            return "development";
        } else if (chosenDepartment == 3) {
            return "accounting";
        } else {
            return "";
        }
    }

    // TODO -generate the random password

    public String randomPassword(int length) {

        String passwordCaracters = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789~!@#$%^&*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int randomcaracter = (int) (Math.random() * passwordCaracters.length());
            password[i] = passwordCaracters.charAt(randomcaracter);

//            System.out.println(randomcaracter);  - index-ul random
//            System.out.println(passwordCaracters.charAt(randomcaracter)); -  carcaterul indexului random
        }

        return new String(password);

    }

    // TODO -set the mailbox capacity

    // TODO -set the alternate email

    // TODO - change the password


}
