package com.lseg.homework8;

public class Main {
    public static void main(String[] args) {

        Bed bed = new Bed(2,2,"red", "kingSize");
        Wardrobe wardrobe = new Wardrobe(4,1, "brown", "wood", 4);
        Dimensions dimensions = new Dimensions(20,2, "white");

        Room myRoom = new Room(bed, wardrobe, dimensions);

        myRoom.getWardrobe();
    }
}
