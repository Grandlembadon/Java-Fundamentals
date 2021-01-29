package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.Scanner;

public class DungeonBattlerController {
    public static void main(String[] args) {
        DungeonBattlerController controller = new DungeonBattlerController();
        controller.playDungeonBattler();


    }
    public void playDungeonBattler() {
        System.out.println("Welcome, brave adventurer. If you seek the riches that lie" +
                " within this ancient dungeon, speak thy name and enter.");

        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.next();



    }

}
