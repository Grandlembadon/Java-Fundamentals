package labs_examples.objects_classes_methods.labs.objects;

public class Exercise_02 {
    public static void main(String[] args) {
        Person p = new Person("Liam");
        VideoGame v = new VideoGame("MegaMan");
        System.out.println(p.name + "'s favorite video game is " + v.name + ".");

    }
}

class Person {
    String name;
    public Person(String name){
        this.name = name;
    }
}

class VideoGame {
    String name;
    String difficulty;
    public VideoGame(String name){
        this.name = name;
    }

    public void startGame() {
        System.out.println("Starting Game...");
    }
}


