package Ex04;

import java.util.Scanner;

public class TestScoreDemo {
    public static void main(String args[]) throws ScoreException {
        int numberOfScores = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of scores you wish to enter:");

        numberOfScores = scanner.nextInt();
        while (numberOfScores < 0) {
            System.out.println("Please enter a positive number for the number of scores");
            numberOfScores = scanner.nextInt();
        }

        TestScore testScores[] = new TestScore[numberOfScores];
        for (int i = 0; i < numberOfScores; i++) {
            System.out.print("Enter an ID: ");
            int id = scanner.nextInt();
            int score = scanner.nextInt();
            try {
                testScores[i] = new TestScore(id, score);
            } catch (ScoreException scoreException) {
                System.out.println(scoreException.getMessage());
                testScores[i] = new TestScore(id, 0);
            }
        }
        for (int i = 0; i < numberOfScores; i++) {
            
        }
    }
}
