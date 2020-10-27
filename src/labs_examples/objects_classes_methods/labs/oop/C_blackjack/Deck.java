package labs_examples.objects_classes_methods.labs.oop.C_blackjack;


import java.util.ArrayList;

public class Deck {
    Card[] deck;
    ArrayList<Integer> usedCards;

    public Deck(Card[] cards, ArrayList<Integer> usedCards){
        this.deck = cards;
        this.usedCards = usedCards;
        deck = new Card[52];
        int cardCt = 0;
        for (char mySuit : suits) {
            for (String myCardValue : cardValues) {
                deck[cardCt] = new Card(mySuit, myCardValue);
                cardCt++;
            }

        }
        usedCards = new ArrayList<>();


    }

}
