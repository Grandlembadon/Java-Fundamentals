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
    int totalchars;
    String settingType;
    double price;
    String Author;

    public Fantasy(String name, int totalchars, String settingType, double price, String author) {
        super(name);
        this.totalchars = totalchars;
        this.settingType = settingType;
        this.price = price;
        Author = author;
    }

    public int getTotalchars() {
        return totalchars;
    }

    public void setTotalchars(int totalchars) {
        this.totalchars = totalchars;
    }

    public String getSettingType() {
        return settingType;
    }

    public void setSettingType(String settingType) {
        this.settingType = settingType;
    }

    public Fantasy(String name) {
        super(name);
    }
}
