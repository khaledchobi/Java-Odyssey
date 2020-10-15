package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_35 {
    public static void main(String []args) { // Write a program in Java to display the first n terms of Fibonacci series.
        Scanner in = new Scanner(System.in);
        int prv=0,pre=1,trm,i,n;
        System.out.println("Input number of terms to  display : ");
        n = in.nextInt();
        System.out.println("Here is the Fibonacci series upto to " + n + " terms : \n");
        System.out.printf("% 5d % 5d", prv,pre);

        for(i=3;i<=n;i++){
            trm=prv+pre;
            System.out.printf("% 5d",trm);
            prv=pre;
            pre=trm;
        }
        System.out.println("\n");
    }
}

// Input number of terms to  display : 10
//Here is the Fibonacci series upto  to 10 terms :
//    0     1    1    2    3    5    8   13   21   34