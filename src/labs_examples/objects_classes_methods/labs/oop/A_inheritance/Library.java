package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Library {
}
class Book extends Library {
    int pageNum;

}

class Genres extends Book {
    public Genres(String name) {
        this.name = name;
    }

    String name;


}

class Fantasy extends Genres {

    public Fantasy(String name) {
        super(name);
    }
}
