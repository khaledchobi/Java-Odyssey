package src.odyssey.java.assignments.object_oriented_programming.Inheritance;

public class DemoEmployee { // Stand-a-lone class

    public static void main(String[] args) {
        Employee objId = new Employee();
        // objAccount.accountHolderName = "Khaled Hasan";
        objId.printStatement();

        Employee objNaimId = new Employee();
        objNaimId.setEmployeeFName("Naim");
        objNaimId.setEmployeeLName("Islam");
        objNaimId.printStatement();

        Employee objMahmudId = new Employee();
        objMahmudId.setEmployeeFName("Kazi");
        objMahmudId.setEmployeeLName("Islam");
        objMahmudId.setEmployeeDOB("03/16/1965");
        objMahmudId.printStatement();

        Employee objAlauddinId = new Employee();
        objAlauddinId.setEmployeeFName("Mohammed");
        objAlauddinId.setEmployeeLName("Alauddin");
        objAlauddinId.setEmployeeDOB("03/16/1971");
        objAlauddinId.printStatement();

        System.out.println("");
        // Department information.

        Department objKhaledDep = new Department();
        objKhaledDep.printStatement();
        System.out.println("");

        Department objNaimDep = new Department();
        objNaimDep.setEmployeeFName("Naim");
        objNaimDep.setEmployeeLName("Islam");
        objNaimDep.printStatement();
        System.out.println("");

        Department objKaziDep = new Department();
        objKaziDep.setEmployeeFName("Kazi");
        objKaziDep.setEmployeeLName("Islam");
        objKaziDep.setEmployeeDOB("03/16/1965");
        objKaziDep.printStatement();
        System.out.println("");

        Department objAlauddinDep = new Department();
        objAlauddinDep.setEmployeeFName("Mohammed");
        objAlauddinDep.setEmployeeLName("Alauddin");
        objAlauddinDep.setEmployeeDOB("03/16/1971");
        objAlauddinDep.setEmployeeTitle("Product Manager");
        objAlauddinDep.printStatement();
        System.out.println("");

        Department objAmdadDep = new Department();
        objAmdadDep.setEmployeeFName("Amdad");
        objAmdadDep.setEmployeeLName("Haque");
        objAmdadDep.setEmployeeDOB("03/16/1990");
        objAmdadDep.setEmployeeTitle("Business Analyst");
        objAmdadDep.setBaseSalary(120000.00);
        objAmdadDep.printStatement();

        System.out.println("");

        Section objKhaledSec = new Section();
        objKhaledSec.printStatement();
        System.out.println("");

        Section objNaimSec = new Section();
        objNaimSec.setEmployeeFName("Naim");
        objNaimSec.setEmployeeLName("Islam");
        objNaimSec.printStatement();
        System.out.println("");

        Section objKaziSec = new Section();
        objKaziSec.setEmployeeFName("Kazi");
        objKaziSec.setEmployeeLName("Islam");
        objKaziSec.setEmployeeDOB("03/16/1965");
        objKaziSec.printStatement();
        System.out.println("");

        Section objAlauddinSec = new Section();
        objAlauddinSec.setEmployeeFName("Mohammed");
        objAlauddinSec.setEmployeeLName("Alauddin");
        objAlauddinSec.setEmployeeDOB("03/16/1971");
        objAlauddinSec.setEmployeeTitle("Product Manager");
        objAlauddinSec.printStatement();
        System.out.println("");

        Section objAmdadSec = new Section();
        objAmdadSec.setEmployeeFName("Amdad");
        objAmdadSec.setEmployeeLName("Haque");
        objAmdadSec.setEmployeeDOB("03/16/1990");
        objAmdadSec.setEmployeeTitle("Business Analyst");
        objAmdadSec.setBaseSalary(120000.00);
        objAmdadSec.printStatement();
        System.out.println("");

        Section objShamimSec = new Section();
        objShamimSec.setEmployeeFName("S.M.");
        objShamimSec.setEmployeeLName("Shamim");
        objShamimSec.setEmployeeDOB("03/16/1989");
        objShamimSec.setEmployeeTitle("Software Architect");
        objShamimSec.setBaseSalary(85000.00);
        objShamimSec.setEmployeeSection("Beta");
        objShamimSec.printStatement();
        System.out.println("");

        Section objSalehSec = new Section();
        objSalehSec.setEmployeeFName("Saleh");
        objSalehSec.setEmployeeLName("Ahmed");
        objSalehSec.setEmployeeDOB("03/16/1995");
        objSalehSec.setEmployeeTitle("CEO");
        objSalehSec.setBaseSalary(200000.00);
        objSalehSec.setEmployeeSection("Head Office");
        objSalehSec.setEmployeeWorkingHours((byte) 20);
        objSalehSec.printStatement();
        System.out.println("");


    }

}
