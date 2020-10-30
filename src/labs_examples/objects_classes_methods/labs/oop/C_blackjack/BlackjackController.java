package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {
        Deck deck = new Deck();

        Player user = new Player();
        Player computer = new Player();

        deck.deal(user);
        deck.deal(computer);
        deck.deal(user);
        deck.deal(computer);

        System.out.println("Your cards are " + user.getHand().toString() + " and your score is " + user.getHand().getScore());
        System.out.println("The dealer has " + computer.getHand().toString() + " and the computer' score is " + computer.getHand().getScore());

        System.out.println("Would you like another card? y/n");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.next();

        if (response.equalsIgnoreCase("y")){
            deck.deal(user);
        }

        if (computer.getHand().getScore() < 16){
            deck.deal(computer);
        }

        System.out.println("Your cards are " + user.getHand().toString() + " and your score is " + user.getHand().getScore());
        System.out.println("The dealer has " + computer.getHand().toString() + " and the computer' score is " + computer.getHand().getScore());

    }
}
