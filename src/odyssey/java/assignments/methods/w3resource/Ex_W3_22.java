package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_22 { // 22. Write a program in Java to print the Floyd's Triangle.
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {
        floydTriangle();
    }
    public static int floydTriangle(){
        int i, j, n, p, q;
        System.out.println("Input number of rows : ");
        n = in.nextInt();
        i=1;
        while(i<=n){
            if(i%2==0)
            { p=1;q=0;}
            else
            { p=0;q=1;}

            j=1;
            while(j<=i) {
                if (j % 2 == 0)
                    System.out.print(p + " ");
                else
                    System.out.print(q + " ");
                j++;
            }
            System.out.println("");
            i++;
        }
        return i;
    }
}
// Input number of rows : 5
//1
//01
//101
//0101
//10101
