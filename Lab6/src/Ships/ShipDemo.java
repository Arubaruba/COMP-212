package Ships;

public class ShipDemo {
    public static void main(String args[]) {
        Ship[] Shiparray = {
                new Ship("ship1", "2011"),
                new CruiseShip("cruiseShip1", "2011", 3000),
                new CargoShip("cargoShip1", "2010", 1000),
        };

        for(Ship ship : Shiparray) {
            System.out.println(ship.toString());
        }
    }
}
