package AccessModifiers;

public class MainExample2 {

    public static void main(String[] args) {

        Inner inner = new Inner();

        System.out.println(inner.k);

    }

    private static class Inner {

        protected int k;

    }

}
