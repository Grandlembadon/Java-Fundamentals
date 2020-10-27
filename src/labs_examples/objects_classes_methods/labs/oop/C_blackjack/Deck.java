package labs_examples.objects_classes_methods.labs.oop.C_blackjack;


import java.util.ArrayList;

import static labs_examples.objects_classes_methods.labs.oop.C_blackjack.Card.cardValues;

public class Deck {
    Card[] deck;
    ArrayList<Integer> usedCards;

    public Deck(Card[] cards, ArrayList<Integer> usedCards) {
        this.deck = cards;
        this.usedCards = usedCards;


    }

    public void createDeck(){
        deck = new Card[52];
        int cardCt = 0;
        for (char suit = 0; suit <= 3; suit++){
            for (String value = cardValues[0]; value <= cardValues.length; value++;){
                deck[cardCt] = new Card(suit, value);
                cardCt++;

            }
        }


    }

}
}
