package com.yoti.service;

import com.yoti.entity.Pojo;
import com.yoti.service.clean.CleanImpl;
import com.yoti.service.move.Direction;
import com.yoti.service.move.MoveImpl;

/**
 * Created by zhuanghua on 2018/1/5.
 */
public class CleanOperation {
    private Pojo status;

    private CleanOperation(Pojo pojo) {
        status = pojo;
    }

    public static CleanOperation init(Pojo pojo) {
        return new CleanOperation(pojo);
    }


    // move action
    public CleanOperation move(Direction direction) {
        new MoveImpl().moveStep(status, direction);
        return this;
    }

    // clean action
    public CleanOperation clean() {
        new CleanImpl().cleanDirt(status);
        return this;
    }

    // move and clean combined
    public CleanOperation moveAndClean(Direction direction) {
        return move(direction).clean();
    }

    public Pojo getPojo() {
        return status;
    }
}
