package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Library {
}
class Book extends Library {

}

class Genres extends Book {
    public Genres(String name) {
        this.name = name;
    }

    String name;


}

class ScienceFiction extends Genres {

    public ScienceFiction(String name) {
        super(name);
    }
}
