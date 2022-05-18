package com.aldim.tictactoe.domain;

import java.util.ArrayList;
import java.util.List;

public class GameSession {
    private Field field = new Field();
    private List<Player> playerList = new ArrayList<>();
    private Status status;

    public void makeTurn(int x, int y, int player) {
        field.put(x-1, y-1, playerList.get(player));
    }

//    public Status checkStatus() {
//
//    }
//
//    public String drawTable() {
//        return field.getView();
//    }

}
