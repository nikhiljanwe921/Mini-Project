package DAO;

import java.util.List;
import java.util.Set;

public interface PlayerInfo {

    Player getPlayer(String name);
    Set<Player> getAllPlayers();
    Player getAbility();
    Player getPosition();
    String getBattingTeamName();
    String getBowlingTeamName();
    Player getRuns();
    Player getWickets();
    Player getCaptain();
//    String getBatter();
    List<Player> getBatter();
    List<Player> getBowler();
    
    boolean addPlayer(Player player);
    boolean updateRuns();
    boolean updateWickets();
    boolean updateTeamName();
    String getAwayName();
    String getHomeName();
//    String getSide();
    
    boolean updateHomeSide(String choice,String choice2);
    boolean updateAwaySide(String choice,String choice2);
    
    boolean setTeamNoHomeA();
    boolean setTeamNoAwayB();
    
    int getTeamNoHomeA();
    int getTeamNoAwayB();
    
    String getAwayPreference();
    String getHomePreference();
    
    String getAwayPreference2();
    String getHomePreference2();
    
    boolean setRunAndBall(int runs,String pName);
    int getRunAndBall();
    
}
