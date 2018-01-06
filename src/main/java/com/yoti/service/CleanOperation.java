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

    public CleanOperation move(Direction direction) {
        new MoveImpl().moveStep(status, direction);
        return this;
    }

    public CleanOperation clean() {
        new CleanImpl().cleanDirt(status);
        return this;
    }

    public CleanOperation moveAndClean(Direction direction) {
        new MoveImpl().moveStep(status, direction);
        new CleanImpl().cleanDirt(status);
        return this;
    }

    public Pojo getPojo() {
        return status;
    }
}
