package lab1.mysolution;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Employee {    
    private String firstName;
    private String lastName;
    private String ssn;
    private Date birthDate;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private Date currentDate;

    public Employee() {
        currentDate = new Date();
    }
    
    private String getFormattedDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        return sdf.format(currentDate);
    }
    
    public void orientationProgress(String cubeId){
        
        metWithHr();
        metDeptStaff();
        reviewedDeptPolicies();
        movedIn(cubeId);
    }
            
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCubeId() {
        return cubeId;
    }

    public void setCubeId(String cubeId) {
        this.cubeId = cubeId;
    }

    public String getCurrentDate() {
        return getFormattedDate();
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }
    
    public String getStatus(){
        return cubeId;
    }
    
    private void metWithHr(){                      
        metWithHr = true;
        System.out.println("Met with HR " + getCurrentDate());        
    }
    
    private void metDeptStaff(){
        if (metWithHr){
            System.out.println("Met with Department Staff " + getCurrentDate());
            metDeptStaff = true;
        }
        else
        {
            
        }
    }
    
    private void reviewedDeptPolicies(){
        
    }
    
    private void movedIn(String cubeId){
        
    }
    
   
    

    // Assume this must be performed second
    private void meetDepartmentStaff() {
        if(metWithHr) {         
            System.out.println("Met with Dept. Staff on " + getFormattedDate());
            metDeptStaff = true;
        } else {
            System.out.println("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }

    // Assume this must be performed third
    private void reviewDeptPolicies() {
        if(metWithHr && metDeptStaff) {           
            System.out.println("Reviewed Dept. Policies on " + getFormattedDate());
            reviewedDeptPolicies = true;
        } else {
            System.out.println("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }
    }

    // Assume this must be performed 4th
    private void moveIntoCubicle(String cubeId) {
        if(metWithHr && metDeptStaff && reviewedDeptPolicies) {           
            System.out.println("Moved into cube on " + getFormattedDate());
            
            this.movedIn = true;
        } else {
            System.out.println("Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.");
        }

    }

    
}
    
