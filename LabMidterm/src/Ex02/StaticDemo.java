package Ex02;

public class StaticDemo {
    static String stat1 = "a";
    static String stat2;

    static {
        stat2 = "b";
    }

    static void printStatic() {
        System.out.println("stat1: " + StaticDemo.stat1);
        System.out.println("stat2: " + StaticDemo.stat2);
    }

    public static void main(String args[]) {
        printStatic();
    }
}
