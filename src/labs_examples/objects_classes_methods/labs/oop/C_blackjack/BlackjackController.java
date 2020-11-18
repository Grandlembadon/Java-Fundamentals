package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {
        BlackjackController controller = new BlackjackController();
        controller.playBlackJack();

    }

    public void playBlackJack() {

        System.out.println("Hello player, please enter your name.");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.next();

        Player user = new Player(playerName);
        Player computer = new Player("Computer");
        boolean playAgain = true;
        boolean firstGame = true;


        while (playAgain) {
            user.getHand().newHand();
            computer.getHand().newHand();
            handleBets(user, firstGame);
            user.cont = true;
            computer.cont = true;


            Deck deck = new Deck();
            System.out.println("Let the game begin.");
            dealInitialCards(deck, user, computer);

            while (user.cont || computer.cont) {
                promptUserPlay(deck, user);
                promptComputerPlay(deck, computer);

                }
            if (user.getHand().bust() || computer.getHand().bust()) {
                determineWinner(user, computer);
                playAgain = promptPlayAgain();
                firstGame = false;

            } else {
                determineWinner(user, computer);
                playAgain = promptPlayAgain();
                firstGame = false;

            }

        }
    }

    private boolean promptPlayAgain() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to play again? y/n");

        String response = scanner.next();

        if (response.equalsIgnoreCase("y")) {
            return true;
        } else {
            System.out.println("Thank you for playing, good bye!");
            return false;
        }
    }

    private void promptComputerPlay(Deck deck, Player computer) {
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

            }
        }
    }

    private void promptUserPlay(Deck deck, Player user) {
        Scanner scanner = new Scanner(System.in);
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
    }

    private void dealInitialCards(Deck deck, Player user, Player computer) {
        deck.deal(user);
        deck.deal(computer);
        deck.deal(user);
        deck.deal(computer);

        user.printHand();
        computer.printHand();
    }

    private void handleBets(Player user, boolean firstGame) {
        Scanner scanner = new Scanner(System.in);

        if (firstGame) {
            System.out.println("How much money would you like to start with?");
            int potVal = scanner.nextInt();
            user.setPotValue(potVal);
        }

        boolean validInput = true;
        do {
            System.out.println("How much would you like to bet?");
            int betVal = scanner.nextInt();

            if (betVal <= user.getPotValue()) {
                user.setBetValue(betVal);
                validInput = true;
            } else {
                System.out.println("Your bet is too high, please bet less than your pot value!");
                validInput = false;
            }
        }while(validInput == false);
    }


    public void determineWinner (Player user, Player computer){
            if (user.getHand().busted) {
                System.out.println("The computer has won!");
                user.loseBet();
                return;
            } else if (computer.getHand().busted) {
                System.out.println("You have won!");
                user.winBet();
                return;
            } else if (computer.getHand().busted || user.getHand().busted) {
                System.out.println("You and the computer have busted, you both lose!");
                user.loseBet();
                return;
            }

            if (user.getHand().getScore() > computer.getHand().getScore()) {
                System.out.println("You have won!");
                user.winBet();
            } else if (user.getHand().getScore() < computer.getHand().getScore()){
                System.out.println("The computer has won!");
                user.loseBet();
            }
            if (user.getHand().getScore() == computer.getHand().getScore()) {
                System.out.println("It's a stalemate!");
                user.staleBet();
            }
            if (user.getPotValue() == 0){
                System.out.println("You have lost all your money, the game is over!");
                java.lang.System.exit(0);
            }
        }

}

