package com.yoti.entity;

import java.util.List;

/**
 * Created by zhuanghua on 2018/1/5.
 */
public class RequestPojo {

    private int[] roomSize;
    private int[] coords;
    private List<int[]> patches;

    private String instructions;

    //需要显式地构造器
    public RequestPojo() {

    }

    public int[] getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(int[] roomSize) {
        this.roomSize = roomSize;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public int[] getCoords() {
        return coords;
    }

    public void setCoords(int[] coords) {
        this.coords = coords;
    }

    public List<int[]> getPatches() {
        return patches;
    }

    public void setPatches(List<int[]> patches) {
        this.patches = patches;
    }
}
