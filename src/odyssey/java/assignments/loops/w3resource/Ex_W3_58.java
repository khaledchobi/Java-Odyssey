package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_58 {
    public static void main(String []args) { // Write a Java program to find the length of a string without using the library function.
        Scanner sc = new Scanner(System.in);
        // Using While loop
        int count = 0;
        String str;
        System.out.println("Input a string : ");
        str = sc.nextLine();
        while (!str.equals("")) {
            str = str.substring(1);
            ++count;
        }
        System.out.println("The string contains " + count + " number of characters. ");
        System.out.println("So, the length of the string " + str + " is : " + count + ".");


        // Using For Loop
        /*int count = 0;
        String str;
        System.out.println("Input a string : ");
        str = sc.nextLine();
        char ch[] = str.toCharArray();

        for (char c : ch) {
            count++;
        }
        System.out.println("The string contains " + count + " number of characters. ");
        System.out.println("So, the length of the string " + str + " is : " + count + ".");*/


    }
}

// Find the length of a string:
// -------------------------------------
//Input a string : welcome
//The string contains 7  number of characters.
//So, the length of the string welcome is : 7