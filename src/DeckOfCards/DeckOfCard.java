package DeckOfCards;

public class DeckOfCard {
    public static void main(String[] args) {
        System.out.println("Welcome Deck of Card");
        String[][] twoDArray = new String[4][9];
        String[] cards = {"Clubs", "Diamond", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" , "Ace"};
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < 9; j++) {
                int randomCards =(int) (Math.random()*4);
                int randomRanks = (int) (Math.random()*13);
                twoDArray[i][j] = cards[randomCards] +" "+ranks[randomRanks];
            }
        }
        for (int i = 0; i < twoDArray.length; i++) {
            System.out.print("Player "+(i+1)+" :- ");
            for (int j = 0; j < 9; j++) {
                System.out.print(twoDArray[i][j]+", ");
            }
            System.out.println();
        }
    }
}
