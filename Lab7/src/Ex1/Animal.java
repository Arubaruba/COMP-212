package Ex1;

public class Animal {

    public Animal() {
        System.out.println("animal here");
    }


    // Some random, useless methods

    void method_Animal(int a) {
        // Does nothing
    }

    String method_Animal(float a) {
        return "animal got: " + a;
    }

    int method_Animal(String a) {
        return a.length() + 1;
    }


    @Override
    public String toString() {
        return "Ex1.Animal{}";
    }
}
