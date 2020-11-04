package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_16 { // 16. Write a program in Java to display the n terms of even natural number and their sum.
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {

        evenNumberSum();
    }
    public static int evenNumberSum(){
        int i,n,sum=0;
        System.out.println("Input number of terms : ");
        n = in.nextInt();
        System.out.print("The even numbers are : ");
        i=1;
        while(i<=n){
            System.out.print(2*i + " ");
            sum+=2*i;
            i++;
        }
        System.out.println("\nThe Sum of even Natural Number upto " + n + " terms : " + sum);
        return i;
    }
}

// Input number of terms : 5
//Expected Output :
//The even numbers are :2 4 6 8 10
//The Sum of even Natural Number upto 5 terms : 30