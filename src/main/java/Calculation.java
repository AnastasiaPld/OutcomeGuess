import java.util.Scanner;

public class Calculation {

        public void outcome(String guess, int score){
            int finalScore = 6; //score for Carolina Panthers
            String teamEn = "Carolina Panthers"; //winning team
            String team2 = "Chicago Bears";//lost the game

            if (score == finalScore && guess ==teamEn){
                System.out.println("Congratulations you win 100$! Carolina Panthers wins with score 6.");
            } else if(score!=finalScore || guess ==teamEn){
                System.out.println("Congratulations you win 10$! Your guess for winning team is correct!");
            } else if(score!= finalScore && guess==team2){
                System.out.println("Your guess is not correct! Team Chicago Bears lost.");
            }else{
                System.out.println("Your guess is incorrect! No rewards!");
            }
        }
    }





