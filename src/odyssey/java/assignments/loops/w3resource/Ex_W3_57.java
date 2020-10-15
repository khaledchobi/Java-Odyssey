package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_57 {
    public static void main(String[] args) { // Write a program in Java to print a string in reverse order.
        Scanner in = new Scanner(System.in);
        System.out.println("Input a string to reverse : ");

        String str = in.nextLine();
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.print("Reversed string is : ");
        System.out.println(reverse);
    }
}

// Print a string in reverse order:
// -------------------------------------
//Input a string to reverse : Welcome
//Reversed string is: emocleW