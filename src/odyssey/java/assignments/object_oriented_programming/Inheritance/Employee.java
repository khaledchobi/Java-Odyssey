package src.odyssey.java.assignments.object_oriented_programming.Inheritance;

public class Employee {
    //Fields
    private String employeeFName;
    private String employeeLName;
    private String employeeDOB;

    public Employee(){
        this.employeeFName = "Khaled";
        this.employeeLName = "Hasan";
        this.employeeDOB = "03/16/1981";
    }

    public void setEmployeeFName(String fName){
        this.employeeFName = fName;
    }

    public String getEmployeeFName(){
        return this.employeeFName;
    }

    public void setEmployeeLName(String lName){
        this.employeeLName = lName;
    }

    public String getEmployeeLName(){
        return this.employeeLName;
    }

    public void setEmployeeDOB(String dob){
        this.employeeDOB = dob;
    }

    public String getEmployeeDOB(){
        return this.employeeDOB;
    }

    //Methods
    public String printFullName() {
        String fullName = employeeFName + " " + employeeLName;
        //System.out.println(fullName);
        return fullName;
    }
    public void printFullName_01() {
        System.out.println("Full Name: " + this.employeeFName+ " " +this.employeeLName);

    }

    public void printStatement(){
        System.out.println("Employee Name: " + printFullName());
        System.out.println("DOB: " + this.employeeDOB);
        //System.out.println(printFullName_01());
    }


}
