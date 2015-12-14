package Ex04;

public class ScoreException extends Exception {

    int score;

    public ScoreException(int score) {
        this.score = score;
    }

    @Override
    public String getMessage() {
        return "Invalid score: " + score + "\nMust be between 0 and 100";
    }
}
