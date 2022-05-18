package com.aldim.tictactoe.domain;

public class Player {
    private String name = "default name";
    private final int sign;

    public Player(int sign) {
        this.sign = sign;
    }

    public String getName() {
        return name;
    }

    public int getSign() {
        return sign;
    }
}
