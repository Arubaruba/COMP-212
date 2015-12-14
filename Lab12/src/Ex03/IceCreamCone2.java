package Ex03;

import java.util.Objects;

public class IceCreamCone2 extends IceCreamCone {
    public IceCreamCone2() throws IceCreamConeException {
        super();
    }

    @Override
    public void setFlavor(String flavor) throws IceCreamConeException {
        if (!Objects.equals(flavor, "Apple") && !Objects.equals(flavor, "Blueberry")) {
            throw new IceCreamConeException("Invalid flavor: " + flavor + "\nMust be either Apple or Blueberry");
        }
        super.setFlavor(flavor);
    }
}
