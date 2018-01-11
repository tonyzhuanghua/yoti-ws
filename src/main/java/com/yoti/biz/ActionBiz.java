package com.yoti.biz;

import com.yoti.entity.*;
import com.yoti.service.CleanOperation;
import com.yoti.service.move.Direction;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class ActionBiz {

    public ResponsePojo processClean(RequestPojo requestPojo) throws Exception {

        //parse request and create data transfer object
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

        DtoPojo dtoPojo = new DtoPojo();
        dtoPojo.setRoom(room);
        dtoPojo.setHoover(hoover);
        dtoPojo.setDirts(dirts);

        // call CLeanOperation service
        // init the operation
        CleanOperation cleanOperation = CleanOperation.init(dtoPojo);

        // start operations
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

        // compose response
        Hoover finalPosition = dtoPojo.getHoover();
        List<Dirt> finalDirts = dtoPojo.getDirts();

        int[] finalCoords = {finalPosition.getHooverX(), finalPosition.getHooverY()};
        int cleanPatches = patches.size() - finalDirts.size();

        ResponsePojo responsePojo = new ResponsePojo();
        responsePojo.setCoords(finalCoords);
        responsePojo.setPatches(cleanPatches);

        return responsePojo;


    }

}
