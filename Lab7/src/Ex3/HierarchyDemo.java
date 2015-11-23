package Ex3;

public class HierarchyDemo {
    public static void main(String args[]) {
        new D2();
        System.gc();
        new D2();
        System.gc();

        new D2();
    }
}
