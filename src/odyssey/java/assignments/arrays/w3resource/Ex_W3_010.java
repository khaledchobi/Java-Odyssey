package src.odyssey.java.assignments.arrays.w3resource;

public class Ex_W3_010 { // 10. Write a Java program to find the maximum and minimum value of an array.
    static int max;
    static int min;

    public static void max_min(int my_array[]) {
        max = my_array[0];
        min = my_array[0];
        int len = my_array.length;
        for (int i = 1; i < len - 1; i = i + 2) {
            if (i + 1 > len) {
                if (my_array[i] > max) max = my_array[i];
                if (my_array[i] < min) min = my_array[i];
            }
            if (my_array[i] > my_array[i + 1]) {
                if (my_array[i] > max) max = my_array[i];
                if (my_array[i + 1] < min) min = my_array[i + 1];
            }
            if (my_array[i] < my_array[i + 1]) {
                if (my_array[i] < min) min = my_array[i];
                if (my_array[i + 1] > max) max = my_array[i + 1];
            }
        }
    }

    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        max_min(my_array);
        //System.out.println(" Original Array: "+Arrays.toString(my_array));
        System.out.print(" Original Array: [");
        for(int i=0; i<my_array.length; i++){
            System.out.print(my_array[i] + ", ");
        }
        System.out.println("]");

        System.out.println(" Maximum value for the above array = " + max);
        System.out.println(" Minimum value for the above array = " + min);
    }
}
