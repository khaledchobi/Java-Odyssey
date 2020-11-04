package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_45 { // 45. Write a program in Java to find LCM of any two numbers.
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {
        findLCM();
    }
    public static int findLCM(){
        int i, n1, n2, max, lcm=1;
        System.out.println("LCM of two numbers : ");
        System.out.println("Input 1st number for LCM : ");
        n1 = in.nextInt();
        System.out.println("Input 2nd number for LCM : ");
        n2 = in.nextInt();

        max = (n1>n2) ? n1 : n2;

        i=max;
        while(i >= lcm) {
            if (i % n1 == 0 && i % n2 == 0) {
                lcm = i;
                break;
            }
            i+=max;

        }
        System.out.println("The LCM of " + n1 + " and " + n2 + " = " + lcm + ".");
        return i;
    }
}

//  LCM of two numbers:
// ----------------------
//Input 1st number for LCM: 15
//Input 2nd number for LCM: 20
//
//LCM of 15 and 20 = 60
