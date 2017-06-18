package crame.randall.Entity.CharacterScore;


import org.springframework.context.annotation.Configuration;

/**
 * Created by randallcrame on 3/24/17.
 */

@Configuration
public class CharacterScores {

    private Strength STR;
    private Dexterity DEX;
    private Constitution CON;
    private Intelligence INT;
    private Wisdom WIS;
    private Charisma CHA;

    public CharacterScores(){}
    public CharacterScores(Strength STR, Dexterity DEX, Constitution CON, Intelligence INT, Wisdom WIS, Charisma CHA){
         this.STR = STR;
         this.DEX = DEX;
         this.CON = CON;
         this.INT = INT;
         this.WIS = WIS;
         this.CHA = CHA;
    }

    public Strength getSTR() {
        return STR;
    }

    public void setSTR(Strength STR) {
        this.STR = STR;
    }

    public Dexterity getDEX() {
        return DEX;
    }

    public void setDEX(Dexterity DEX) {
        this.DEX = DEX;
    }

    public Constitution getCON() {
        return CON;
    }

    public void setCON(Constitution CON) { this.CON = CON; }

    public Intelligence getINT() {
        return INT;
    }

    public void setINT(Intelligence INT) {
        this.INT = INT;
    }

    public Wisdom getWIS() {
        return WIS;
    }

    public void setWIS(Wisdom WIS) {
        this.WIS = WIS;
    }

    public Charisma getCHA() {
        return CHA;
    }

    public void setCHA(Charisma CHA) {
        this.CHA = CHA;
    }


}
