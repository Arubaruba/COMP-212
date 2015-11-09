package Ships;

public class CargoShip extends Ship {
    int tonnage;

    public CargoShip(String name, String yearBuilt, int tonnage) {
        super(name, yearBuilt);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Cargo Ships.Ship name: " + name + ", tonnage: " + tonnage;
    }
}
