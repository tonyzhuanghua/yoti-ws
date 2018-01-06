package com.yoti.service.move;

import com.yoti.entity.Pojo;


/**
 * Created by zhuanghua on 2018/1/5.
 */
public class MoveImpl implements Move {
    public void moveStep(Pojo pojo, Direction direction) {

        int x = pojo.getHoover().getHooverX();
        int y = pojo.getHoover().getHooverY();

        if (direction == Direction.EAST) {

            if (x < pojo.getRoom().getRoomX()) x++;

        } else if (direction == Direction.WEST) {

            if (x > 1) x--;

        } else if (direction == Direction.NORTH) {

            if (y < pojo.getRoom().getRoomY()) y++;

        } else if (direction == Direction.SOUTH) {

            if (y > 1) y--;
        }

        pojo.getHoover().setHooverX(x);
        pojo.getHoover().setHooverY(y);
    }
}
