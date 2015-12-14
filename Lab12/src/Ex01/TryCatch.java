package Ex01;

import java.util.Scanner;

public class TryCatch {

    public static void main(String args[]) {
        System.out.println("Enter the number of lines you want to input: ");

        Scanner scanner = new Scanner(System.in);
        int numOfInputs = scanner.nextInt();

        try {
            // This may fail if numOfInputs is negative
            String inputs[] = new String[numOfInputs];

            System.out.println("Please input " + numOfInputs + " lines");

            for (int i = 0; i < numOfInputs; i++) {
                inputs[i] = scanner.next();
            }

            System.out.println("Success! Got: \n" + String.join("\n", inputs));
        } catch (Exception e) {
            System.out.println("Oh oh, you didn't enter a positive integer for the number of lines.");
        }
    }
}
