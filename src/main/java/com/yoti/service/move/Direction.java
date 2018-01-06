package com.yoti.service.move;

/**
 * Created by zhuanghua on 2018/1/5.
 */
public enum Direction {

    EAST("E"), NORTH("N"), SOUTH("S"), WEST("W");

    private String direction;

    Direction(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}
