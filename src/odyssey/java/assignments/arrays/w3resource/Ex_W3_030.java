package src.odyssey.java.assignments.arrays.w3resource;

import java.util.Arrays;

public class Ex_W3_030 { // 30. Write a Java program to check if an array of integers without 0 and -1.
    public static void main(String[] args)
    {
        int[] array_nums = {50, 77, 12, 54, -11};
        System.out.println("Original Array: "+Arrays.toString(array_nums));
        System.out.println("Result: "+test(array_nums));
    }
    public static boolean test(int[] numbers) {
        for (int number : numbers) {
            if (number == 0 || number == -1) {
                return false;
            }
        }
        return true;
    }
}
