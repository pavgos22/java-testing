package com.projects.rts.game;

import com.projects.rts.players.Computer;
import com.projects.rts.players.Player;

public class Game {
    private static Player player1;
    private static Computer computer;
    public static void playerMoveText() {
        System.out.println("Enter your move (1 for Rock, 2 for Paper, 3 for Scissors, x to exit): ");
    }

    public static void moveText () {
        System.out.println(player1.getName() + ": " + player1.getMove());
        System.out.println(computer.getName() + ": " + computer.getMove());
    }
}
