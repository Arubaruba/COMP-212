package OverloadOverride;

public class C extends A {
    // We create a new B object with an announcement message
    public B b1 = new B("b1 was created") {
        // Override the b method of Class B
        @Override void b() {
            System.out.println("I'm an overridden method of B");
        }
    };

    // Override the a method of Class A
    @Override
    void a() {
        System.out.println("I'm a C extending an A");
    }
}
