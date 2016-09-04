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
    private Date currentDate;
    private String cubeId;
    private HumanResources hr = new HumanResources();

    public Employee() {
        currentDate = new Date();        
    }
    
    private String getFormattedDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        return sdf.format(currentDate);
    }
    public String getBirthdate(){
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        return sdf.format(birthDate);
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
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public String getCubeId() {
        return hr.getCubeId();
    }
    public void setCubeId(String cubeId) {
        this.cubeId = hr.getCubeId();
    }    
    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }        
    public boolean hasMetWithHr() {
        return metWithHr;
    }
    public void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }
    public boolean hasMetDeptStaff() {
        return metDeptStaff;
    }
    public void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }
    public boolean hasReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }
    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }
    public boolean hasMovedIn() {
        return movedIn;
    }
    public void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
    }  
    private void metWithHr(){                      
        metWithHr = true;            
    }
    
    private void metDeptStaff(){
        if (metWithHr){            
            metDeptStaff = true;
        }
        else {
            System.out.println("Sorry, you cannot meet with "
            + "department staff until you have met with HR.");
        }
        
    }
    
    private void reviewedDeptPolicies(){
        if (metWithHr && metDeptStaff){            
            reviewedDeptPolicies = true;
        }
        else {
            System.out.println("Sorry, you cannot review department "
                + "policies until you first meet with HR and then "
                + "meet with Department staff.");
        }
    }   
   
    private void movedIn() {
        if(metWithHr && metDeptStaff && reviewedDeptPolicies) {                                
            movedIn = true;
        } else {
            System.out.println("Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.");
        }

    }       
    public void checkOrientationStatus(){
         metWithHr();
        if (this.metWithHr){
            
            System.out.println("\nHR Status:" + "\t\t" + "Completed " + getFormattedDate()); 
        }
        else {
             System.out.println("HR Status:" + "\t\t" + "Incomplete"); 
        }
        
        metDeptStaff();
        if (this.metDeptStaff){
            System.out.println("Dept Staff Status:" + "\t" + "Completed " + getFormattedDate()); 
        }
        else {
             System.out.println("Dept Staff Status:" + "\t" + "Incomplete");
             System.out.println("You cannot meet with the Department Staff until you have met with HR.");
        }
        
        reviewedDeptPolicies();
        if (this.reviewedDeptPolicies){
            System.out.println("Dept Policies Status:" + "\t" + "Completed " + getFormattedDate()); 
        }
        else {
             System.out.println("Dept Policies Status:" + "\t" + "Incomplete"); 
        }
        
        movedIn();
        if (this.movedIn){
            System.out.println("Cubicle Status:" + "\t\t" + "Completed " + getFormattedDate());
            System.out.println("Cubicle number: " + "\t" + getCubeId());
        }
        else {
             System.out.println("Cubicle Status:" + "\t\t" + "Incomplete"); 
        }
    }
    
    
    
    public void checkOrientationStatus(boolean metWithHr, boolean metDeptStaff, boolean reviewedDeptPolicies, boolean movedIn){
        metWithHr();
        if (this.metWithHr){
            
            System.out.println("\nHR Status:" + "\t\t" + "Completed " + getFormattedDate()); 
        }
        else {
             System.out.println("HR Status:" + "\t\t" + "Incomplete"); 
        }
        
        metDeptStaff();
        if (this.metDeptStaff){
            System.out.println("Dept Staff Status:" + "\t" + "Completed " + getFormattedDate()); 
        }
        else {
             System.out.println("Dept Staff Status:" + "\t" + "Incomplete");
             System.out.println("You cannot meet with the Department Staff until you have met with HR.");
        }
        
        reviewedDeptPolicies();
        if (this.reviewedDeptPolicies){
            System.out.println("Dept Policies Status:" + "\t" + "Completed " + getFormattedDate()); 
        }
        else {
             System.out.println("Dept Policies Status:" + "\t" + "Incomplete"); 
        }
        
        movedIn();
        if (this.movedIn){
            System.out.println("Cubicle Status:" + "\t\t" + "Completed " + getFormattedDate());
            System.out.println("Cubicle number: " + "\t" + getCubeId());
        }
        else {
             System.out.println("Cubicle Status:" + "\t\t" + "Incomplete"); 
        }                            
    }
}


