package OverloadOverride;

public class OverloadOverrideDemo {
    public static void main(String[] args) {
        C c1 = new C();
        // Call the overridden b method
        c1.b1.b();
        c1.a();
    }
}
