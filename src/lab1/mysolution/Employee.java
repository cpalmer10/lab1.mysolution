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
    private boolean cubicleAssigned;    
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
    private boolean hasMetHr() {
        return metWithHr;
    }
    public void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }
    private boolean hasMetDeptStaff() {
        return metDeptStaff;
    }
    public void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }
    private boolean hasReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }
    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {        
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }
    private boolean hasCubicleAssigned() {
        return cubicleAssigned;
    }
    public void setCubicleAssigned(boolean cubicleAssigned) {
        this.cubicleAssigned = cubicleAssigned;
    }                          
    public void checkOrientationStatus(){
       // Check to see if they have met with HR
        if (hasMetHr() == true){            
            System.out.println("\nMet HR Status:" + "\t\t" + "Completed on " + getFormattedDate()); 
        }
        else {
             System.out.println("Met HR Status:" + "\t\t" + "Incomplete"); 
        }
        // Check to see if they have met with hr and the department staff
        if (hasMetHr() == true && hasMetDeptStaff() == true){
            System.out.println("Dept Staff Status:" + "\t" + "Completed on " + getFormattedDate()); 
        }
        //Different responses for varying scenarios
        else if(hasMetHr() == true && hasMetDeptStaff() == false){
             System.out.println("Dept Staff Status:" + "\t" + "Incomplete");
             System.out.println("\tYou have met with HR, now you can meet with your department staff.");
        }
        else {
             System.out.println("Dept Staff Status:" + "\t" + "Incomplete");
             System.out.println("\tYou cannot meet with the Department Staff until you have met with HR.");
        }
        //Check to see if they have reviewed department policies   
        if (hasMetHr() == true && hasMetDeptStaff() == true && hasReviewedDeptPolicies() == true){
            System.out.println("Dept Policies Status:" + "\t" + "Completed on " + getFormattedDate()); 
        }
        //Different responses for varying outcomes depending on what tasks have been completed.
        else if (hasMetHr() == true && hasMetDeptStaff() == false && hasReviewedDeptPolicies() == false) {
             System.out.println("Dept Policies Status:" + "\t" + "Incomplete");
             System.out.println("\tYou have to meet your department staff before you can review your department policies.");           
        }
        else if (hasMetHr() == true && hasMetDeptStaff() == true && hasReviewedDeptPolicies() == false) {
             System.out.println("Dept Policies Status:" + "\t" + "Incomplete");
             System.out.println("\tYou have met with HR and your department staff. It is now time to review the department policies.");           
        }
        else {            
             System.out.println("Dept Policies Status:" + "\t" + "Incomplete");
             System.out.println("\tSorry, you cannot review department policies until you have first met with HR, then with the department staff.");                   
        }
               
        if (hasMetHr() == true && hasMetDeptStaff() == true && hasReviewedDeptPolicies() == true && hasCubicleAssigned() == true){
            System.out.println("Cubicle Status:" + "\t\t" + "Completed on " + getFormattedDate());
            System.out.println("Cubicle Assigned: " + "\t" + getCubeId());
        }
        //Different responses for varying outcomes depending on what has been completed
        else if (hasMetHr() == true && hasMetDeptStaff() == true && hasReviewedDeptPolicies() == false && hasCubicleAssigned() == false) {
             System.out.println("Cubicle Status:" + "\t\t" + "Incomplete");
             System.out.println("\tYou still need to review the department policies before you have your cubicle assigned.");
        }
        else if (hasMetHr() == true && hasMetDeptStaff() == true && hasReviewedDeptPolicies() == true && hasCubicleAssigned() == false) {
             System.out.println("Cubicle Status:" + "\t\t" + "Incomplete");
             System.out.println("\tYou have completed the department review, met your fellow staff, and met with HR. You are now able to have a cubicle assigned.");
        }
        else if (hasMetHr() == true && hasMetDeptStaff() == false && hasReviewedDeptPolicies() == false && hasCubicleAssigned() == false) {
             System.out.println("Cubicle Status:" + "\t\t" + "Incomplete");
             System.out.println("\tSorry, you cannot have a cubicle assigned until you meet with your department staff, and then have reviewed the department policies.");
        }        
        else {
             System.out.println("Cubicle Status:" + "\t\t" + "Incomplete");
             System.out.println("\tSorry, you cannot move into your cubicle until you have first met with HR, then with the department staff, and then have reviewed the department policies.");
        }
    }
    
    
    /*
    public void checkOrientationStatus(boolean metWithHr, boolean metDeptStaff, boolean reviewedDeptPolicies, boolean cubicleAssigned){
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
        
        cubicleAssigned();
        if (this.cubicleAssigned){
            System.out.println("Cubicle Status:" + "\t\t" + "Completed " + getFormattedDate());
            System.out.println("Cubicle number: " + "\t" + getCubeId());
        }
        else {
             System.out.println("Cubicle Status:" + "\t\t" + "Incomplete"); 
        }                            
    }
    */
}


