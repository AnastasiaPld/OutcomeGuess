import java.util.Scanner;

public class Calculation {

    String team;
    int finalScore;

    public void setTeam(String team) {
        this.team = team;
    }

    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }

    public void outcome(String guess, int score) {


        if (score == finalScore && guess == team) {
            System.out.println("Congratulations you win 100$! Your guess is correct for team and score!");
        } else if (score != finalScore || guess == team) {
            System.out.println("Congratulations you win 10$! Your guess for winning team is correct!");
        } else if (finalScore == score) {
            System.out.println("Congrats your award is 200$. Your guess about the score is correct!");
        } else if (finalScore != score && guess != team) ;
        {
            System.out.println("Your guess is incorrect! No rewards!");

        }
    }

}



