package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_47 { // 47. Write a Java program to check whether a number is a Strong Number or not.
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {
        checkStrongNumber();
    }
    public static int checkStrongNumber(){
        int i, n, n1, s1=0, j, fact;
        System.out.println("Check whether a number is Strong Number or not : ");
        //  If sum of factorial of digits is equal to original number then it is Strong number
        System.out.println("Input a number to check whether it is Strong number : ");
        n = in.nextInt();
        n1 = n;

        j=n;
        while(j>0){
            fact = 1;
            i=1;
            while(i<=j % 10){
                fact = fact * i;
                i++;
            }
            s1 = s1 + fact;
            j=j/10;
        }
        if(s1==n1){
            System.out.println(n1 + " is Strong number.");
        }
        else {
            System.out.println(n1 + " is not Strong number.");
        }
        return j;
    }
}

// Check whether a number is Strong Number or not:
// ----------------------------------------------------
//Input a number to check whether it is Strong number: 15
//
//15 is not Strong number.