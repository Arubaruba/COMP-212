package AccessModifiers;

public class Example {

    private int i;

    protected int j = 10;

    protected int k = 11;

    protected double f = 10;

    public static int g = 2;

}

public class MainExample {

    public static int s = 2;

    public static void main(String[] args) {
        Example me = new Example();

        me.i = 12;

        System.out.println(me.i);

        me.j = 13;

        System.out.println(me.j);

        me.f = 1.3;

        System.out.println(me.f);

        me.g = 16;

        System.out.println(me.g);

        s = 17;

        System.out.println(s);

    }
}