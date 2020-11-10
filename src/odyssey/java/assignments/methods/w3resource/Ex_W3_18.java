package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_18 { // 18. Write a program in Java to find the sum of the series [ 1-X^2/2!+X^4/4!- .........].
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {
        sumOfSeries();
    }
    public static int sumOfSeries(){
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
        return i;
    }
}
// Input the Value of x :2
//Input the number of terms : 5
//
//the sum = -0.415873
//Number of terms = 5
//value of x = 2.000000