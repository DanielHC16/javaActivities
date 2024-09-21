package src;

// 1. Create an encapsulated class named "StudentGrade" where it contains strLastName, 
// strFirstName, strStudentNo, strEmailAddress, strCellPhoneNo, intCourseGrade, strSubjectCode. 
// Use get() and set() on each given attributes.

public class StudentGrade {
    
    private String strLastName;
    private String strFirstName;
    private String strStudentNo;
    private String strEmailAddress;
    private String strCellPhoneNo;
    private int intCourseGrade;
    private String strSubjectCode;
    
    
    // Getters
    public String getLastName(){
        return strLastName;
    }
    public String getFirstName(){
        return strFirstName;
    }
    public String getStudentNo(){
        return strStudentNo;
    }
    public String getEmailAddress(){
        return strEmailAddress;
    }
    public String getCellPhoneNo(){
        return strCellPhoneNo;
    }
    public int getCourseGrade(){
        return intCourseGrade;
    }
    public String getSubjectCode(){
        return strSubjectCode;
    }
    
    // Setters
    public void setLastName(String strLastName){
        this.strLastName = strLastName;
    }
    public void setFirstName(String strFirstName){
        this.strFirstName = strFirstName;
    }
    public void setStudentNo(String strStudentNo){
        this.strStudentNo = strStudentNo;
    }
    public void setEmailAddress(String strEmailAddress){
        this.strEmailAddress = strEmailAddress;
    }
    public void setCellPhoneNo(String strCellPhoneNo){
        this.strCellPhoneNo = strCellPhoneNo;
    }
    public void setCourseGrade(int intCourseGrade){
        this.intCourseGrade = intCourseGrade;
    }
    public void setSubjectCode(String strSubjectCode){
        this.strSubjectCode = strSubjectCode;
    }
    
}
