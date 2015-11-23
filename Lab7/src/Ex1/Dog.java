package Ex1;

public class Dog extends Animal {

    void bark(float a) {
        System.out.println("bark " + a);
    }

    void bark(int a) {
        System.out.println("bark " + a);
    }

    void bark(String s) {
        System.out.println("howl " + s);
    }


    @Override
    void method_Animal(int a) {
        // Still do nothing :)
    }

    @Override
    String method_Animal(float a) {
        return "dog got: " + a;
    }

    @Override
    public String toString() {
        return super.toString() + " Ex1.Dog{}";
    }
}
