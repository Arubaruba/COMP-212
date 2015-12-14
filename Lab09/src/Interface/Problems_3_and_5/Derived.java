package Interface.Problems_3_and_5;

public class Derived extends Abstract implements StaticFinal {
    @Override
    void abstract1() {
        System.out.println("Derived called abstract1");
    }

    public static void main(String args[]) {
        Derived derived = new Derived();
        derived.abstract1();
    }
}
