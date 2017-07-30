package crame.randall.Entity.AbilityScoreGenerator;

import crame.randall.Entity.Dice.Dice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class AbilityScoreGenerator {

    public AbilityScoreGenerator(){}

    private int[] standardCreation(){
        int[] results = Dice.multiDiceRoll(4,6);
        return results;
    }

    private int standardValue(int[] results){
        Arrays.sort(results);
         return IntStream.of(results).sum() - results[0];
    }

    public ArrayList<int[]> standardGenerator(){
        ArrayList<int[]>  values = new ArrayList<>();

        for (int i = 0; i<6; i++){
            int[] diceResults = new int[5];
            int[] diceCreation = standardCreation();
            System.arraycopy(diceCreation, 0, diceResults, 0,4 );
            diceResults[4] = standardValue(diceCreation);
            values.add(diceResults);
        }
        return values;
    }

    private int[] classicCreation(){
        int[] results = Dice.multiDiceRoll(3, 6);
        return results;
    }

    private int classicValue(int[] results){
        return IntStream.of(results).sum();
    }

    public ArrayList<int[]> classicGenerator(){
        ArrayList<int[]>  values = new ArrayList<>();

        for (int i = 0; i<6; i++){
            int[] diceResults = new int[4];
            int[] diceCreation = classicCreation();
            System.arraycopy(diceCreation, 0, diceResults, 0,3 );
            diceResults[3] = classicValue(diceCreation);
            values.add(diceResults);
        }
        return values;
    }

    private int[] heroicCreation(){
        int[] results = Dice.multiDiceRoll(2, 6);
        return results;
    }

    private int heroicValue(int[] results){
        return IntStream.of(results).sum() + 6;
    }

    public ArrayList<int[]> heroicGenerator(){
        ArrayList<int[]>  values = new ArrayList<>();

        for (int i = 0; i<6; i++){
            int[] diceResults = {0,0,6,0};
            int[] diceCreation = heroicCreation();
            System.arraycopy(diceCreation, 0, diceResults, 0,2 );
            diceResults[3] = classicValue(diceCreation);
            values.add(diceResults);
        }
        return values;
    }

}
