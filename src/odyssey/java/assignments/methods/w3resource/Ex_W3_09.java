package src.odyssey.java.assignments.methods.w3resource;
import java.util.Scanner;
public class Ex_W3_09 { // 9. Write a program in Java to display the pattern like right angle triangle using an asterisk.
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) { // Write a program in Java to display the pattern like right angle triangle using an asterisk.
        rTriangleAsterisk();
    }
    public static int rTriangleAsterisk(){
        int i,j,rows;
        System.out.println("Input number of rows : ");
        rows = in.nextInt();

        for(i=1;i<=rows;i++){
            for(j=1;j<=i;j++)
                System.out.print("*");
            System.out.println("");
        }
        return i;
    }
}
// Input number of rows : 10
//*
//**
//***
//****
//*****
//******
//*******
//********
//*********
//**********