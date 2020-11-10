package src.odyssey.java.assignments.class_objects;

public class Employee {
    //Fields
    String employeeFName;
    String employeeLName;
    String employeeDOB;
    String employeeTitle;
    String employeeDepartment;


    public Employee(){
        this.employeeFName = "Khaled";
        this.employeeLName = "Hasan";
        this.employeeDOB = "03/16/1981";
        this.employeeTitle = "Software Engineer";
        this.employeeDepartment = "Information Technology";
    }

    public Employee(String fName, String lName){
        this.employeeFName = fName;
        this.employeeLName = lName;
        this.employeeDOB = "03/16/1979";
        this.employeeTitle = "Software Engineer";
        this.employeeDepartment = "Information Technology";
    }

    public Employee(String fName, String lName, String dOB){
        this.employeeFName = fName;
        this.employeeLName = lName;
        this.employeeDOB = dOB;
        this.employeeTitle = "Software Engineer";
        this.employeeDepartment = "Information Technology";
    }

    public Employee(String fName, String lName, String dOB, String title){
        this.employeeFName = fName;
        this.employeeLName = lName;
        this.employeeDOB = dOB;
        this.employeeTitle = title;
        this.employeeDepartment = "Information Technology";
    }

    public Employee(String fName, String lName, String dOB, String title, String department){
        this.employeeFName = fName;
        this.employeeLName = lName;
        this.employeeDOB = dOB;
        this.employeeTitle = title;
        this.employeeDepartment = department;
    }

    //Methods
    public String printFullName() {
        String fullName = employeeFName + " " + employeeLName;
        //System.out.println(fullName);
        return fullName;
    }
    public void printFullName_01() {
        //String fullName = employeeFName + " " + employeeLName;
        System.out.println("Full Name: " + this.employeeFName+ " " +this.employeeLName);

    }

    public void printStatement(){
        // System.out.println("Employee First Name: " + this.employeeFName);
        // System.out.println("Employee Last Name: " + this.employeeLName);
        System.out.println("Employee Name: " + printFullName());
        System.out.println("DOB: " + this.employeeDOB);
        System.out.println("Title: "+ this.employeeTitle);
        System.out.println("Department: "+ this.employeeDepartment);
        //System.out.println(printFullName_01());
    }


}
