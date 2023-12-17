package com.projects.rts.game;

import com.projects.rts.players.Computer;
import com.projects.rts.players.Player;
import com.projects.rts.units.Unit;

public class Game {
    private Player player1;
    private Computer computer;

    public Game(Player player1, Computer computer) {
        this.player1 = player1;
        this.computer = computer;
    }

    public static void playerMoveText() {
        System.out.print("Enter your move (1 for Rock, 2 for Paper, 3 for Scissors, x to exit): ");
    }

    public void moveText () {
        System.out.println(player1.getName() + ": " + player1.getMove());
        System.out.println(computer.getName() + ": " + computer.getMove());
    }

    public void calculateMove (Unit computerMove) {
        Integer moveResult = player1.move().beats(computerMove);
        switch (moveResult) {
            case -1 -> lose();
            case 0 -> draw();
            case 1 -> win();
        };
    }

    public void score() {
        moveText();
        System.out.println("*****Score*****");
        System.out.println(player1.getName() + ": [" + player1.getPoints() + "]");
        System.out.println(computer.getName() + ": [" + computer.getPoints() + "]");
    }

    public void win() {
        System.out.println(player1.getName() + " wins!");
        player1.addPoints();
        score();
    }

    public void draw() {
        System.out.println("Draw!");
        score();
    }

    public void lose() {
        System.out.println(computer.getName() + " wins");
        computer.addPoints();
        score();
    }
}
