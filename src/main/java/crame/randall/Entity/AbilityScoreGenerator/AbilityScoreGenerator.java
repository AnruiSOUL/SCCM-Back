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



}
