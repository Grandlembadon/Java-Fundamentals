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

    public void playMP3() {
        System.out.println("Playing MP3...");
    }
    public void storeMP3() {
        System.out.println("Storing MP3...");
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public double getSongLength() {
        return songLength;
    }

    public void setSongLength(double songLength) {
        this.songLength = songLength;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    double songLength;
    String songName;

    public MP3(double fileSize) {
        super(fileSize);
    }
}
