import java.util.Scanner;

public class Bet {

    public static void main(String[] args) {

        Calculation calculate = new Calculation("Manchester",5);

//        calculate.setFinalScore(6);
//        calculate.setTeam("Manchester");
        System.out.println(  calculate.outcome("Manchester",5));
    }

}