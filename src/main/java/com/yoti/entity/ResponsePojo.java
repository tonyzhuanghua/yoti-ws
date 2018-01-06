package com.yoti.entity;

import java.util.List;

/**
 * Created by zhuanghua on 2018/1/5.
 */
public class ResponsePojo {
    private Room room;
    private Hoover hoover;
    private List<Dirt> dirts;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Hoover getHoover() {
        return hoover;
    }

    public void setHoover(Hoover hoover) {
        this.hoover = hoover;
    }

    public List<Dirt> getDirts() {
        return dirts;
    }

    public void setDirts(List<Dirt> dirts) {
        this.dirts = dirts;
    }
}
