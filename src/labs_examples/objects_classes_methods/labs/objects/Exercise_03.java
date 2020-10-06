package labs_examples.objects_classes_methods.labs.objects;

public class Exercise_03 {
    public static void main(String[] args) {
        Movie m1 = new Movie(1997);
        Movie m2 = new Movie("The Fifth Element", "Sci-Fi");
        Movie m3 = new Movie(1997, "The Fifth Element", "Sci-Fi");
    }
}

class Movie {
    int ReleaseDate;
    String name;
    String genre;

    public Movie(int ReleaseDate){
        this.ReleaseDate = ReleaseDate;
    }
    public Movie(String name, String genre){
        this.name = name;
        this.genre = genre;
    }
    public Movie(int ReleaseDate, String name, String genre){
        this.ReleaseDate = ReleaseDate;
        this.genre = genre;
        this.name = name;
    }
}

