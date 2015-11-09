package Tank;

public class Tank {
    static int counter = 0;
    boolean full = false;
    int id;

    Tank() {
        id = ++counter;
        System.out.println(String.format("Tank %d created", id));
    }

    @Override
    protected void finalize() throws Throwable {
        // This does nothing, it only prevents unexpected behavior if we extend another class in the future
        super.finalize();

        if (full) System.out.println(String.format("Error: destroying full tank %d", id));
        else System.out.println(String.format("Tank %d cleaned up", id));
    }

    public void fill() {
        this.full = true;
    }

    public void empty() {
        this.full = false;
    }
}
