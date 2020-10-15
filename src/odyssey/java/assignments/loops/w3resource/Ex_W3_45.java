package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_45 {
    public static void main(String []args) { // Write a program in Java to find LCM of any two numbers.
        Scanner in = new Scanner(System.in);
        int i, n1, n2, max, lcm=1;
        System.out.println("LCM of two numbers : ");
        System.out.println("Input 1st number for LCM : ");
        n1 = in.nextInt();
        System.out.println("Input 2nd number for LCM : ");
        n2 = in.nextInt();

        max = (n1>n2) ? n1 : n2;

        for(i=max;  ; i+=max){
            if(i%n1==0 && i%n2==0){
                lcm = i;
                break;
            }
        }
        System.out.println("The LCM of " + n1 + " and " + n2 + " = " + lcm + ".");
    }
}

//  LCM of two numbers:
// ----------------------
//Input 1st number for LCM: 15
//Input 2nd number for LCM: 20
//
//LCM of 15 and 20 = 60
