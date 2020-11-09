package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {
    private String name;
    private Hand hand;
    private int potValue;


    public Player() {
        hand = new Hand();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getPotValue() {
        return potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }

    public boolean computerAI(int score) {
        Player computer = new Player();
        if (computer.getHand().getScore() < 16) {
            return true;
        }
        return false;
    }

}

