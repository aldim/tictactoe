package com.aldim.tictactoe;

import com.aldim.tictactoe.service.Game;
import com.aldim.tictactoe.service.impl.TicTacToe;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Бобро пожаловать, нажмите 1 для старта игры в кр-нл");
        //Scanner scanner = new Scanner(System.in);
        //int i = scanner.nextInt();
        //if (i == 1) {
            Game game = new TicTacToe();
            game.start();
        //}
    }
}
