package com.tinyiko;

public class House extends Building{

    private int numberOfRooms = 10;

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public String toString() {
        return ("house");
    }
}
