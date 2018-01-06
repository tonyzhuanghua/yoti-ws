package com.yoti.biz;

import com.yoti.entity.*;
import com.yoti.service.CleanOperation;
import com.yoti.service.move.Direction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ActionBiz {

    public ResponsePojo processClean(RequestPojo requestPojo) throws Exception{

        int[] roomSize = requestPojo.getRoomSize();
        int[] coords = requestPojo.getCoords();
        List<int[]> patches = requestPojo.getPatches();
        String instructions = requestPojo.getInstructions();

        Room room = new Room(roomSize[0], roomSize[1]);
        Hoover hoover = new Hoover(coords[0], coords[1]);
        List<Dirt> dirts = new ArrayList<>();
        patches.stream().forEach(e -> {
            Dirt dirt = new Dirt(e[0], e[1]);
            dirts.add(dirt);
        });

        Pojo pojo = new Pojo();
        pojo.setRoom(room);
        pojo.setHoover(hoover);
        pojo.setDirts(dirts);


        CleanOperation cleanOperation = CleanOperation.init(pojo);


        for (char c : instructions.toCharArray()) {
            String direction = String.valueOf(c);
            if (direction.equals("E")) {
                cleanOperation.moveAndClean(Direction.EAST);
            } else if (direction.equals("W")) {
                cleanOperation.moveAndClean(Direction.WEST);
            } else if (direction.equals("N")) {
                cleanOperation.moveAndClean(Direction.NORTH);
            } else if (direction.equals("S")) {
                cleanOperation.moveAndClean(Direction.SOUTH);
            }

        }


        Hoover finalPosition = pojo.getHoover();
        List<Dirt> finalDirts = pojo.getDirts();

        int[] finalCoords = {finalPosition.getHooverX(), finalPosition.getHooverY()};
        int cleanPatches = patches.size() - finalDirts.size();

        ResponsePojo responsePojo = new ResponsePojo();
        responsePojo.setCoords(finalCoords);
        responsePojo.setPatches(cleanPatches);

        return responsePojo;


    }

}
