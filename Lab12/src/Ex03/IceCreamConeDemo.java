package Ex03;

public class IceCreamConeDemo {
    public static void main(String args[]) {
        // try to create two ice cream cones
        try {
            System.out.println("Creating IceCreamCone");
            new IceCreamCone();

            System.out.println("Creating IceCreamCone2");
            new IceCreamCone2();

            System.out.println("Successfully created two ice cream cones");
        } catch (IceCreamConeException iceCreamConeException) {
            System.out.println("Unable to create ice cream cone; got error: " + iceCreamConeException.getMessage());
        }

    }
}
