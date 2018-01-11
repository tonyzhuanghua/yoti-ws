package com.yoti.service;

import com.yoti.entity.DtoPojo;
import com.yoti.service.clean.CleanImpl;
import com.yoti.service.move.Direction;
import com.yoti.service.move.MoveImpl;

/**
 * Created by zhuanghua on 2018/1/5.
 */
public class CleanOperation {
    private DtoPojo status;

    private CleanOperation(DtoPojo dtoPojo) {
        status = dtoPojo;
    }

    public static CleanOperation init(DtoPojo dtoPojo) {
        return new CleanOperation(dtoPojo);
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

    public DtoPojo getPojo() {
        return status;
    }
}
