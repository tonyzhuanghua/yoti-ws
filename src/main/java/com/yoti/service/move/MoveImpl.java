package com.yoti.service.move;

import com.yoti.entity.DtoPojo;


/**
 * Created by zhuanghua on 2018/1/5.
 */
public class MoveImpl implements Move {
    public void moveStep(DtoPojo dtoPojo, Direction direction) {

        int x = dtoPojo.getHoover().getHooverX();
        int y = dtoPojo.getHoover().getHooverY();

        if (direction == Direction.EAST) {

            if (x < dtoPojo.getRoom().getRoomX()) x++;

        } else if (direction == Direction.WEST) {

            if (x > 1) x--;

        } else if (direction == Direction.NORTH) {

            if (y < dtoPojo.getRoom().getRoomY()) y++;

        } else if (direction == Direction.SOUTH) {

            if (y > 1) y--;
        }

        dtoPojo.getHoover().setHooverX(x);
        dtoPojo.getHoover().setHooverY(y);
    }
}
