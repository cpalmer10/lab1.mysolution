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
public class HumanResources {    
    private Employee employee;
    private String cubeId = "C3P0";
   
   
   public void HumanResources(String cubeId){
       Employee e = new Employee();       
       e.setCubeId(getCubeId());
       employee = e;
   }   
   
   public String getCubeId(){
       return cubeId;
   }
   public String getEmployeeStatus()  {
            return employee.getStatus();   
   }
}

    