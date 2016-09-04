package lab1.mysolution;

import java.util.Date;


/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Startup {
    public static void main(String[] args) {
        /*
            Are we violating SRP (Single Responsibility Principle)?
        
            HINT: think about what we are trying to do ... hire an employee.
            Whose job is it to do this? The current class? Or, a new class?
            Should we do the work here or delegate to the new class? You
            may need to create a new class that talks to Employee. This does
            not have to be a GUI class.
        */
        
        // Create the new employee
        Employee employee = new Employee();
        HumanResources hr = new HumanResources();
        // Add employee details
        employee.setFirstName("Chris");
        employee.setLastName("Palmer");
        employee.setSsn("123-45-6789");
        employee.setBirthdate(new Date("04/11/1991"));
        employee.setCubeId(hr.getCubeId());
       
        // change when task is completed
        employee.setMetWithHr(true);        
        employee.setMetDeptStaff(true);
        employee.setReviewedDeptPolicies(true);
        employee.setCubicleAssigned(false);
       
        // check how far along they are to getting started
        employee.checkOrientationStatus();       
        
    }

}
