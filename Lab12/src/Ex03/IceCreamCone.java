package Ex03;

import java.util.Scanner;

public class IceCreamCone {
    String flavor = "";
    int scoops;

    public IceCreamCone() throws IceCreamConeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set flavor: ");
        setFlavor(scanner.next());
        System.out.println("Set scoops: ");
        setScoops(scanner.nextInt());

    }

    public void setFlavor(String flavor) throws IceCreamConeException {
        this.flavor = flavor;
    }

    public void setScoops(int scoops) throws IceCreamConeException {
        if (scoops > 3 || scoops < 1) throw new IceCreamConeException("Invalid number of scoops: " + scoops);
        this.scoops = scoops;
    }
}
