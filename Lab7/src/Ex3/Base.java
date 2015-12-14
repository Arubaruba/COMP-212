package Ex3;

public class Base {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Rest in peace, Base Object");
    }
}
