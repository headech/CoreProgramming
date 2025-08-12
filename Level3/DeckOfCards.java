package Level_3;
import java.util.Scanner;

public class DeckOfCards {
    static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
                          "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    static String[] shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    static String[][] distributeCards(String[] deck, int n, int players) {
        if (n % players != 0) return null;
        String[][] distributed = new String[players][n / players];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < n / players; j++) {
                distributed[i][j] = deck[index++];
            }
        }
        return distributed;
    }

    static void printPlayersCards(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (String card : playersCards[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int players = sc.nextInt();
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);
        String[][] distributed = distributeCards(deck, n, players);
        if (distributed == null) {
            System.out.println("Cannot distribute " + n + " cards to " + players + " players evenly.");
        } else {
            printPlayersCards(distributed);
        }
    }
}
