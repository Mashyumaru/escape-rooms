package org.sebsy.demo.escaperooms.controller;

import org.sebsy.demo.escaperooms.bll.RoomService;

public class EscapeRoom2Controller {
    private RoomService roomService;

    public EscapeRoom2Controller(RoomService roomService) {
        this.roomService = roomService;
    }

    public void entreeSalle2() {
        System.out.println(roomService.entreeSalle());
    }

}
