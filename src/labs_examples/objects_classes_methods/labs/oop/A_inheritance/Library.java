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
    public void readBook() {
        System.out.println("Reading Book");

    }
    public void publishBook() {
        System.out.println("Publishing Book...");

    }
}

class Genres extends Book {
    public Genres(String name) {
        super();
        this.name = name;
    }

    String name;

    public void listAllGenres() {
        System.out.println("Listing All Genres...");

    }
    public void deleteAllGenres() {
        System.out.println("Deleting All Genres...");

    }




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

    public void finalFantasy() {
        System.out.println("Loading Final Fantasy...");

    }

    public void firstFantasy (){
        System.out.println("Loading First Fantasy...");

    }
    public void middleFantasy() {
        System.out.println("Loading Middle Fantasy...");

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
