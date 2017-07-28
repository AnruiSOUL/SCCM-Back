package crame.randall.Entity.AbilityScoreGenerator;

import crame.randall.Entity.Dice.Dice;

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

    public int[] standardGenerator(){
        int[] values = new int[6];
        for (int i = 0; i<6; i++){
            int[] results = standardCreation();
            values[i] =  standardValue(results);
        }
        return values;
    }



}
