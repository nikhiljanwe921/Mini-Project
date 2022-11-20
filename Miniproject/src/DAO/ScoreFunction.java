package DAO;

public interface ScoreFunction {
    
    
    int getRuns();
    int getOver();
    int getTotalOvers();
    int getWickets();
    int getBall();
    double getRunRate();
    double getRequiredRunRate();
    
    boolean updateRuns(int runs);
    boolean updateOver();
    boolean updateTotalOvers(int overs);
    boolean updateWickets();
    boolean updateballs();
    boolean resetBalls();
    double updateRunRate();
    double updateRequiredRunRate();
    
    boolean updateCurrentBatsman(String name);
    boolean updateCurrentBowler(String name);
    
    String getCurrentBatsman();
    String getCurrentBowler();
    
    boolean updateRemark(String name);
    String getRemark();
        
    
}  