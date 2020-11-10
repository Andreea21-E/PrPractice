package Exercitii.Section4;

public class GameExemple {
    public static void main(String[] args) {

//        **For  void method  dispalyHighScorePosition
        int hightscore = calculateHighScorePosition(1500);
        dispalyHighScorePosition("Ion", hightscore);


        hightscore = calculateHighScorePosition(500);
        dispalyHighScorePosition("Maria", hightscore);

        hightscore = calculateHighScorePosition(59);
        dispalyHighScorePosition("Enola", hightscore);

        hightscore = calculateHighScorePosition(1000);
        dispalyHighScorePosition("Razvan", hightscore);


//        **For method  dispalyHighScorePosition is not void

//        System.out.println(dispalyHighScorePosition("Ion",calculateHighScorePosition(1500)));
//        System.out.println(dispalyHighScorePosition("Maria",calculateHighScorePosition(900)));
//        System.out.println(dispalyHighScorePosition("Enola",calculateHighScorePosition(400)));
//        System.out.println(dispalyHighScorePosition("Razvan",calculateHighScorePosition(50)));
    }


//  public static String dispalyHighScorePosition(String playerName,int position){
//     return playerName+" manage to get the position "+position;
//    }

    public static void dispalyHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " manage to get the position " + position);
    }

    public static int calculateHighScorePosition(int playerScore) {


//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }
        int position= 4;
        if (playerScore >= 1000) {
            position =1;
        } else if (playerScore >= 500) {
            position =2;
        } else if (playerScore >= 100) {
             position =3;
        }
        return position;
    }
}
