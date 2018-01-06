package com.yoti.service;

import com.yoti.entity.ResponsePojo;
import com.yoti.service.clean.CleanImpl;
import com.yoti.service.move.Direction;
import com.yoti.service.move.MoveImpl;

/**
 * Created by zhuanghua on 2018/1/5.
 */
public class CleanOperation {
    private ResponsePojo status;

    private CleanOperation(ResponsePojo pojo) {
        status = pojo;
    }

    public static CleanOperation init(ResponsePojo pojo) {
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

    public ResponsePojo getPojo() {
        return status;
    }
}
