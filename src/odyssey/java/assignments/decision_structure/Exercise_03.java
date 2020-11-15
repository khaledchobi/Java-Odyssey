package src.odyssey.java.assignments.decision_structure;

public class Exercise_03 {
    public static void main(String args[]){

        // FindLargestNumber with if else if else
        int num1 = 25, num2 = 77, num3 = 96, num4 = 125, num5 = 2;

        if ((num1 > num2) && (num1 > num3) && (num1 > num4) && (num1 > num5)) {
            System.out.println("The Largest number is " + num1);
        }
        else if ((num2 > num1) && (num2 > num3) && (num2 > num4) && (num2 > num5)) {
            System.out.println("The Largest number is " + num2);
        }
        else if ((num3 > num1) && (num3 > num2) && (num3 > num4) && (num3 > num5)) {
            System.out.println("The Largest number is " + num3);
        }
        else if ((num4 > num1) && (num4 > num2) && (num4 > num3) && (num4 > num5)) {
            System.out.println("The Largest number is " + num4);
        }
        else{
            System.out.println("The Largest number is " + num5);
        }

    }
}
