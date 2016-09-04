/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.mysolution;
import java.util.Date;
/**
 *
 * @author Chris
 */
public class HRManager {    
    private Employee employee;                    
   
   
   public void HRManager(String firstName, String lastName, String ssn, Date birthDate, String cubeId){
       Employee e = new Employee();
       e.setFirstName(firstName);
       e.setLastName(lastName);
       e.setSsn(ssn);
       e.setBirthDate(birthDate);
       e.setCubeId("C4786");
       employee = e;
   }
   public String getEmployeeStatus()  {
        return employee.getStatus();   
   }
}

    