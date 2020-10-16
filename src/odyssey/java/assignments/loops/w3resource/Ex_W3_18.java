package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_18 {
    public static void main(String []args) { // Write a program in Java to find the sum of the series [ 1-X^2/2!+X^4/4!- .........].
        Scanner in = new Scanner(System.in);
        // Using While Loop
        float x, sum, t, d;
        int i, n;
        System.out.println("Input the Value of x : ");
        x = in.nextInt();
        System.out.println("Input the number of terms : ");
        n = in.nextInt();
        sum =1; t = 1;

        i=1;
        while(i<n){
            d = (2*i)*(2*i-1);
            t = -t*x*x/d;
            sum = sum + t;
            i++;
        }
        System.out.println("The sum = " + sum + "\nNumber of terms = " + n + "\nvalue of x = " + x + "\n");


        // Using For Loop
        /*float x, sum, t, d;
        int i, n;
        System.out.println("Input the Value of x : ");
        x = in.nextInt();
        System.out.println("Input the number of terms : ");
        n = in.nextInt();
        sum =1; t = 1;

        for (i=1;i<n;i++){
            d = (2*i)*(2*i-1);
            t = -t*x*x/d;
            sum = sum + t;
        }
        System.out.println("The sum = " + sum + "\nNumber of terms = " + n + "\nvalue of x = " + x + "\n");*/

    }
}
// Input the Value of x :2
//Input the number of terms : 5
//
//the sum = -0.415873
//Number of terms = 5
//value of x = 2.000000