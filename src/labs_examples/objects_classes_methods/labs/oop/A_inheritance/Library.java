package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Library {
}
class Book extends Library {
    public Book(int pageNum) {
        this.pageNum = pageNum;
    }

    int pageNum;

    public Book() {
        
    }
}

class Genres extends Book {
    public Genres(String name) {
        super();
        this.name = name;
    }

    String name;


}

class Fantasy extends Genres {

    public Fantasy(String name) {
        super(name);
    }
}
