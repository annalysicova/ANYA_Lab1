package org.example;

public class Mission{
    String missionId;
    String date;
    String outcome;
    int damageCost;
    Curse curse;



    public Curse getCurse() {
        return curse;
    }

    public void setCurse(Curse curse) {
        this.curse = curse;
    }

    public int getDamageCost() {
        return damageCost;
    }

    public void setDamageCost(int damageCost) {
        this.damageCost = damageCost;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMissionId() {
        return missionId;
    }

    public void setMissionId(String missionId) {
        this.missionId = missionId;
    }

    @Override
    public String toString()
    {
        return "missionId: " + missionId + "\n" +
                "date: " + date + "\n" +
                "outcome : " + outcome + "\n" +
                "damage cost: " + damageCost + "\n" +
                "curse: " + curse;
    }
}
