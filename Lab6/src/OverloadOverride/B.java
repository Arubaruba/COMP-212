package OverloadOverride;

public class B {
    B() {}
    B(String s) {
        System.out.println("B(): " + s);
    }

    void b() {
        System.out.println("I'm an B");
    }
}
