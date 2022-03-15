package com.bridgelabz.snakenladder;

import java.util.Random;

public class SnakeNLadder
{
    public static void main(String[] args)
    {
        int firstPlayer = 0;

        for (int i = 1; i < 10000; i++)
        {
            Random r = new Random();
            int diceValue = r.nextInt(6) + 1;
            System.out.println("Dice value is: " + diceValue);

            int option = r.nextInt(3) + 1;

            switch (option)
            {
                case 1 -> {
                    System.out.println("Player gets ladder move");
                    firstPlayer=firstPlayer+diceValue;
                }
                case 2 -> System.out.println("Player gets to stay");
                case 3 -> {
                    System.out.println("Player get snake move");
                    firstPlayer=firstPlayer+diceValue;
                }
            }
        }
    }
}