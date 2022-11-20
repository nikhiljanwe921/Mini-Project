package DAO;
import java.sql.*;

public class ConnectionFactory {
    
    public static final String DRIVER="com.mysql.cj.jdbc.Driver";
    public static final String URL="jdbc:mysql://localhost:3306/project";
    public static final String USER="root";
    public static final String PASSWORD="1275";
    public static Connection con = null;
    
    public static Connection getConnection(){
        try{
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER,PASSWORD);
            return con;
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
        return con;
    }
    //to check SQL connection
    public static void main(String[] args) {
        System.out.println("COnnected: "+getConnection());
    }
}
