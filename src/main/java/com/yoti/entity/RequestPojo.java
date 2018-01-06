package com.yoti.entity;

import java.util.List;

/**
 * Created by zhuanghua on 2018/1/5.
 */
public class RequestPojo {

    private int[] roomSize;
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
}
