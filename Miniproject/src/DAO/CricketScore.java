package DAO;

public class CricketScore {
    
    private int totalOver;
    private int Over;
    private int runs;
    private int wickets;
    private double runRate;
    private double requiredRunRate;

    public int getTotalOver() {
        return totalOver;
    }

    public void setTotalOver(int totalOver) {
        this.totalOver = totalOver;
    }

    public int getOver() {
        return Over;
    }

    public void setOver(int Over) {
        this.Over = Over;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public double getRunRate() {
        return runRate;
    }

    public void setRunRate(double runRate) {
        this.runRate = runRate;
    }

    public double getRequiredRunRate() {
        return requiredRunRate;
    }

    public void setRequiredRunRate(double requiredRunRate) {
        this.requiredRunRate = requiredRunRate;
    }

    @Override
    public String toString() {
        return "CricketScore{" + "totalOver=" + totalOver + ", Over=" + Over + ", runs=" + runs + ", wickets=" + wickets + ", runRate=" + runRate + ", requiredRunRate=" + requiredRunRate + '}';
    }
    
    
}
