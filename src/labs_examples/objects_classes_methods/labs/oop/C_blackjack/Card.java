package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    char suit;
    int cardValue;

    public final static char spades = '♠';
    public final static char diamonds = '♦';
    public final static char hearts = '♥';
    public final static char clubs = '♣';

    public Card (int suit, int cardValue){
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }
    public String getSuitAsString(){
        switch(suit){
            case spades:
                return "Spades";
            case diamonds:
                return "Diamonds";
            case hearts:
                return "Hearts";
            case clubs:
                return "Clubs";
            default:
                return "??";

    }


}
