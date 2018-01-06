package com.yoti.service.move;

import com.yoti.entity.ResponsePojo;

/**
 * Created by zhuanghua on 2018/1/5.
 */
public interface Move {

    void moveStep(ResponsePojo pojo, Direction direction);
}
