package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Ex_W3_52 {
    public static void main(String []args) { // Write a program in Java to find the Sum of GP series.
        Scanner in = new Scanner(System.in);
        // Using While Loop
        float g1, cr, i, not, gpn, sum=0;
        System.out.println("Find the Sum of GP series : ");
        System.out.println("Input the first number of the G.P. series : ");
        g1 = in.nextInt();
        System.out.println("Input the number or terms in the G.P. series : ");
        not = in.nextInt();
        System.out.println("Input the common ratio of G.P. series : ");
        cr = in.nextInt();
        //-------- generate G.P. series ---------------
        System.out.println("The numbers for the G.P. series : ");
        System.out.print(g1 + "00000 "); // OR.. System.out.printf("%f ",g1);
        sum=g1;

        i=1;
        while(i<not){
            gpn = (float) (g1*pow(cr,i));
            sum=sum+gpn;
            System.out.print(gpn + "00000 "); // OR .. System.out.printf("%f  ",gpn);
            i++;
        }
        // -------- End of G.P. series generate ---------------
        System.out.println("\nThe Sum of the G.P. series : " + sum);


        // Using For Loop
        /*float g1, cr, i, not, gpn, sum=0;
        System.out.println("Find the Sum of GP series : ");
        System.out.println("Input the first number of the G.P. series : ");
        g1 = in.nextInt();
        System.out.println("Input the number or terms in the G.P. series : ");
        not = in.nextInt();
        System.out.println("Input the common ratio of G.P. series : ");
        cr = in.nextInt();
        //-------- generate G.P. series ---------------
        System.out.println("The numbers for the G.P. series : ");
        System.out.print(g1 + "00000 "); // OR.. System.out.printf("%f ",g1);
        sum=g1;

        for(i=1;i<not;i++){
            gpn = (float) (g1*pow(cr,i));
            sum=sum+gpn;
            System.out.print(gpn + "00000 "); // OR .. System.out.printf("%f  ",gpn);
        }
        // -------- End of G.P. series generate ---------------
        System.out.println("\nThe Sum of the G.P. series : " + sum);*/

    }
}

// Input the first number of the G.P. series: 3
//Input the number or terms in the G.P. series: 5
//Input the common ratio of G.P. series: 2
//
//The numbers for the G.P. series:
// 3.000000 6.000000  12.000000  24.000000  48.000000
//The Sum of the G.P. series : 93.000000