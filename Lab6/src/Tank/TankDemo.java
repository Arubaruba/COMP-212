package Tank;

public class TankDemo {
    // Here we define tanks that wil go out of scope
    // we don't have to set them to null for them to be garbage collected
    static void separateScope() {
        Tank tank4 = new Tank();
        tank4.fill();
        Tank tank5 = new Tank();
        Tank tank6 = new Tank();

        tank4 = null;
    }

    public static void main(String args[]) {
        // unless we set these to null, the gc will never collect them because they are in the main function
        // os memory management will free the memory so finalize will never be called unless an object is set to null
        System.out.println("Creating tanks in main");
        Tank tank1 = new Tank();
        tank1.fill();
        Tank tank2 = new Tank();

        // We will never get the warning that this full tank is destroyed
        Tank tank3 = new Tank();
        tank1.fill();

        tank1 = null;

        System.out.println("Creating tanks in separate scope");

        TankDemo.separateScope();

        // Only tank
        System.gc();
    }
}
