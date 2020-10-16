package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_05 {
    public static void main(String []args) { // Write a program in Java to display the cube of the number upto given an integer.
        Scanner in = new Scanner(System.in);
        int i, s;
        System.out.println("Input number of terms : ");
        s = in.nextInt();

        for (i = 1; i <= s; i++){
            System.out.println("Number is : " + i + " and cube of the " + i + " is : " + (i * i * i));
        }
    }
}
// Input number of terms : 5
//Number is : 1 and cube of the 1 is :1
//Number is : 2 and cube of the 2 is :8
//Number is : 3 and cube of the 3 is :27
//Number is : 4 and cube of the 4 is :64
//Number is : 5 and cube of the 5 is :125