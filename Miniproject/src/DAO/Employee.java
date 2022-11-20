
package DAO;


public class Employee {
    
    private int id;
    private String uname;
    private String pass;
    private String fname;
    private String lname;
    private String job;
    
    public Employee(String fname, String lname, String job, String user, String pass) {
        this.uname = user;
        this.pass = pass;
        this.fname = fname;
        this.lname = lname;
        this.job = job;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String cpass) {
        this.job = cpass;
    }

    public Employee(int id, String uname, String pass) {
        this.id = id;
        this.uname = uname;
        this.pass = pass;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", uname=" + uname + ", pass=" + pass + ", fname=" + fname + ", lname=" + lname + ", job=" + job + '}';
    }    
}