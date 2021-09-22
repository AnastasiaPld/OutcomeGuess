import java.util.Scanner;

public class Calculation {
    public Calculation(String team, int finalScore) {
        this.team = team;
        this.finalScore = finalScore;
        System.out.println("Outcome of this season play is:" + team + " " + finalScore);
    }

    String team;
    int finalScore;
//
//    public void setTeam(String team) {
//        this.team = team;
//    }
//
//    public void setFinalScore(int finalScore) {
//        this.finalScore = finalScore;
//    }

    public String outcome(String guess, int score) {
        String prize;

        if (score == finalScore && guess == team) {
            prize = "300$";
           return prize + " " + String.format("Congratulations you win is %s. Your guess is correct for team and score!", prize);
        } else if (score != finalScore || guess == team) {
            prize = "10$";
            return prize + " " +  String.format("Congratulations you win is %s. Your guess for winning team is correct!", prize);
        } else if (finalScore == score || guess != team) {
            prize = "200$";
            return prize + " " + String.format("Congrats your win is %s Your guess about the score is correct!", prize);

        } else if (finalScore != score && guess != team) ;
        prize = "0";
        {
            return prize +" " +  String.format("Your answer is incorrect and rewards is %s", prize);

        }
    }

}



