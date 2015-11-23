import java.util.Scanner;

/**
 * Demonstrates the Distance class
 */
public class DistanceDemo {
    public static void main(String args[]) {

        System.out.println(Inner.i);

//        // Instantiate a scanner to read keyboard input
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the vehicle's speed: ");
//        double speed = scanner.nextDouble();
//
//        System.out.print("Enter the time it traveled at that speed: ");
//        int hours = scanner.nextInt();
//
//        Distance distance1 = new Distance(speed, hours);
//
//        System.out.println("Total distance traveled: " + distance1.getDistance());
    }

    private static class Inner {
        protected static int i = 0;
    }
}
