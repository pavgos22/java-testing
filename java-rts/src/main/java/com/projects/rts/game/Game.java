package com.projects.rts.game;

import com.projects.rts.players.Computer;
import com.projects.rts.players.Player;
import com.projects.rts.units.Paper;
import com.projects.rts.units.Rock;
import com.projects.rts.units.Scissors;
import com.projects.rts.units.Unit;

public class Game {
    private Player player1;
    private Computer computer;
    public static void playerMoveText() {
        System.out.println("Enter your move (1 for Rock, 2 for Paper, 3 for Scissors, x to exit): ");
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
        System.out.println(player1.getName() + "[" + player1.getPoints() + "]");
        System.out.println(computer.getName() + "[" + computer.getPoints() + "]");
    }

    public void win() {
        System.out.println(player1.getName() + " wins!");
        player1.addPoints();
        score();
    }

    public void lose() {
        System.out.println("Draw!");
        score();
    }

    public void draw() {
        System.out.println(computer.getName() + " wins");
        computer.addPoints();
        score();
    }
}
