package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_58 { // 58. Write a Java program to find the length of a string without using the library function.
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {
        stringLength();
    }
    public static int stringLength(){
        int count = 0;
        String str;
        System.out.println("Input a string : ");
        str = in.nextLine();
        while (!str.equals("")) {
            str = str.substring(1);
            ++count;
        }
        System.out.println("The string contains " + count + " number of characters. ");
        System.out.println("So, the length of the string " + str + " is : " + count + ".");
        return count;
    }
}

// Find the length of a string:
// -------------------------------------
//Input a string : welcome
//The string contains 7  number of characters.
//So, the length of the string welcome is : 7