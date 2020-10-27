package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    public static char[] suits = {'♠', '♦', '♥', '♣'};
    public static String[] cardValues = {"Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
    private char suit;
    private String value;


    public Card(char suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public char[] getSuits() {
        return suits;
    }

    public void setSuits(char[] suits) {
        this.suits = suits;
    }

    public String[] getCardValues() {
        return cardValues;
    }

    public void setCardValues(String[] cardValues) {
        this.cardValues = cardValues;
    }

    public char getSuit() {
        return suit;
    }

    public void setSuit(char mySuit) {
        this.suit = mySuit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public char getSuitAsString() {
        for (char suit : suits) {
            return suit;
        }

        return 0;
    }

    public String getValueAsString() {
        for (String value : cardValues) {
            return value;
        }
        return null;
    }


    public String toString() {
    return getValueAsString() + " of " + getSuitAsString();
    }
}


