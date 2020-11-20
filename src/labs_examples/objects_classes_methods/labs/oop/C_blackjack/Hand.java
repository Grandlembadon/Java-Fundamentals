package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards = new ArrayList<Card>();
    boolean busted = false;

    public ArrayList<Card> getCards() {
        return cards;
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

    /**
     * This method returns the score for a given hand.
     * @return int total score
     */
    public int getScore(){
        int score = 0;
        for (Card c : cards){
            score += c.getPointValue();
        }
        return score;
    }

    public boolean bust(){
        if (getScore() > 21){
            busted = true;
            return true;
        }

        return false;
    }

    public void newHand(){
        cards = new ArrayList<Card>();
        busted = false;
    }

}

