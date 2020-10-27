package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    char[] suits = {'♠', '♦', '♥', '♣'};
    String[] cardValues = {"Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
    private char mySuit;
    private String myCardValue;


    public Card(char mysuit, String myCardValue) {
        this.mySuit = mysuit;
        this.myCardValue = myCardValue;
    }

    public char getMySuit() {
        return mySuit;
    }

    public void setMySuit(char mySuit) {
        this.mySuit = mySuit;
    }

    public String getMyCardValue() {
        return myCardValue;
    }

    public void setMyCardValue(String myCardValue) {
        this.myCardValue = myCardValue;
    }

    public char getSuitAsString() {
        for (char mySuit : suits) {
            return mySuit;
        }

        return 0;
    }

    public String getValueAsString() {
        for (String myCardValue : cardValues) {
            return myCardValue;
        }
        return null;
    }


    public String toString() {
    return getValueAsString() + " of " + getSuitAsString();
    }
}


