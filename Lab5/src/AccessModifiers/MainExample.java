package AccessModifiers;

public class MainExample {

    public static int s = 2;

    public static void main(String[] args) {
        AccessModifiers.Example.i = 12;

        System.out.println(AccessModifiers.Example.i);

        AccessModifiers.Example.j = 13;

        System.out.println(AccessModifiers.Example.j);

        AccessModifiers.Example.f = 1.3;

        System.out.println(AccessModifiers.Example.f);

        AccessModifiers.Example.g = 16;

        System.out.println(AccessModifiers.Example.g);

        s = 17;

        System.out.println(s);

    }
}
