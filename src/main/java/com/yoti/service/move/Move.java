package com.yoti.service.move;

import com.yoti.entity.Pojo;

/**
 * Created by zhuanghua on 2018/1/5.
 */
public interface Move {

    void moveStep(Pojo pojo, Direction direction);
}
