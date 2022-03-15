package com.bridgelabz.snakenladder;

import java.util.Random;

public class SnakeNLadder {
    final static int WINPOINT = 100;
    public static boolean isWin(int player)          //isWin() returns true, if the player value reaches to WINPOINT.
    {
        return WINPOINT == player;
    }
    public static void main(String[] args) {
        int firstPlayer = 0, secondPlayer = 0;
        int currentPlayer = -1;
        int count = 1;

        Random r = new Random();
        int diceValue = r.nextInt(6) + 1;
        System.out.println("\nDice value is: " + diceValue);

        while (firstPlayer < 100 && secondPlayer < 100) {
            System.out.println(currentPlayer == -1 ? "\nFIRST PLAYER TURN" : "\nSECOND PLAYER TURN");
            int option = r.nextInt(3) + 1;
            if (currentPlayer == -1) {
                switch (option) {
                    case 1 -> {
                        System.out.print("First Player gets ladder move: ");
                        firstPlayer = firstPlayer + diceValue;
                        if (firstPlayer > 100) {
                            firstPlayer = firstPlayer - diceValue;
                        }
                        System.out.println(firstPlayer);
                    }
                    case 2 -> System.out.println("First Player gets to stay");
                    case 3 -> {
                        System.out.print("First Player get snake move: ");
                        firstPlayer = firstPlayer - diceValue;
                        firstPlayer = Math.max(firstPlayer, 0);
                        System.out.println(firstPlayer);
                    }
                    default -> {
                    }
                }
                if(isWin(firstPlayer))
                {
                    System.out.println("First player wins");
                }
            } else {
                switch (option) {
                    case 1 -> {
                        System.out.print("Second Player gets ladder move: ");
                        secondPlayer = secondPlayer + diceValue;
                        if (secondPlayer > 100) {
                            secondPlayer = secondPlayer - diceValue;
                        }
                        System.out.println(secondPlayer);
                    }
                    case 2 -> System.out.println("Second Player gets to stay");
                    case 3 -> {
                        System.out.print("Second Player get snake move: ");
                        secondPlayer = secondPlayer - diceValue;
                        secondPlayer = Math.max(secondPlayer, 0);
                        System.out.println(secondPlayer);
                    }
                    default -> {
                    }
                }
                if(isWin(secondPlayer))
                {
                    System.out.println("Second player wins");
                }
            }
            count++;
            System.out.println("Number of time dice rolled: " + count);
            currentPlayer = -currentPlayer;
        }
    }
}