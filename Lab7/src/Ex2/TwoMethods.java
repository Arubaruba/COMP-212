package Ex2;

public class TwoMethods {
    void m1 () {
        System.out.println("m1 was called");
        m2();
    }

    void m2 () {
        System.out.println("m2 was called");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
