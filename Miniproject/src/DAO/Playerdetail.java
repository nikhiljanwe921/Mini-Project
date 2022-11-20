package DAO;
import View.ScoreUpdater;
import java.sql.*;
import java.util.List;
import java.util.*;
//import static java.util.Collections.list;

public class Playerdetail implements PlayerInfo{

    @Override
    public Player getPlayer(String name) {
        Player p = new Player();
        try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("Select * from teams where pName=?");
            pst.setNString(1, name);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                p.setpName(rs.getString("pName"));
                p.setPsurName(rs.getString("PsurName"));
                p.setTeamName(rs.getString("TeamName"));
                p.setAbility(rs.getString("ability"));
                
            }
        
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return p;
    }

    public Playerdetail() {
    }
    
   
    
    @Override
    public Set<Player> getAllPlayers() {
        return null;
    }

    @Override
    public Player getAbility() {
        return null;
    }

    @Override
    public Player getPosition() {
        return null;
    }

    @Override
    public String getBattingTeamName() {
        Player p = new Player();
        try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("Select teamName from teams where side='batting'");
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                String a;
                a=(rs.getString("teamName"));
                return a;
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public String getBowlingTeamName() {
        try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("Select teamName from teams where side='bowling'");
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                String a;
                a=(rs.getString("teamName"));
                return a;
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Player getRuns() {
        return null;
    }

    @Override
    public Player getWickets() {
        return null;
    }

    @Override
    public boolean updateRuns() {
        return true;
    }

    @Override
    public boolean updateWickets() {
        return true;
    }

    @Override
    public boolean updateTeamName() {
        return true;
    }

    @Override
    public String getHomeName() {
       Player p = new Player();
        
        try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("select teamName from teams where teamGround ='home' ");
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                String a;
                a=rs.getString("TeamName");
                return a;  
            }
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
                return null;
    }
    
    @Override
    public String getAwayName() {
       Player p = new Player();
        
        try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("select teamName from teams where teamGround ='away' ");
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                String a;
                a=rs.getString("TeamName");
                return a;  
            }
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
                return null;
    }
    

    @Override
    public Player getCaptain() {
       Player p = new Player();
        try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("Select pName,pSurname from teams where teamGround=away");
//            pst.setNString(1, name);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                p.setpName(rs.getString("pName"));
                p.setPsurName(rs.getString("PsurName"));
//                p.setTeamName(rs.getString("TeamName"));
//                p.setAbility(rs.getString("ability"));
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return p;
    }

    @Override
    public boolean updateHomeSide(String choice,String choice2) {
        try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("update teams set side=?,side2=? where teamGround ='home' ");
            pst.setString(1,choice);
            pst.setString(2,choice2);
            int rs = pst.executeUpdate();
            if(rs>0)
                return true;  
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
                return false;
    }
    
    @Override
    public boolean updateAwaySide(String choice,String choice2) {
//       Player p = new Player();
        try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("update teams set side=?,side2=? where teamGround ='away' ");
            pst.setString(1,choice);
            pst.setString(2,choice2);
            int rs = pst.executeUpdate();
            if(rs>0)
                return true;  
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
                return false;
    }

    @Override
    public List<Player> getBatter() {
    
    ScoreUpdater s = new ScoreUpdater();
        List<Player> list = new ArrayList<>();
        try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("select pName,pSurname from teams where side ='Batting' ");
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                String a,b,c;
                a=rs.getString("pName");
                b=rs.getString("pSurname");
                
                Player pla = new Player(a, b);
                list.add(pla);
//                ScoreUpdater s = new ScoreUpdater();
//                s.batter1.addItem(rs.getString("pName"));
                
            }
        }catch(SQLException e){
            System.out.println("Message Error in getbatter :: "+e.getMessage());
        }
                return list; 
    }

    @Override
    public List<Player> getBowler() {
        List<Player> list = new ArrayList<>();
        try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("select pName,pSurname from teams where side ='Bowling' ");
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                String a,b,c;
                a=rs.getString("pName");
                b=rs.getString("pSurname");
                
                Player pla = new Player(a, b);
                list.add(pla);
//                ScoreUpdater s = new ScoreUpdater();
//                s.batter1.addItem(rs.getString("pName"));
            }
        }catch(SQLException e){
            System.out.println("Message Bowler Error from getBowler:: "+e.getMessage());
        }
                
        return list;
    }

    @Override
    public boolean addPlayer(Player player) {
    try{
        Connection con=ConnectionFactory.getConnection();
        PreparedStatement pst=con.prepareStatement("Insert into teams (playerID,pName,pSurname,ability,position,teamName,teamGround,fullName) values(?,?,?,?,?,?,?,?)");
//        (playerID,pName,pSurname,ability,position,teamName,teamGround)
        pst.setInt(1, player.getPlayerID());
        pst.setString(2, player.getpName());
        pst.setString(3, player.getPsurName());
        pst.setString(4, player.getAbility());
        pst.setString(5, player.getPosition());
        pst.setString(6, player.getTeamName());
        pst.setString(7, player.getTeamGround());
        pst.setString(8, player.FullPlayerName());

//        pst.setInt(1, player.setPlayerID("playerID"));
//        pst.setString(2, player.getpName());
//        pst.setString(3, player.getPsurName());
//        pst.setString(4, player.getAbility());
//        pst.setString(5, player.getPosition());
//        pst.setString(6, player.getTeamName());
//        pst.setString(7, player.getTeamGround());
        int a=pst.executeUpdate();
        if(a>0){
            return true;
        }
       }
       catch(Exception e){
           System.err.println("error in add player:"+e.getMessage());
       }
       return false;
        
    }

    @Override
    public boolean setTeamNoHomeA() {
    try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("update teams set teamNo=1 where teamGround ='home' ");
            int rs = pst.executeUpdate();
            if(rs>0)
                return true;  
        }catch(SQLException e){
            System.out.println("Error Message Team A as 1:: "+e.getMessage());
        }
                return false;
    }

    @Override
    public boolean setTeamNoAwayB() {
    try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("update teams set teamNo=2 where teamGround ='away' ");
            int rs = pst.executeUpdate();
            if(rs>0)
                return true;  
        }catch(SQLException e){
            System.out.println("Error Message Team A as 1:: "+e.getMessage());
        }
                return false;}

    @Override
    public int getTeamNoHomeA() {
    try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("select teamNo from teams where teamGround ='home' ");
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                int a;
                a=Integer.parseInt(rs.getString("TeamNo"));
                return a;  
            }
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
                return 0;
    }

    @Override
    public int getTeamNoAwayB() {
    try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("select teamNo from teams where teamGround ='away' ");
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                int a;
                a=Integer.parseInt(rs.getString("TeamNo"));
                return a;  
            }
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
                return 0;
    }

    @Override
    public String getAwayPreference() {
    try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("select side from teams where teamGround ='away' ");
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                String a;
                a=(rs.getString("side"));
                return a;  
            }
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
                return null;
    }

    @Override
    public String getHomePreference() {
    try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("select side from teams where teamGround ='home' ");
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                String a;
                a=(rs.getString("side"));
                return a;  
            }
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
                return null;
    }

    @Override
    public String getAwayPreference2() {
    try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("select side2 from teams where teamGround ='away' ");
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                String a;
                a=(rs.getString("side2"));
                return a;  
            }
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
                return null;}

    @Override
    public String getHomePreference2() {
    try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("select side2 from teams where teamGround ='home' ");
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                String a;
                a=(rs.getString("side2"));
                return a;  
            }
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
                return null;}

    @Override
    public boolean setRunAndBall(int runs,String pName) {
        try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("update teams set balls=balls+1,runs=runs+? where fullName =? ");
            pst.setInt(1,runs);
            pst.setString(2,pName);
            int rs = pst.executeUpdate();
            if(rs>0)
                return true;  
        }catch(SQLException e){
            System.out.println("Message set runs and balls:: "+e.getMessage());
        }
        return false;
    }

    @Override
    public int getRunAndBall() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
    
    

