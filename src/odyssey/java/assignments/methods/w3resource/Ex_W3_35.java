package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_35 { // 35. Write a program in Java to display the first n terms of Fibonacci series.
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {
        fibonacciSeries();
    }
    public static int fibonacciSeries(){
        int prv=0,pre=1,trm,i,n;
        System.out.println("Input number of terms to  display : ");
        n = in.nextInt();
        System.out.println("Here is the Fibonacci series upto to " + n + " terms : \n");
        System.out.printf("% 5d % 5d", prv,pre);
        i=3;
        while(i<=n){
            trm=prv+pre;
            System.out.printf("% 5d",trm);
            prv=pre;
            pre=trm;
            i++;
        }
        System.out.println("\n");
        return i;
    }
}

// Input number of terms to  display : 10
//Here is the Fibonacci series upto  to 10 terms :
//    0     1    1    2    3    5    8   13   21   34