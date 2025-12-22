import java.util.Scanner;

public class DeckOfCards {

    //Creating a method to initialize the deck
    public static String[] deck(String[] suits, String[] ranks) {

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }

        return deck;
    }

    //Creating a method to shuffle the deck
    public static String[] shuffleDeck(String[] deck) {

        int number = deck.length;

        for (int i = 0; i < number; i++) {

            int randomCardNumber = i + (int)(Math.random() * (number - i));

            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }

    //Creating a method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int players, int cards) {

        if (players * cards > deck.length) {
            return null; 
        }

        String[][] result = new String[players][cards];

        int index = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cards; j++) {
                result[i][j] = deck[index];
                index++;
            }
        }

        return result;
    }

    //Creating a method to print players and their cards
    public static void printPlayers(String[][] players) {

        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + " cards:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println(players[i][j]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        String[] deck = deck(suits, ranks);

        deck = shuffleDeck(deck);
		
		//Taking user input
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter number of cards: ");
        int cards = sc.nextInt();

        //Distributing the cards
        String[][] result = distributeCards(deck, players, cards);

        if (result == null) {
            System.out.println("\nCards are not enough to distribute");
        } 
		else {
            printPlayers(result);
        }
    }
}
