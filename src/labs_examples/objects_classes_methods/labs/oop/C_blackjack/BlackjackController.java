package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {
        BlackjackController controller = new BlackjackController();
        controller.playBlackJack();
        controller.playAgain();

    }

    public void playBlackJack() {

        System.out.println("Hello player, please enter your name.");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.next();

        Player user = new Player(playerName);
        Player computer = new Player("Computer");

        System.out.println("How much money would you like to start with?");
        int potVal = scanner.nextInt();
        user.setPotValue(potVal);

        System.out.println("How much would you like to bet?");
        int betVal = scanner.nextInt();

        if (betVal < potVal){
            user.setBetValue(betVal);
        }else{
            System.out.println("Your bet is too high, please bet less than your pot value!");
            return;
        }


            Deck deck = new Deck();
            System.out.println("Let the game begin.");

            deck.deal(user);
            deck.deal(computer);
            deck.deal(user);
            deck.deal(computer);

            user.printHand();
            computer.printHand();

            while (user.cont || computer.cont) {
                if (user.cont) {
                    System.out.println("Would you like another card? y/n");

                    String response = scanner.next();

                    if (response.equalsIgnoreCase("y")) {
                        deck.deal(user);
                        user.printHand();
                        if (user.getHand().bust()) {
                            System.out.println("You have busted!");
                            user.cont = false;
                            user.getHand().busted = true;
                        }
                    } else {
                        user.cont = false;
                    }
                }
                if (computer.cont) {
                    if (computer.computerAI()) {
                        deck.deal(computer);
                        computer.printHand();
                        if (computer.getHand().bust()) {
                            System.out.println("The computer has busted!");
                            computer.cont = false;
                            computer.getHand().busted = true;
                        }
                    } else {
                        computer.cont = false;
                        System.out.println("The computer will stay.");
                    }

                }
            }
            determineWinner(user, computer);
        }


        public void determineWinner (Player user, Player computer){
            if (user.getHand().busted) {
                System.out.println("The computer has won!");
                return;
            } else if (computer.getHand().busted) {
                System.out.println("You have won!");
                return;
            } else if (computer.getHand().busted || user.getHand().busted) {
                System.out.println("You and the computer have busted, you both lose!");
                return;
            }

            if (user.getHand().getScore() > computer.getHand().getScore()) {
                user.winBet();
                System.out.println("You have won!");

            } else {
                System.out.println("The computer has won!");
            }
            if (user.getHand().getScore() == computer.getHand().getScore()) {
                System.out.println("It's a stalemate!");
            }


        }
        public void playAgain () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Would you like to play again? y/n ");

            String response = scanner.next();

            if (response.equalsIgnoreCase("y")) {
                playBlackJack();
                playAgain();
            }

            if (response.equalsIgnoreCase("n")) {
                System.out.println("Thank you for playing, goodbye!");
            }
        }
}

