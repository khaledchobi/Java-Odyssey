package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_57 { // 57. Write a program in Java to print a string in reverse order.
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        reverseString();
    }
    public static int reverseString(){
        System.out.println("Input a string to reverse : ");
        String s = in.nextLine();
        // convert String to character array
        // by using toCharArray
        char[] t = s.toCharArray();
        System.out.print("Reversed string is : ");

        int i = t.length - 1;
        while(i >= 0){
            System.out.print(t[i]);
            i--;
        }
        System.out.println("");
        return i;
    }
}

// Print a string in reverse order:
// -------------------------------------
//Input a string to reverse : Welcome
//Reversed string is: emocleW