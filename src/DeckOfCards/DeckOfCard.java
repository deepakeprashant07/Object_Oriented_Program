package DeckOfCards;

import java.util.Scanner;

public class DeckOfCard {

    public static void main(String[] args) {
        CardRepository cardRepository = new CardRepository();
        int cardRandom = 0;
        int rankRandom = 0;
        String[] cards = new String[]{"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        for (int i = 0; i < 9; i++) {
            for (int j = 1; j <= cards.length; j++) {
                switch (j){
                    case 1:
                        Players playerFirst = new Players();
                        cardRandom = (int) (Math.random() * 4) ;
                        rankRandom = (int) (Math.random() * 13);
                        playerFirst.card = cards[cardRandom];
                        playerFirst.rank = ranks[rankRandom];
                        cardRepository.playerfirst(playerFirst);
                        break;
                    case 2:
                        Players playerTwo = new Players();
                        cardRandom = (int) (Math.random() * 4) ;
                        rankRandom = (int) (Math.random() * 13);
                        playerTwo.card = cards[cardRandom];
                        playerTwo.rank = ranks[rankRandom];
                        cardRepository.playerSecond(playerTwo);
                        break;
                    case 3:
                        Players playerThree = new Players();
                        cardRandom = (int) (Math.random() * 4) ;
                        rankRandom = (int) (Math.random() * 13);
                        playerThree.card = cards[cardRandom];
                        playerThree.rank = ranks[rankRandom];
                        cardRepository.playerThired(playerThree);
                        break;
                    case 4:
                        Players playerFour = new Players();
                        cardRandom = (int) (Math.random() * 4) ;
                        rankRandom = (int) (Math.random() * 13);
                        playerFour.card = cards[cardRandom];
                        playerFour.rank = ranks[rankRandom];
                        cardRepository.playerFour(playerFour);
                        break;
                }

            }

        }
        cardRepository.showCard();
    }
}
