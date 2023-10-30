import java.util.Random;
import java.util.Scanner;

public class Main {
    public static String[] numToCar = {"", "", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "JQK", "Ace"};
    public static int playerScore = 0;
    public static int dealerScore = 0;

    public static void initi() {
        Random rand = new Random();

        int playerCard = rand.nextInt(9) + 2;
        playerScore += playerCard;
        System.out.println("You got " + numToCar[playerCard]);

        int dealerCard = rand.nextInt(9) + 2;
        dealerScore += dealerCard;
        System.out.println("Dealer got " + numToCar[dealerCard]);

        playerCard = rand.nextInt(9) + 2;
        playerScore += playerCard;
        System.out.println("You got " + numToCar[playerCard]);

        System.out.println("\nYour score is = " + playerScore + "\n");

        if (playerScore == 21) {
            System.out.println("You won!");
            return;
        }

        player();
    }

    public static void player() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        while (playerScore < 21) {
            System.out.println("Press 'h' to hit or 's' to stand");
            String str = sc.nextLine();
            if (str.equals("h")) {
                int playerCard = rand.nextInt(9) + 2;
                playerScore += playerCard;
                System.out.println("You got " + numToCar[playerCard]);
                System.out.println("\nYour score is = " + playerScore + "\n");
            } else if (str.equals("s")) {
                System.out.println();
                dealer();
                break;
            }
        }
        if (playerScore == 21) {
            System.out.println("You won!");
            return;
        } 
        else if (playerScore > 21) {
            System.out.println("Dealer won!");
            return;
        }
    }

    public static void dealer() {
        Random rand = new Random();

        while (dealerScore < playerScore) {
            int dealerCard = rand.nextInt(9) + 2;
            dealerScore += dealerCard;
            System.out.println("Dealer got " + numToCar[dealerCard]);
        }

        System.out.println("\nDealer's score is = " + dealerScore + "\n");
        if(dealerScore == playerScore) {
          System.out.println("It's a draw!");
          return;
        }
        if (dealerScore > 21) {
            System.out.println("You won!");
            return;
        } 
        else if (dealerScore > playerScore) {
            System.out.println("Dealer won!");
          return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 0 to begin.");

        int init = sc.nextInt();

        if (init == 0) {
            initi();
        }
    }
}
