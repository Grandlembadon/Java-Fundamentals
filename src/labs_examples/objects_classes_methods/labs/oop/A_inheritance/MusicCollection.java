package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class MusicCollection {
    public MusicCollection(double fileSize) {
        this.fileSize = fileSize;
    }

    private double fileSize;

}
class Format extends MusicCollection {

    public Format(double fileSize) {
        super(fileSize);
    }
}

class MP3 extends Format {
    double songLength;
    String songName;

    public MP3(double fileSize) {
        super(fileSize);
    }
}
