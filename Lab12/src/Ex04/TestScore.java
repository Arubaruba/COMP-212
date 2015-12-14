package Ex04;

public class TestScore {
    int studentId;
    int score;

    public TestScore(int studentId, int score) throws ScoreException {
        this.studentId = studentId;

        if (score > 100 || score < 0) {
            throw new ScoreException(score);
        }
        this.score = score;
    }
}
