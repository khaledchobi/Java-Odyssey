package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_37 {
    public static void main(String []args) { // Write a program in Java to display the number in reverse order.
        Scanner in = new Scanner(System.in);
        int n, r = 0;
        System.out.println("Input a number : ");
        n = in.nextInt();

        for(;n != 0; n /= 10){
            int dig = n % 10;
            r = r * 10 + dig;
        }
        System.out.println("The number in reverse order is : " + r);
    }
}

// Input a number: 12345
//The number in reverse order is : 54321