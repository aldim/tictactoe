package com.aldim.tictactoe.domain;


public class Field {
    private int[][] field = new int[3][3];

    public boolean put(int x, int y, Player player) {
        int value = field[y][x];
        if (value != 0) return false;
        field[y][x] = player.getSign();
        return true;
    }

    public String getView() {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 3; i++) {
            builder.append("|" + getChar(i,0) + "|" + getChar(i,1) + "|" + getChar(i,2) + "|\n");
        }
        return builder.toString();
    }

    private char getChar(int y,int x) {
        int i = field[y][x];
        if(i == 1) return 'x';
        if(i == 2) return 'o';
        return ' ';
    }

    public boolean hasEnd() {
        //проверяем по горизонтали
        for(int i = 0; i < 3; i++) {
            boolean horizontal = (field[0][i] == field[1][i])
                    && (field[1][i] == field[2][i])
                    && (field[1][i] != 0);
            if (horizontal) return true;
        }

        //проверяем по вертикали
        for(int i = 0; i < 3; i++) {
            boolean vertical = (field[i][0] == field[i][1])
                    && (field[i][1] == field[i][2])
                    && (field[i][1] != 0);
            if (vertical) return true;
        }

        //проверяем по диагонали
            boolean diagonal = (field[0][0] == field[1][1]) && (field[1][1] == field[2][2]) && (field[1][1] != 0)
                    ||
                    (field[0][2] == field[1][1]) && (field[1][1] == field[2][0]) && (field[1][1] != 0);
        return diagonal;
    }
}
