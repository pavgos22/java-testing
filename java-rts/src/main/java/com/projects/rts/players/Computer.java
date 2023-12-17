package com.projects.rts.players;

import com.projects.rts.units.Paper;
import com.projects.rts.units.Rock;
import com.projects.rts.units.Scissors;
import com.projects.rts.units.Unit;

import java.util.Random;

public class Computer {
    private String move;
    private final String name = "Computer";

    public String getMove() {
        return move;
    }

    public Unit move() {
        Random rand = new Random();
        int randInt = rand.nextInt(3);
        return switch (randInt) {
            case 0 -> {this.move = "Rock"; yield new Rock();}
            case 1 -> {this.move = "Paper"; yield new Paper();}
            case 2 -> {this.move = "Scissors"; yield new Scissors();}
            default -> null;
        };
    }

    public String getName() {
        return this.name;
    }
}
