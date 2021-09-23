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

    public void outcome(String winTeam, int winScore) {
        String s= "Reward 100$";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter team for your bet:");
        String guessTeam = sc.nextLine();
        System.out.println("Yor bet for a team is:" + guessTeam);
        String tempTeam= guessTeam;

        System.out.println("Please, enter score for winning team:");
        int guessScore = sc.nextInt();
        int tempScore =guessScore;

        System.out.println("Yor bet for a score is:" + guessScore);

        String output = "Your bet is:" + tempTeam + " " + tempScore;
        System.out.println(output);

        if (tempTeam.matches(winTeam)|| tempScore!=winScore) {
            System.out.println("You win! Score is corect and Team too!");
            if (tempScore == winScore) {
                System.out.println("You win biggest reward!");
                if (tempTeam.matches(winTeam) && tempScore == winScore) {
                    System.out.println("You win. Team is correct");
                    if(!tempTeam.matches(winTeam) && tempScore != winScore) {
                        System.out.println("No reward!");
                    }
                }
            }
        }




    }

}











