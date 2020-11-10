package src.odyssey.java.assignments.object_oriented_programming.Inheritance;

public class Department extends Employee {
    private String employeeTitle;
    private String employeeDepartment;
    private double baseSalary;

    public Department(){
        super();
        this.employeeTitle = "Software Engineer";
        this.employeeDepartment = "IT";
        this.baseSalary = 80000.00;
    }

    public void setEmployeeTitle(String title){
        this.employeeTitle = title;
    }

    public String getEmployeeTitle() {
        return employeeTitle;
    }

    public void setEmployeeDepartment(String department){
        this.employeeDepartment = department;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void printStatement(){
        super.printStatement();
        System.out.println("Employee Title: "+ this.employeeTitle);
        System.out.println("Employee Department: "+ this.employeeDepartment);
        System.out.println("Base Salary: $"+ this.baseSalary);

    }
}
