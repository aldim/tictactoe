package com.aldim.tictactoe.service.impl;

import com.aldim.tictactoe.domain.Field;
import com.aldim.tictactoe.domain.Player;
import com.aldim.tictactoe.service.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToe implements Game {
    private List<Player> players = new ArrayList<>();
    private Field field;

    public TicTacToe() {
        this.field = new Field();
        players.add(new Player(1));
        players.add(new Player(2));
    }

    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        //Просим ввести координаты для точки игрок1
        //Отображаем поле
        //Проверяем на победителя
        //Просим ввести координаты для точки игрок2
        //Отображаем поле
        //Проверяем на победителя

        drawField();
        int i = 0;
        while(!field.hasEnd()) {
            makeTurn(scanner, players.get(i%2));
            drawField();
            i++;
        }
    }

    private void makeTurn(Scanner scanner, Player player) {
        System.out.println("Ход игрока " + player.getSign());
        System.out.println("Введите координаты вида x y прим:1 1 x[1;3],y[1;3] =");
        String input = scanner.nextLine();
        String[] s = input.trim().split(" ");

        int x = Integer.valueOf(s[0]);
        int y = Integer.valueOf(s[1]);

        if(isValid(x) && isValid(y)) {
            field.put(x-1, y-1, player);
        }

    }

    private boolean isValid(int val) {
        return val >= 1 && val <= 3;
    }

    private void drawField() {
        System.out.println(field.getView());
    }
}
