package Ex3;

public class D2 extends D1 {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Rest in peace, D2 Object");
    }
}
