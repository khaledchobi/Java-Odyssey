package src.odyssey.java.assignments.loops.w3resource;

public class Ex_W3_04 {
    public static void main(String []args) { // Write a program in Java to read 10 numbers from keyboard and find their sum and average.
        int i, sum = 0;
        double avg;
        System.out.println("Input the 10 numbers : \n");

        for (i=1;i<=10;i++) {
        System.out.println("Number " + i + " :" + i);
        sum = sum + i;
        }
        avg = sum/10.0;
        System.out.println("The sum of 10 no is : " + sum + "\nThe Average is :" + avg);
        }
}

// Test Data :
//Input the 10 numbers :
//Number-1 :2
//...
//Number-10 :2
//Expected Output :
//The sum of 10 no is : 55
//The Average is : 5.500000