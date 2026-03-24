package org.example;

import java.util.List;

public class Mission{
    String missionId;
    String date;
    String location;
    String comment = "";

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    String outcome;
    int damageCost;
    Curse curse;

    List<Sorcerer> sorcerers;
    List<Technique> techniques;

    public List<Sorcerer> getSorcerers() {
        return sorcerers;
    }

    public void setSorcerers(List<Sorcerer> sorcerers) {
        this.sorcerers = sorcerers;
    }

    public List<Technique> getTechniques() {
        return techniques;
    }

    public void setTechniques(List<Technique> techniques) {
        this.techniques = techniques;
    }

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
                "location: " + location + "\n" +
                "outcome : " + outcome + "\n" +
                "damage cost: " + damageCost + "\n" +
                "curse: " + curse +
                "\n\nsorcerers:\n " + sorcerers +
                "\n\ntechniques\n" + techniques +
                "\n" + comment;
    }
}
