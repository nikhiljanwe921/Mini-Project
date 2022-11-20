
package DAO;

import java.util.Set;

/**
 *
 * @author ONE
 */
public interface Employeedao {
       Employee getEmployee(int id);

  
    Set<Employee> getAllEmployee();
    
    boolean getEmployeeByidNameAndPassword(String uname, String pass);
    boolean insertEmployee(Employee emp);
    boolean updateEmployee(Employee emp);
    boolean deleteEmployee(int id);
   
}
