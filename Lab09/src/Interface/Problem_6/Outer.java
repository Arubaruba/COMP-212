package Interface.Problem_6;

public class Outer {
    private int var1 = 1;

    class Inner {
        private int var2 = 2;

        public void printOuterVar(Outer outer) {
            System.out.println("Outer var1: " + outer.var1);
        }
    }

    public void printOuterVar() {
        Inner inner = new Inner();
        inner.printOuterVar(this);
    }

    public void printInnerVar() {
        Inner inner = new Inner();
        System.out.println("Outer var2: " + inner.var2);
    }

    public static void main(String args[]) {
        Outer outer = new Outer();
        // Both of these work!
        outer.printOuterVar();
        outer.printInnerVar();
    }
}
