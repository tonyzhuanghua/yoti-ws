package com.yoti.service.clean;

import com.yoti.entity.Dirt;
import com.yoti.entity.DtoPojo;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by zhuanghua on 2018/1/5.
 */
public class CleanImpl implements Clean {
    public void cleanDirt(DtoPojo dtoPojo) {
        List<Dirt> dirts = dtoPojo.getDirts();
        final int hooverX = dtoPojo.getHoover().getHooverX();
        final int hooverY = dtoPojo.getHoover().getHooverY();

        if (dirts != null && dirts.size() > 0) {
            List<Dirt> newDirts = dirts.stream()
                    .filter(e -> e.getDirtX() != hooverX || e.getDirtY() != hooverY)
                    .collect(Collectors.toList());
            dtoPojo.setDirts(newDirts);
        }

    }
}
