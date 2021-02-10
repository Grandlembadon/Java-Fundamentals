package labs_examples.enumerations.labs;

public enum VideoGame {
    MEGAMAN(2, "Very Hard"),
    RISKOFRAIN(1,"Expert"),
    MARIO(5,"Easy"),
    THESIMS(1,"Easy"),
    DIVINIY2(1,"Expert");

     VideoGame(int numLives, String difficulty) {
        this.numLives = numLives;
        this.difficulty = difficulty;
    }
    private int numLives;
    private String difficulty;

    public int getNumLives() {
        return numLives;
    }

    public String getDifficulty() {
        return difficulty;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "numLives=" + numLives +
                ", difficulty='" + difficulty + '\'' +
                '}';
    }
}

class VideoGameController {
    public static void main(String[] args) {
        VideoGame obj = VideoGame.MARIO;
        System.out.println(obj.toString());

    }
}