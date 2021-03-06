package com.yoti.service;

import com.yoti.entity.Dirt;
import com.yoti.entity.Hoover;
import com.yoti.entity.DtoPojo;
import com.yoti.entity.Room;
import com.yoti.service.move.Direction;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by zhuanghua on 2018/1/5.
 */
public class TestCleanOperation {

    private DtoPojo dtoPojo = new DtoPojo();
    private int orgDirtSize;

    @Before
    public void setUp() throws Exception {
        Room room = new Room(5, 5);
        Hoover hoover = new Hoover(1, 2);
        dtoPojo.setRoom(room);
        dtoPojo.setHoover(hoover);

        List<Dirt> dirts = new ArrayList<Dirt>();
        dirts.add(new Dirt(1, 0));
        dirts.add(new Dirt(2, 2));
        dirts.add(new Dirt(2, 3));

        dtoPojo.setDirts(dirts);
        orgDirtSize = dirts.size();
    }

    @Test
    public void move_a_step() throws Exception {

        CleanOperation.init(dtoPojo).move(Direction.EAST);

        int hooverX = dtoPojo.getHoover().getHooverX();
        assertEquals(2, hooverX);


    }

    @Test
    public void move_three_steps() throws Exception {

        CleanOperation.init(dtoPojo)
                .move(Direction.EAST)
                .move(Direction.EAST)
                .move(Direction.EAST);

        int hooverX = dtoPojo.getHoover().getHooverX();
        assertEquals(4, hooverX);


    }

    @Test
    public void move_five_steps() throws Exception {

        CleanOperation.init(dtoPojo)
                .move(Direction.EAST)
                .move(Direction.EAST)
                .move(Direction.EAST)
                .move(Direction.EAST)
                .move(Direction.EAST);

        int hooverX = dtoPojo.getHoover().getHooverX();
        assertEquals(5, hooverX);

    }

    @Test
    public void move_N_steps() throws Exception { //NNESEESWNWW

        CleanOperation.init(dtoPojo)
                .moveAndClean(Direction.NORTH)
                .moveAndClean(Direction.NORTH)
                .moveAndClean(Direction.EAST)
                .moveAndClean(Direction.SOUTH)
                .moveAndClean(Direction.EAST)
                .moveAndClean(Direction.EAST)
                .moveAndClean(Direction.SOUTH)
                .moveAndClean(Direction.WEST)
                .moveAndClean(Direction.NORTH)
                .moveAndClean(Direction.WEST)
                .moveAndClean(Direction.WEST);

        int hooverX = dtoPojo.getHoover().getHooverX();
        int hooverY = dtoPojo.getHoover().getHooverY();
        assertEquals(1, hooverX);
        assertEquals(3, hooverY);

        assertEquals(1, orgDirtSize - dtoPojo.getDirts().size());

    }
}
