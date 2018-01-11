package com.yoti.service.move;

import com.yoti.entity.DtoPojo;

/**
 * Created by zhuanghua on 2018/1/5.
 */
public interface Move {

    void moveStep(DtoPojo dtoPojo, Direction direction);
}
