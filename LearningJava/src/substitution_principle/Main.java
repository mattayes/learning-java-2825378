package substitution_principle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Building building = new Building();
        Office office = new Office();
        build(building);
        build(office);

        List<Building> buildings = new ArrayList();
        buildings.add(new Building());
        printBuildings(buildings);

        List<Office> offices = new ArrayList();
        offices.add(new Office());
        printBuildings(offices);

        List<House> houses = new ArrayList();
        addHouseToList(houses);
        addHouseToList(buildings);

        System.out.println(houses);
        System.out.println(buildings);
    }

    private static void build(Building building) {
        System.out.printf("Constructing a new %s\n", building.toString());
    }

    private static void printBuildings(List<? extends Building> buildings) {
        for (int i = 0; i < buildings.size(); i++) {
            System.out.printf("%d: %s\n", i+1, buildings.get(i).toString());
        }
    }

    static void addHouseToList(List<? super House> buildings) {
        buildings.add(new House());
    }
}
