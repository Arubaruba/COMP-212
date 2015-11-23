package Ex01;

public class StaticInnerDemo {
    static class A {
        A() {
            System.out.println("Instantiated an A");
        }
    }

    public static void main(String args[]) {
        new A();
    }
}
