package com.yoti.entity;

public class RoomView {

    private String[][] patches;

    private String[] coords;

    private String instructions;

    private String[] roomSize;

    @Override
    public String toString()
    {
        return "ClassPojo [patches = "+patches+", coords = "+coords+", instructions = "+instructions+", roomSize = "+roomSize+"]";
    }

    public String[][] getPatches() {
        return patches;
    }

    public void setPatches(String[][] patches) {
        this.patches = patches;
    }

    public String[] getCoords() {
        return coords;
    }

    public void setCoords(String[] coords) {
        this.coords = coords;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String[] getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(String[] roomSize) {
        this.roomSize = roomSize;
    }
}
