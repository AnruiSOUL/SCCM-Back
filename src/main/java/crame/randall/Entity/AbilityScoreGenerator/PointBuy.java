package crame.randall.Entity.AbilityScoreGenerator;

public class PointBuy {


    int pointPool;

    PointBuy(){}

    public int getPointPool() {
        return pointPool;
    }

    public void setPointPool(int pointPool) {
        this.pointPool = pointPool;
    }

    public void setPoolByCampaignType(String campaignType){
        switch (campaignType){
            case "low" : pointPool = 10; break;
            case "standard" : pointPool = 15; break;
            case "high" : pointPool = 20; break;
            case "epic" : pointPool = 25; break;
            default: pointPool = Integer.parseInt(campaignType);
        }
    }

    public int checkAbilityScoreCost(int score){
        switch(score){
            default:
            case 10: return 0;
            case 7: return -4;
            case 8: return -2;
            case 9: return -1;
            case 11: return 1;
            case 12: return 2;
            case 13: return 3;
            case 14: return 5;
            case 15: return 7;
            case 16: return 10;
            case 17: return 13;
            case 18: return 17;

        }
    }

    public int calculateAbilityScoreCost(int[] abilityScores){
        int pool = this.pointPool;
        for (int i = 0; i < abilityScores.length; i++){
            pool -= checkAbilityScoreCost(abilityScores[i]);
        }
        return pool;
    }
}
