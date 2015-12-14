package Building;

public class TestUniversityBuilding {
    public static void main(String args[]) {
        UniversityBuilding europaBuilding = new EuropaBuilding();
        UniversityBuilding mainBuilding = new MainBuilding();

        // Demonstrating that all methods still work correctly

        System.out.println("\n\nDemonstrating that all methods still work correctly\n");

        europaBuilding.Method1();
        europaBuilding.Method2();
        europaBuilding.Method3();
        europaBuilding.Method4();

        mainBuilding.Method1();
        mainBuilding.Method2();
        mainBuilding.Method3();
        mainBuilding.Method4();

        System.out.println("\n\nUpcasting test\n");

        // Upcasting test

        UniversityBuilding universityBuildings[] = {
                new EuropaBuilding(),
                new EuropaBuilding(),
                new EuropaBuilding(),
                new EuropaBuilding(),
                new EuropaBuilding(),
                new MainBuilding(),
                new MainBuilding(),
                new MainBuilding(),
                new MainBuilding(),
                new MainBuilding()
        };

        EuropaBuilding europaBuilding1 = (EuropaBuilding) universityBuildings[0];
        europaBuilding1.Method1();

        MainBuilding mainBuilding1 = (MainBuilding) universityBuildings[9];
        mainBuilding1.Method2();
    }
}
