package com.projects.rts.players;

import com.projects.rts.units.Paper;
import com.projects.rts.units.Rock;
import com.projects.rts.units.Scissors;
import com.projects.rts.units.Unit;

import java.util.Scanner;

public class Player {
    private int points = 0;

    public String getMove() {
        return move;
    }

    private String move;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void addPoints() {
        points++;
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Unit move() {
        System.out.println("Enter your move (1 for Rock, 2 for Paper, 3 for Scissors, x to exit): ");
        Scanner input = new Scanner(System.in);
        char choice = input.nextLine().charAt(0);
        return switch (choice) {
            case '1' -> {move = "Rock"; yield new Rock();}
            case '2' -> {move = "Paper"; yield new Paper();}
            case '3' -> {move = "Scissors"; yield new Scissors();}
            case 'x' -> {System.out.println("Are you sure you want to exit the program?\nPress y(yes) or n(no)");
                Scanner in = new Scanner(System.in);
                char confirmation = in.nextLine().charAt(0);
            yield null;}

            default -> null;
        };
    }
}
