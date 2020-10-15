package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_39 {
    public static void main(String []args) { // Write a program in Java to find the number and sum of all integer between 100 and 200 which are divisible by 9.
        Scanner in = new Scanner(System.in);
        int start, end, div;
        System.out.println("Input beginning number: ");
        start = in.nextInt();
        System.out.println("Input ending number: ");
        end = in.nextInt();
        System.out.println("Input divisible number: ");
        div = in.nextInt();

        int i, sum=0;
        System.out.println("Numbers between " + start + " and " + end + " divisible by " + div + " : ");
        for(i=start;i<end;i++){
            if(i%div==0){
                System.out.print("  " + i); // OR.. System.out.printf("% 5d",i);
                sum+=i;
            }
        }
        System.out.println("\n\nThe sum :  " + sum);
    }
}
// Numbers between 100 and 200, divisible by 9 :
//  108  117  126  135  144  153  162  171  180  189  198
//
//The sum : 1683