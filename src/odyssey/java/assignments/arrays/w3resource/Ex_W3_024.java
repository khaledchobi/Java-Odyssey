package src.odyssey.java.assignments.arrays.w3resource;

public class Ex_W3_024 { // 24. Write a Java program to find a missing number in an array.
    public static void main(String[] args) {

        int total_num;
        int[] numbers = new int[]{1,2,3,4,6,7};
        total_num = 7;
        int expected_num_sum = total_num * ((total_num + 1) / 2);
        int num_sum = 0;
        for (int i: numbers) {
            num_sum += i;
        }
        System.out.print( expected_num_sum - num_sum);
        System.out.print("\n");
    }
}
