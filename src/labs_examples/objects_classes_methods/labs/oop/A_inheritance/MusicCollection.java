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
    public MP3(double fileSize, String artistName) {
        super(fileSize);
        this.artistName = artistName;
    }

    String artistName;

    public MP3(double fileSize, double songLength, String songName) {
        super(fileSize);
        this.songLength = songLength;
        this.songName = songName;
    }

    double songLength;
    String songName;

    public MP3(double fileSize) {
        super(fileSize);
    }
}
