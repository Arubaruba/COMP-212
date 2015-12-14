package Ex1;

public class AnimalDemo {
    public static void main(String args[]) {
        Animal a = new Animal();
        System.out.println(a);
        System.out.println(a.method_Animal("1234"));

        Dog d = new Dog();
        System.out.println(d);
        System.out.println(d.method_Animal("1234"));
        d.bark(1);

        d.bark("asdf");
    }
}
