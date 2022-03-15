package com.bridgelabz.snakenladder;

import java.util.Random;

public class SnakeNLadder
{
    public static void main(String[] args)
    {
        int firstPlayer = 0;

        for (int i=1; i>0; i++)
        {
        while (firstPlayer<100)
            {
                Random r = new Random();
                int diceValue = r.nextInt(6) + 1;
                System.out.println("\nNumber of roll: " + i);
                System.out.println("Dice value is: " + diceValue);

                int option = r.nextInt(3) + 1;
                switch (option)
                {
                    case 1 ->
                            {
                        System.out.print("Player gets ladder move: ");
                        System.out.println(firstPlayer = firstPlayer + diceValue);
                    }
                    case 2 -> System.out.println("Player gets to stay");
                    case 3 ->
                            {
                        System.out.print("Player get snake move: ");
                        System.out.println(firstPlayer = firstPlayer - diceValue);
                    }
                }
                firstPlayer = Math.max(firstPlayer, 0);
            }
        }
    }
}