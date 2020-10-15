package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_06 {
    public static void main(String []args) { // Write a program in Java to display the multiplication table of a given integer.
        Scanner in = new Scanner(System.in);
        int i,s;
        System.out.println("Input the number (Table to be calculated) : ");
        s = in.nextInt();

        for(i=1;i<=10;i++){
            System.out.println(s + " X " + i + "= " + s*i);
        }
    }
}

// Test Data :
//Input the number (Table to be calculated) : 15
//Expected Output :
//15 X 1 = 15
//15 X 2 = 30
//15 X 3 = 45
//15 X 4 = 60
//15 X 5 = 75
//15 X 6 = 90
//15 X 7 = 105
//15 X 8 = 120
//15 X 9 = 135
//15 X 10 = 150