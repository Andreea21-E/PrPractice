package Exercitii.Section5;

public class SwichEx {

    public static void switchStatement(int value) {

        switch (value) {
            case 1:
                System.out.println("1.The value is " + value);
                break;
            case 2:
                System.out.println("2.The value is " + value);
                break;
            case 3:
                System.out.println("3.The value is " + value);
                break;
            case 4:
                System.out.println("4.The value is " + value);
                break;
            case 5:
                System.out.println("5.The value is " + value);
                break;
            default:
                System.out.println("Please type again a number");
        }
    }

    public static void switchAlphabet(char alphabetValue) {
        switch (alphabetValue) {
            case 'A':
                System.out.println("A.The letter is " + alphabetValue);
                break;
            case 'B':
                System.out.println("B.The letter is " + alphabetValue);
                break;
            case 'C':
                System.out.println("C.The letter is " + alphabetValue);
                break;
            case 'D':
                System.out.println("D.The letter is " + alphabetValue);
                break;
            case 'E':
                System.out.println("E.The letter is " + alphabetValue);
                break;
            default:
                System.out.println("Error:Type again the correct letter");
        }
    }

    public static void switchSeasons(String season) {
        switch (season.toLowerCase()) {
            case "spring":
                System.out.println("A.The letter is " + season.toUpperCase());
                break;
            case "summer":
                System.out.println("B.The letter is " + season.toUpperCase());
                break;
            case "autumn":
                System.out.println("C.The letter is " + season.toUpperCase());
                break;
            case "winter":
                System.out.println("D.The letter is " + season.toUpperCase());
                break;

            default:
                System.out.println("Error:Type again the correct season");
        }
    }
}
