package Interface.Problem_4;

public class Implementor extends Concrete implements ABC {
    @Override
    public void abc1() {
        System.out.println("Implementor class called method abc1");
    }

    @Override
    public void a1() {
        System.out.println("Implementor class called method a1");
    }

    @Override
    public void a2() {
        System.out.println("Implementor class called method a2");
    }

    @Override
    public void b1() {
        System.out.println("Implementor class called method b1");
    }

    @Override
    public void b2() {
        System.out.println("Implementor class called method b2");
    }

    @Override
    public void c1() {
        System.out.println("Implementor class called method c1");
    }

    @Override
    public void c2() {
        System.out.println("Implementor class called method c2");
    }

    @Override
    void concreteMethod() {
        System.out.println("Implementor class called method concreteMethod");
    }
}
