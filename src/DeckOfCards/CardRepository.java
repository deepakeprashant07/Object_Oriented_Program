package DeckOfCards;

import java.util.LinkedList;

public class CardRepository {
    LinkedList<Players> listObject = new LinkedList<>();
    public void playerfirst(Players playerFirst) {
        listObject.add(playerFirst);
    }

    public void playerSecond(Players playerTwo) {
        listObject.add(playerTwo);
    }

    public void playerThired(Players playerThree) {
        listObject.add(playerThree);
    }

    public void playerFour(Players playerFour) {
        listObject.add(playerFour);
    }

    public void showCard() {
        for (int i = 0; i < 4; i++) {
            int index = i;
            System.out.print("Player "+(i+1)+" :- ");
            for (int j = 0; j < 9; j++) {
                System.out.print(listObject.get(index).card+" "+listObject.get(index).rank+", ");
                index = index+3;
            }
            System.out.println();
        }
    }
}
