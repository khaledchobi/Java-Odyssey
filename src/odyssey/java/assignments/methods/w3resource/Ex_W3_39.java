package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_39 { // 39. Write a program in Java to find the number and sum of all integer between 100 and 200 which are divisible by 9.
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {
        findNumbers();
    }
    public static int findNumbers(){
        int start, end, div, i, sum=0;
        System.out.println("Input beginning number: ");
        start = in.nextInt();
        System.out.println("Input ending number: ");
        end = in.nextInt();
        System.out.println("Input divisible number: ");
        div = in.nextInt();
        System.out.println("Numbers between " + start + " and " + end + " divisible by " + div + " : ");
        i=start;
        while(i<end){
            if(i%div==0){
                System.out.print("  " + i); // OR.. System.out.printf("% 5d",i);
                sum+=i;
            }
            i++;
        }
        System.out.println("\n\nThe sum :  " + sum);
        return i;
    }
}
// Numbers between 100 and 200, divisible by 9 :
//  108  117  126  135  144  153  162  171  180  189  198
//
//The sum : 1683