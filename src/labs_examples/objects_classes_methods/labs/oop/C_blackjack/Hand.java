package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards = new ArrayList<Card>();
    private int handValue;

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getHandValue() {
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }

    @Override
    public String toString() {
        StringBuilder sB = new StringBuilder();

        for (Card c : cards){
            sB.append(c.getFaceValue());
            sB.append(c.getSuit());
            sB.append(" ");
        }
        return sB.toString();
    }

    public int getScore(){
        int score = 0;
        for (Card c : cards){
            score += c.getPointValue();
        }
        return score;
    }
    public boolean bust(int score){
        if (score > 21){
            System.out.println("The player has busted!");
            return true;
        }

        return false;
    }

}

