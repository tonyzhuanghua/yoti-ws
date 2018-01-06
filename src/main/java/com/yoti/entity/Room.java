package com.yoti.entity;

/**
 * Created by zhuanghua on 2018/1/5.
 */
public class Room {

    private int roomX;
    private int roomY;

    public Room(int roomX, int roomY) {
        this.roomX = roomX;
        this.roomY = roomY;
    }

    public int getRoomX() {
        return roomX;
    }

    public void setRoomX(int roomX) {
        this.roomX = roomX;
    }

    public int getRoomY() {
        return roomY;
    }

    public void setRoomY(int roomY) {
        this.roomY = roomY;
    }
}
