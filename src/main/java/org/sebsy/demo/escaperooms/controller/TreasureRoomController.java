package org.sebsy.demo.escaperooms.controller;

import org.sebsy.demo.escaperooms.bll.TreasureService;

public class TreasureRoomController {
    private TreasureService tresorService;

    public String fin() {
        return tresorService.ouvrir();
    }

    public void setTresorService(TreasureService tresorService) {
        this.tresorService = tresorService;
    }
}
