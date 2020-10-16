package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Ex_W3_24 {
    public static void main(String []args) { // Write a program in Java to find the sum of the series [ x - x^3 + x^5 + ......].
        Scanner in = new Scanner(System.in);
        // Using While Loop
        int x,sum,ctr;
        int i,n,m,mm,nn;
        System.out.println("Input the value of x :");
        x = in.nextInt();
        System.out.println("Input number of terms : ");
        n = in.nextInt();
        sum =x; m=-1;
        System.out.println("The values of the series: \n");
        System.out.println(x + "");

        i=1;
        while(i < n){
            ctr = (2 * i + 1);
            mm = (int) pow (x, ctr);
            nn = mm * m;
            System.out.println(nn + " ");
            sum = sum + nn;
            m = m * (-1);
            i++;
        }
        System.out.println("\nThe sum = " + sum);

        // Using For Loop
        /*int x,sum,ctr;
        int i,n,m,mm,nn;
        System.out.println("Input the value of x :");
        x = in.nextInt();
        System.out.println("Input number of terms : ");
        n = in.nextInt();
        sum =x; m=-1;
        System.out.println("The values of the series: \n");
        System.out.println(x + "");
        for (i = 1; i < n; i++){
            ctr = (2 * i + 1);
            mm = (int) pow (x, ctr);
            nn = mm * m;
            System.out.println(nn + " ");
            sum = sum + nn;
            m = m * (-1);
        }
        System.out.println("\nThe sum = " + sum);*/

    }
}
// Input the value of x :2
//Input number of terms : 5
//The values of the series:
//2
//-8
//32
//-128
//512
//
//The sum = 410

/*
    // Function to get
    // the series
    static double Series(double x, int n)
    {
        double sum = 1, term = 1, fct = 1;
        double p = 1, multi = 1;

        // Computing sum of remaining
        // n-1 terms.
        for (int i = 1; i < n; i++)
        {
            fct = fct * multi * (multi + 1);
            p = p * x * x;
            term = (-1) * term;
            multi += 2;
            sum = sum + (term * p) / fct;
        }
        return sum;
    }

    // Driver Code
    public static void main(String args[])
    {
        double x = 2;
        int n = 5;
        System.out.printf("%.4f", Series(x, n));
    }
}

// This code is contributed by Khaled.
*/
