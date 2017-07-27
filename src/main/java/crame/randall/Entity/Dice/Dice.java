package crame.randall.Entity.Dice;

import java.util.Random;

public class Dice {
    public Dice(){}

    static public int roll(int sides){
        Random random = new Random();
        return random.nextInt(sides)+1;
    }

    static public int[] multiDiceRoll(int numberOfDice, int diceSize){
        int[] diceResults = new int[numberOfDice];
        for (int i = 0; i < numberOfDice; i++) {
            diceResults[i] = Dice.roll(diceSize);
        }
        return diceResults;
    }

}
