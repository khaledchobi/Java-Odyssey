package src.odyssey.java.assignments.arrays.w3resource;
import java.util.Scanner;

public class Ex_W3_002 { // 02. Write a Java program to sum values of an array.
    static Scanner reader = new Scanner(System.in);
    /*public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        sumArray(numbers);

    }
    public static void sumArray(int[] array){
        int sum = 0;
        for (int i : array)
            sum += i;
        System.out.println("The sum values of array is: " + sum);

    }*/

    public static void main(String[] args) {
        System.out.println("Enter the numbers of Integer: ");
        int size = reader.nextInt();

        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter value for [" + i + "]: ");
            numbers[i] = reader.nextInt();
        }

        sumArray(numbers);

    }
    public static void sumArray(int[] array){
        int sum = 0;
        for (int i : array)
            sum += i;
        System.out.println("The sum values of array is: " + sum);

    }

}
