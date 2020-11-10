package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_07 { // 7. Write a program in Java to display the multipliaction table vertically from 1 to n.
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) { // Write a program in Java to display the multiplication table vertically from 1 to n.
        mTable();
    }

    public static int mTable(){
        int j,i,n;
        System.out.println("Input upto the table number starting from 1 : ");
        n = in.nextInt();
        System.out.println("Multiplication table from 1 to " + n);
        for(i=1;i<=10;i++){
            for(j=1;j<=n;j++){
                if (j<=n-1)
                    System.out.print(j + "x" + i + " = " + i*j + ", ");
                else
                    System.out.println(j + "x" + i + " = " + i*j + ".");
            }
        }
        return i;
    }
}

// Test Data :
//Input upto the table number starting from 1 : 8
//Expected Output :
//Multiplication table from 1 to 8
//1x1 = 1, 2x1 = 2, 3x1 = 3, 4x1 = 4, 5x1 = 5, 6x1 = 6, 7x1 = 7, 8x1 = 8
//...
//1x10 = 10, 2x10 = 20, 3x10 = 30, 4x10 = 40, 5x10 = 50, 6x10 = 60, 7x10 = 70, 8x10 = 80