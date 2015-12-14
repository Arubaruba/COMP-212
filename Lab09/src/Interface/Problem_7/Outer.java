package Interface.Problem_7;

public class Outer {

    public interface SimpleInterface {
        public Inner getInner();
    }

    private class Inner implements SimpleInterface {

        @Override
        public Inner getInner() {
            return new Inner();
        }
    }

    public SimpleInterface get() {
        return new Inner();
    }


    public static void main(String args[]) {
        Outer outer = new Outer();
        SimpleInterface simpleInterface = outer.get();
        Inner i = (Inner) simpleInterface;
    }
}
