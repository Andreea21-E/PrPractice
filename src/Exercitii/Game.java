package Exercitii;

public class Game {
    public static void main(String[] args) {

// pentru a putea salva scorul final din metuda trebuie sa returnam valorea si apoi sa o printam

//        int scoreVoid= calculateScore(true,500,2,100);- aceasta  linie nu este coreta pentru ca metoda calculateScore nu ne returneaza un int

int score = calculateScoreReturnValue(true,500,2,100);
        System.out.println(score);

        //cast from int to short
    short scoreDouble=(short) calculateScoreReturnValue(true,500,2,100);
        System.out.println(scoreDouble);
    }

   public static void calculateScore( boolean gameOver,int score, int levelComplete, int bonus ){
//       boolean gameOver = true;
       int finalScore = 0;

       if (gameOver) {
           finalScore = score + (levelComplete * bonus);
           finalScore+=2000;
       }
       else {
           finalScore=-1;
       }
       int savedScore = finalScore;
       System.out.println("Your final score is " + savedScore);


   }

    public static int calculateScoreReturnValue( boolean gameOver,int score, int levelComplete, int bonus ){
//       boolean gameOver = true;
        int finalScore = 0;

        if (gameOver) {
            finalScore = score + (levelComplete * bonus);
            finalScore+=2000;
            return finalScore;
        }
        else {
          return -1;
        }
    }



}

