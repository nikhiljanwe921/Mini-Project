
package DAO;

import java.sql.*;
import java.util.*;

public class Employeeimpl implements Employeedao {

    @Override
    public Employee getEmployee(int id) {
       Employee emp = new Employee();
       try{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = con.prepareStatement("select * from employee where id=?");
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        
        if(rs.next()){
            emp.setId(rs.getInt("id"));
            emp.setUname(rs.getString("uname"));
            emp.setPass(rs.getString("pass"));
        }
        return emp;
       }
       catch(Exception e){
           System.err.println(e.getMessage());
       }
       return emp;
    }

    @Override
    public Set<Employee> getAllEmployee() {
         Set<Employee> emps = new HashSet<>();
       try{
        Connection con=ConnectionFactory.getConnection();
        PreparedStatement pst=con.prepareStatement("Select * from employee");
        ResultSet rs=pst.executeQuery();
        
        while(rs.next()){
            Employee emp = getEmployee(rs.getInt("id"));
            emps.add(emp);
        }
       }
       catch(Exception e){
           System.err.println(e.getMessage());
       }
       return emps;
    }

    @Override
    public boolean getEmployeeByidNameAndPassword(String uname, String pass) {
       Employee emp = new Employee();
       try{
        Connection con=ConnectionFactory.getConnection();
        PreparedStatement pst=con.prepareStatement("Select * from employee where id=? and uname=? and pass=?");
        pst.setString(1, uname);
        pst.setString(2, pass);
        ResultSet rs=pst.executeQuery();
        
        if(rs.next()){
            return true;
        }
       }
       catch(Exception e){
           System.err.println(e.getMessage());
       }
       return false;

    }

    @Override
    public boolean insertEmployee(Employee emp) {
         try{
        Connection con=ConnectionFactory.getConnection();
        PreparedStatement pst=con.prepareStatement("Insert into employee (fname,lname,jobpro,uname,pass) values(?,?,?,?,?)");
        
        pst.setString(1, emp.getFname());
        pst.setString(2, emp.getLname());
        pst.setString(3, emp.getJob());
        pst.setString(4, emp.getUname());
        pst.setString(5, emp.getPass());
        
        int a=pst.executeUpdate();
        
        if(a>0){
            return true;
        }
       }
       catch(Exception e){
           System.err.println(e.getMessage());
       }
       return false;
    }

    @Override
    public boolean updateEmployee(Employee emp) {
         try{
        Connection con=ConnectionFactory.getConnection();
        PreparedStatement pst=con.prepareStatement("Update employee set uname=?,pass=? where adminid=?");
        pst.setString(1,emp.getUname());
        pst.setString(2,emp.getPass());
        pst.setInt(3, emp.getId());
        int a=pst.executeUpdate();
        
        if(a>0){
            return true;
        }
       }
       catch(Exception e){
           System.err.println(e.getMessage());
       }
       return false;
    }

    @Override
    public boolean deleteEmployee(int id) {
        try{
        Connection con=ConnectionFactory.getConnection();
        PreparedStatement pst=con.prepareStatement("Delete from employee where id=?");
        pst.setInt(1, id);
        int a=pst.executeUpdate();
        
        if(a>0){
            return true;
        }
       }
       catch(Exception e){
           System.err.println(e.getMessage());
       }
       return false;
    }
      public static ResultSet getEmployee(){
        ResultSet rs=null;
        try{
        Connection con=ConnectionFactory.getConnection();
        PreparedStatement pst=con.prepareStatement("Select * from employee;");
        rs=pst.executeQuery();
       }
       catch(Exception e){
           System.err.println(e.getMessage());
       }
       return rs;
    }
    
}
