import java.util.*;

public class RockPaperScissors {

    //Creating a method to find the computer choice using the Math.random
    public static String computerChoice() {
        int random = (int)(Math.random() * 3);
        if (random == 0) 
		return "rock";
        else if (random == 1) 
		return "paper";
        else 
		return "scissors";
    }

    //Creating a method to find the winner
    public static String winner(String player, String computer) {

        if (player.equals(computer)) 
		return "tie";

        if (player.equals("rock") && computer.equals("scissors")) 
		return "player";
        if (player.equals("rock") && computer.equals("paper")) 
		return "computer";

        if (player.equals("paper") && computer.equals("rock")) 
		return "player";
        if (player.equals("paper") && computer.equals("scissors")) 
		return "computer";

        if (player.equals("scissors") && computer.equals("paper")) 
		return "player";
        if (player.equals("scissors") && computer.equals("rock")) 
		return "computer";

        return "invalid";
    }

    //Creating a method to find stats
    public static String[][] stats(int playerWin, int computerWin, int totalGames) {

        String[][] arr = new String[2][3];

        double playerPercent = (playerWin * 100.0) / totalGames;
        double computerPercent = (computerWin * 100.0) / totalGames;

        arr[0][0] = "Player";
        arr[0][1] = String.valueOf(playerWin);
        arr[0][2] = String.valueOf(playerPercent) + "%";

        arr[1][0] = "Computer";
        arr[1][1] = String.valueOf(computerWin);
        arr[1][2] = String.valueOf(computerPercent) + "%";

        return arr;
    }

    //Creating a method to display the result 
    public static void showResults(String[] player, String[] computer, String[] win, String[][] stats) {

        System.out.println("\nResults of the game:");
        
        System.out.println("Game\tPlayer\tComputer\tWinner");
        

        for (int i = 0; i < player.length; i++) {
            System.out.println((i + 1) + "\t" + player[i] + "\t" + computer[i] + "\t\t" + win[i]);
        }

        System.out.println("\nFinal Statistics:");
        System.out.println("Player/Computer\tWins\tWin %");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
		//Taking input from user
        System.out.print("Enter game's number: ");
        int number = sc.nextInt();
        sc.nextLine(); 

        String[] player = new String[number];
        String[] computer = new String[number];
        String[] win = new String[number];

        int playerWin = 0, computerWin = 0;

        for (int i = 0; i < number; i++) {
            System.out.print("\nEnter choice " + (i + 1) + " (rock/paper/scissors): ");
            player[i] = sc.nextLine().toLowerCase();

            computer[i] = computerChoice();

            win[i] = winner(player[i], computer[i]);

            if (win[i].equals("player")) playerWin++;
            else if (win[i].equals("computer")) 
				computerWin++;
        }

        String[][] stats = stats(playerWin, computerWin, number);

        showResults(player, computer, win, stats);
    }
}
