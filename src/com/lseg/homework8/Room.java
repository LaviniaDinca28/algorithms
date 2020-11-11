package com.lseg.homework8;

public class Room {

    private Bed bed;
    private Wardrobe wardrobe;
    private Dimensions dimensions;

    public Room(Bed bed, Wardrobe wardrobe, Dimensions dimensions) {
        this.bed = bed;
        this.wardrobe = wardrobe;
        this.dimensions = dimensions;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public void setWardrobe(Wardrobe wardrobe) {
        this.wardrobe = wardrobe;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }
}
