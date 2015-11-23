package Ex01;

public class ProtectedDemo {
    public static void main(String args[]) {
        System.out.println("Got a: " + (new A()).a);
    }
}

class A {
    protected int a = 13;

    public int getA() {
        return a;
    }
}
