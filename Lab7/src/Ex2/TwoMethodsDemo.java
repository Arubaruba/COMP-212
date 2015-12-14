package Ex2;

public class TwoMethodsDemo {
    public static void main(String args[]) {
        TwoMethods tm = new TwoMethods();
        tm.m1();
        System.out.println(tm);

        TwoMethodsExt twoMethodsExt =  new TwoMethodsExt();
        // The parent class calls a function which calls a function that was overridden in the child
        twoMethodsExt.m1();
    }
}
