package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class Player {
    private String name;
    private Hand hand;
    private int potValue;
    private int betValue;
    boolean cont = true;


    public Player() {
        hand = new Hand();
    }

    public Player(String name) {
        this.name = name;
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

    public void winBet() {
        potValue = betValue * 2 + potValue;
    }

    public void loseBet() {
        potValue = potValue - betValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }

    public boolean computerAI() {
        if (hand.getScore() < 16) {
            return true;
        }
        return false;
    }

    public void printHand() {
        System.out.println(name + " has " + hand.toString() + " and their score is " + hand.getScore());
    }

    public int getBetValue() {
        return betValue;
    }

    public void setBetValue(int betValue) {
        this.betValue = betValue;
    }



}

