package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;

public class Deck {
    public static char[] suits = {'♠', '♦', '♥', '♣'};
    private Card[] deck = new Card[52];
    private ArrayList<Integer> usedCards;

    public Deck() {
        createDeck();
    }

    public void createDeck(){
        int cardCt = 0;
        for (char suit = 0; suit <= 3; suit++){
            for (int i = 1; i <= 13; i++){
                deck[cardCt] = new Card(suits[suit], i);
                cardCt++;

            }
        }
    }

    public void deal(Player player){

    }
}

