package com.yoti.service.move;

import com.yoti.entity.Pojo;


/**
 * Created by zhuanghua on 2018/1/5.
 */
public class MoveImpl implements Move {
    public void moveStep(Pojo pojo, Direction direction) {

        int x = pojo.getHoover().getHooverX();
        int y = pojo.getHoover().getHooverY();

        if (direction.getDirection().equals("E")) {

            if (x < pojo.getRoom().getRoomX()) x++;

        } else if (direction.getDirection().equals("W")) {

            if (x > 1) x--;

        } else if (direction.getDirection().equals("N")) {

            if (y < pojo.getRoom().getRoomY()) y++;

        } else if (direction.getDirection().equals("S")) {

            if (y > 1) y--;
        }

        pojo.getHoover().setHooverX(x);
        pojo.getHoover().setHooverY(y);
    }
}
