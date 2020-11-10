package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_37 { // 37. Write a program in Java to display the number in reverse order.
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {
        reverseNumber();
    }
    public static int reverseNumber(){
        int n, r = 0;
        System.out.println("Input a number : ");
        n = in.nextInt();

        while(n != 0) {
            int dig = n % 10;
            r = r * 10 + dig;
            n /= 10;
        }
        System.out.println("The number in reverse order is : " + r);
        return n;
    }
}

// Input a number: 12345
//The number in reverse order is : 54321