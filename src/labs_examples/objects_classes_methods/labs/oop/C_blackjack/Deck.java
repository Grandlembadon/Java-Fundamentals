package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;
import java.util.Random;

public class Deck {
    public static char[] suits = {'♠', '♦', '♥', '♣'};
    private Card[] deck = new Card[52];
    private ArrayList<Integer> usedCards = new ArrayList<Integer>();

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
        Random r = new Random();
        int randomNum;

        do {
            randomNum = r.nextInt(52);
        } while (usedCards.contains(randomNum));

        usedCards.add(randomNum);
        player.getHand().getCards().add(deck[randomNum]);

    }
}

