package src.odyssey.java.assignments.class_objects;

public class DemoClass { // Stand-a-lone class

    public static void main(String[] args) {
        Employee objId = new Employee("Khaled","Hasan");
        // objAccount.accountHolderName = "Khaled Hasan";
        objId.printStatement();
        System.out.println("");

        Employee objNaimId = new Employee();
        objNaimId.employeeFName = "Naim";
        objNaimId.employeeLName = "Islam";
        objNaimId.printStatement();
        System.out.println("");

        Employee objMahmudId = new Employee("Kazi","Islam","03/16/1965");
        objMahmudId.printStatement();
        System.out.println("");

        Employee objAlauddinId = new Employee("Mohammed","Alauddin","03/16/1971","Product Manager");
        objAlauddinId.printStatement();
        System.out.println("");

        Employee objHaqueId = new Employee("Amdad","Haque","03/16/1990","Business Analyst","Information Technology");
        objHaqueId.printStatement();


    }
}
