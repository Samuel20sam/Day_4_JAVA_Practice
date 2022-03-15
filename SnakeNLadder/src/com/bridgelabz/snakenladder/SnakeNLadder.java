package com.bridgelabz.snakenladder;

import java.util.Random;

public class SnakeNLadder
{
    public static void main(String[] args)
    {
        int firstPlayer = 0;
        int count = 1;

        while (firstPlayer<100)
        {
            Random r = new Random();
            int diceValue = r.nextInt(6) + 1;
            System.out.println("\nDice value is: " + diceValue);

            int option = r.nextInt(3) + 1;
            switch (option)
            {
                case 1 ->
                        {
                            System.out.print("Player gets ladder move: ");
                            firstPlayer = firstPlayer + diceValue;
                            if (firstPlayer > 100) {
                                firstPlayer = firstPlayer - diceValue;
                            }
                            System.out.println(firstPlayer);
                        }
                case 2 -> System.out.println("Player gets to stay");
                case 3 ->
                        {
                            System.out.print("Player get snake move: ");
                            firstPlayer = firstPlayer - diceValue;
                            firstPlayer = Math.max(firstPlayer, 0);
                            System.out.println(firstPlayer);
                        }
                default -> {
                }
            }
        }
        count++;
        System.out.println("Number of time dice rolled: " +count);
    }
}