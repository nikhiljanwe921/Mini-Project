package DAO;

import java.sql.*;

public class ScoreDetails implements ScoreFunction{

    @Override
    public int getRuns() {
        try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("select score from cricketscore where innings=1;");
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                int a;
                a=(rs.getInt("score"));
                return a;  
            }
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
        return 0;
    }

    @Override
    public int getOver() {

        try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("select overs from cricketscore where innings=1;");
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                int a;
                a=(rs.getInt("overs"));
                return a;  
            }
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
        return 0;
    }

    @Override
    public int getWickets() {

        try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("select wickets from cricketscore where innings=1;");
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                int a;
                a=(rs.getInt("wickets"));
                return a;  
            }
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
        return 0;
    }
     @Override
    public int getBall(){
        try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("select ball from cricketscore where innings=1;");
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                int a;
                a=(rs.getInt("ball"));
                return a;  
            }
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
        return 0;
    }
    
    @Override
    public int getTotalOvers() {

        try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("select totalOver from cricketscore where innings=1;");
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                int a;
//                a=Integer.parseInt(rs.getString("TeamName"));
                a=(rs.getInt("totalOver"));
                return a;  
            }
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
        return 0;
    }


    @Override
    public double getRunRate() {

        return 0;
    }

    @Override
    public double getRequiredRunRate() {

        return 0;
    }

    @Override
    public boolean updateRuns(int runs) {
    
        try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("update cricketscore set score=score+? where innings=1");
            pst.setInt(1,runs);
            int rs = pst.executeUpdate();
            if(rs>0)
                return true;  
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
        return false;
       
    }

    @Override
    public boolean updateOver() {
    try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("update cricketscore set overs=overs+1 where overs<totalOver and innings=1");
//            pst.setInt(1,over);
            int rs = pst.executeUpdate();
            if(rs>0)
                return true;  
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
        return false;}

    @Override
    public boolean updateTotalOvers(int overs) {
        try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("update cricketscore set totalover=? where innings=1");
            pst.setInt(1,overs);
            int rs = pst.executeUpdate();
            if(rs>0)
                return true;  
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
        return false;
    }

    @Override
    public boolean updateWickets() {
        try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("update cricketscore set wickets=wickets+1 where wickets<10 and innings=1");
//            pst.setInt(1,out);
            int rs = pst.executeUpdate();
            if(rs>0)
                return true;  
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
        return false;
    }

    @Override
    public double updateRunRate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double updateRequiredRunRate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean updateballs() {
        try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("update cricketscore set ball=ball+1 where innings=1");
//            pst.setInt(1,out);
            int rs = pst.executeUpdate();
            if(rs>0)
                return true;  
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
        return false;
    }
    
   

    @Override
    public boolean resetBalls() {
        try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("update cricketscore set ball=0 where innings=1");
//            pst.setInt(1,out);
            int rs = pst.executeUpdate();
            if(rs>0)
                return true;  
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
        return false;
    }

    @Override
    public boolean updateCurrentBatsman(String cBatsman) {
        try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("update cricketscore set cBatsman=? where innings=1");
            pst.setString(1,cBatsman);
            int rs = pst.executeUpdate();
            if(rs>0)
                return true;  
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
        return false;
    }

    @Override
    public boolean updateCurrentBowler(String cBowler) {
        try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("update cricketscore set cBowler=? where innings=1");
            pst.setString(1,cBowler);
            int rs = pst.executeUpdate();
            if(rs>0)
                return true;  
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
        return false;
    }

    @Override
    public String getCurrentBatsman() {
     try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("select cBatsman from cricketscore where innings=1");
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                String a;
                a=(rs.getString("cBatsman"));
                return a;  
            }
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
        return null;
    }

    @Override
    public String getCurrentBowler() {
    try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("select cBowler from cricketscore where innings=1");
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                String a;
                a=(rs.getString("cBowler"));
                return a;  
            }
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
        return null;
    }

    @Override
    public boolean updateRemark(String remark) {
    try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("update cricketscore set remark=? where innings=1");
            pst.setString(1,remark);
            int rs = pst.executeUpdate();
            if(rs>0)
                return true;  
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
        return false;
    }

    @Override
    public String getRemark() {
    try{
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement("select remark from cricketscore where innings=1");
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                String a;
                a=(rs.getString("remark"));
                return a;  
            }
        }catch(SQLException e){
            System.out.println("Message:: "+e.getMessage());
        }
        return null;
    }
    
    
    
}
