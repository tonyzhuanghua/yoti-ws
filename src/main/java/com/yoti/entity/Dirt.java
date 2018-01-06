package com.yoti.entity;

/**
 * Created by zhuanghua on 2018/1/5.
 */
public class Dirt {

    private int dirtX;
    private int dirtY;
    public Dirt(){}
    public Dirt(int dirtX, int dirtY) {
        this.dirtX = dirtX;
        this.dirtY = dirtY;
    }

    public int getDirtX() {
        return dirtX;
    }

    public void setDirtX(int dirtX) {
        this.dirtX = dirtX;
    }

    public int getDirtY() {
        return dirtY;
    }

    public void setDirtY(int dirtY) {
        this.dirtY = dirtY;
    }


    public int hashCode() {
        final int seed = 88;
        return seed * (dirtX + 10) * (dirtY + 11);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Dirt other = (Dirt) o;
        if (other.dirtY == dirtY && other.dirtX == dirtX) return true;
        else
            return false;
    }

}
