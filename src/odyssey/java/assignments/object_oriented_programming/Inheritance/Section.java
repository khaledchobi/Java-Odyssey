package src.odyssey.java.assignments.object_oriented_programming.Inheritance;

public class Section extends Department {
    private String employeeSection;
    private byte employeeWorkingHours;

    public Section(){
        super();
        this.employeeSection = "Alfa";
        this.employeeWorkingHours = 40;
    }

    public void setEmployeeSection(String section){
        this.employeeSection = section;
    }

    public String getEmployeeSection() {
        return employeeSection;
    }

    public void setEmployeeWorkingHours(byte hours){
        this.employeeWorkingHours = hours;
    }

    public byte getEmployeeWorkingHours() {
        return employeeWorkingHours;
    }


    public void printStatement(){
        super.printStatement();
        System.out.println("Employee Section: "+ this.employeeSection);
        System.out.println("Employee Working Hours Per Week: "+ this.employeeWorkingHours);

    }
}
