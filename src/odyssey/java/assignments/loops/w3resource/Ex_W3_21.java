package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_21 {
    public static void main(String []args) { // Write a program in Java to display the sum of the series [ 9 + 99 + 999 + 9999 ...].
        Scanner in = new Scanner(System.in);
        // Using While Loop
        int n, i, t=9;
        int sum =0;
        System.out.println("Input the number or terms :");
        n = in.nextInt();
        i=1;
        while(i<=n){
            sum +=t;
            System.out.print(t + "  ");
            t=t*10+9;
            i++;
        }
        System.out.println("\nThe sum of the series =  " + sum);

        // Using For Loop
        /*int n,i,t=9;
        int sum =0;
        System.out.println("Input the number or terms :");
        n = in.nextInt();
        for (i=1;i<=n;i++){ sum +=t;
            System.out.print(t + "  ");
            t=t*10+9;
        }
        System.out.println("\nThe sum of the series =  " + sum);*/

    }
}

// Input the number or terms :5
//9   99   999   9999   99999
//The sum of the series = 111105