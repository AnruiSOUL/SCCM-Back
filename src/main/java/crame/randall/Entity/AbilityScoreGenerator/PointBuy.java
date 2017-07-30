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
}
