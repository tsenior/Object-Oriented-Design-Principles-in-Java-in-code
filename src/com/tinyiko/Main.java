package com.tinyiko;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // List of buildings
        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building());
        buildings.add(new Building());
        printBuildings(buildings);

        // List of offices
        List<Office> offices = new ArrayList<>();
        offices.add(new Office());
        offices.add(new Office());
        printBuildings(offices);

        // List of houses
        List<House> houses = new ArrayList<>();
        houses.add(new House());
        houses.add(new House());
        printBuildings(houses);

        //Adding a house to houses lists and to buildings list
        addHouseToList(houses);
        printBuildings(houses);

        addHouseToList(buildings);
        printBuildings(buildings);

    }

    private static void printBuildings(List<? extends Building> buildings) {
        for (int i = 0; i < buildings.size(); i++) {
            System.out.println( buildings.get(i).toString() + " "+ (i + 1));
        }
        System.out.println();
    }

    // (List<House> houses) can only pass in a list of house, but if i want to pass a lists of buildings(super class of house) ?
    private static void addHouseToList(List<? super House> houses) {
        houses.add(new House());
        System.out.println();
    }
}
