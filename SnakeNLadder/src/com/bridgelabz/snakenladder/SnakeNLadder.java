package com.bridgelabz.snakenladder;

import java.util.Random;

public class SnakeNLadder
{
    int firstPlayer = 0;

    public int rollDice()        //rollDice() method is used to generate a random number between 1 and 6.
    {
        Random r = new Random();
        int n=r.nextInt(6);
        n=n+1;
        return (n);
    }
}