package Level_2;
import java.util.*;

public class RockPaperScissors {

    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "tie";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper")))
            return "player";
        else
            return "computer";
    }

    public static String[][] getStats(int playerWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3];
        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f", (playerWins * 100.0) / totalGames) + "%";
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", (computerWins * 100.0) / totalGames) + "%";
        return stats;
    }

    public static void displayResults(List<String[]> gameResults, String[][] stats) {
        System.out.println("Game\tPlayer Choice\tComputer Choice\tWinner");
        for (String[] result : gameResults) {
            System.out.println(result[0] + "\t" + result[1] + "\t\t" + result[2] + "\t\t" + result[3]);
        }
        System.out.println("\nStats:");
        System.out.println("Name\tWins\tPercentage");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int playerWins = 0, computerWins = 0;
        List<String[]> gameResults = new ArrayList<>();

        for (int i = 1; i <= games; i++) {
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String playerChoice = sc.next().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = getWinner(playerChoice, computerChoice);
            if (winner.equals("player")) playerWins++;
            else if (winner.equals("computer")) computerWins++;
            gameResults.add(new String[]{String.valueOf(i), playerChoice, computerChoice, winner});
        }

        String[][] stats = getStats(playerWins, computerWins, games);
        displayResults(gameResults, stats);
    }
}

