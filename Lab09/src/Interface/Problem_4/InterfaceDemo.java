package Interface.Problem_4;

public class InterfaceDemo {
    public static void useA(A a) {
        a.a1();
        a.a2();
    }

    public static void useB(B b) {
        b.b1();
        b.b2();
    }

    public static void useC(C c) {
        c.c1();
        c.c2();
    }

    public static void useABC(ABC abc) {
        abc.abc1();
    }

    public static void main(String args[]) {
        Implementor implementor = new Implementor();
        useA(implementor);
        useB(implementor);
        useC(implementor);
        useABC(implementor);

        implementor.concreteMethod();
    }
}
