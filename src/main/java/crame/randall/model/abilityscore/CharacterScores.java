package crame.randall.model.abilityscore;

import org.springframework.context.annotation.Configuration;

import java.beans.ConstructorProperties;

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
    @ConstructorProperties({"STR", "DEX", "CON", "INT", "WIS", "CHA"})
   public CharacterScores(int STRScore, int DEXScore, int CONScore, int INTScore, int WISScore, int CHAScore){
         STR = new Strength(STRScore);
         DEX = new Dexterity(DEXScore);
         CON = new Constitution(CONScore);
         INT = new Intelligence(INTScore);
         WIS = new Wisdom(WISScore);
         CHA = new Charisma(CHAScore);
    }/**/

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
