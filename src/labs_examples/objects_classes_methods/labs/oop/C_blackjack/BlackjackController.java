package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {
        playBlackJack();

    }
    public static void playBlackJack(){
        System.out.println("Hello player, please enter your name.");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.next();

        Player user = new Player();
        user.setName(playerName);

        Player computer = new Player();
        String computerName = "Computer";
        computer.setName(computerName);

        Deck deck = new Deck();

        deck.deal(user);
        deck.deal(computer);
        deck.deal(user);
        deck.deal(computer);

        System.out.println( user.getName() + " has " + user.getHand().toString() + " and their score is " + user.getHand().getScore());
        System.out.println( computer.getName() + " has " + computer.getHand().toString() + " and their score is " + computer.getHand().getScore());

        System.out.println("Would you like another card? y/n");
        Scanner scanner2 = new Scanner(System.in);
        String response = scanner2.next();

        if (response.equalsIgnoreCase("y")){
            deck.deal(user);
        }
        System.out.println( user.getName() + " has " + user.getHand().toString() + " and their score is " + user.getHand().getScore());

        if (computer.computerAI(computer.getHand().getScore()) == true){
            deck.deal(computer);
        }
        System.out.println( computer.getName() + " has " + computer.getHand().toString() + " and their score is " + computer.getHand().getScore());



//        Deck deck = new Deck();
//
//        Player user = new Player();
//        Player computer = new Player();
//
//        deck.deal(user);
//        deck.deal(computer);
//        deck.deal(user);
//        deck.deal(computer);
//
//        System.out.println("Your cards are " + user.getHand().toString() + " and your score is " + user.getHand().getScore());
//        System.out.println("The dealer has " + computer.getHand().toString() + " and the computer' score is " + computer.getHand().getScore());
//
//        System.out.println("Would you like another card? y/n");
//        Scanner scanner = new Scanner(System.in);
//        String response = scanner.next();
//
//        if (response.equalsIgnoreCase("y")){
//            deck.deal(user);
//        }
//
//        if (computer.getHand().getScore() < 16){
//            deck.deal(computer);
//        }
//
//        System.out.println("Your cards are " + user.getHand().toString() + " and your score is " + user.getHand().getScore());
//        System.out.println("The dealer has " + computer.getHand().toString() + " and the computer's score is " + computer.getHand().getScore());
//
//        if (user.getHand().getScore().bust() = true){
//
//        }

    }
}
