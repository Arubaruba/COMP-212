package OverloadOverride;

public class A {
    A () {}
    A(String s) {
        System.out.println("A(): " + s);
    }

    void a() {
        System.out.println("I'm an A");
    }
}
