package Ex3;

public class D1 extends Base {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Rest in peace, D1 Object");
    }
}
