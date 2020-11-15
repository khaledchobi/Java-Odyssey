package src.odyssey.java.assignments.decision_structure;

public class Decision_Structure {
    public static void main(String args[]){

        // Find the largest number variable.
        int num1 = 35, num2 = 50, num3 = 40, num4 = 70, num5 = 45;

        if ((num1 > num2) && (num1 > num3) && (num1 > num4) && (num1 > num5)) {
            System.out.println("Num1 is the largest number.");
        }
        else if ((num2 > num1) && (num2 > num3) && (num2 > num4) && (num2 > num5)) {
            System.out.println("Num2 is the largest number.");
        }
        else if ((num3 > num1) && (num3 > num2) && (num3 > num4) && (num3 > num5)) {
            System.out.println("Num3 is the largest number.");
        }
        else if ((num4 > num1) && (num4 > num2) && (num4 > num3) && (num4 > num5)) {
            System.out.println("Num4 is the largest number.");
        }

        else{
            System.out.println("Num5 is the largest number.");
        }

    }

}
// Tested