package com.projects.rts;

import com.projects.rts.players.Computer;
import com.projects.rts.players.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");

        String playerName = input.nextLine();
        Player player = new Player(playerName);
        Computer computer = new Computer();

        while(true) {
            player.move();

        }
    }
}