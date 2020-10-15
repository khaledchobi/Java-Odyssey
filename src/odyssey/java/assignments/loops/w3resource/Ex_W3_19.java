package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_19 {
    public static void main(String []args) { // Write a program in Java to display the n terms of harmonic series and their sum.
        Scanner in = new Scanner(System.in);
        int i,n;
        double s = 0.0;
        System.out.println("Input the number of terms : ");
        n = in.nextInt();
        for(i=1;i<=n;i++){
            if(i<n){
                System.out.print("1/" + i + " + ");
                s+=1/(float)i;
            }
            if(i==n){
                System.out.println("1/" + i + " + ");
                s+=1/(float)i;
            }
        }
        System.out.println("Sum of Series upto " + n + " terms : " + s);

    }
}
// 1 + 1/2 + 1/3 + 1/4 + 1/5 ... 1/n terms
//Test Data :
//Input the number of terms : 5
//Expected Output :
//1/1 + 1/2 + 1/3 + 1/4 + 1/5 +
//Sum of Series upto 5 terms : 2.283334