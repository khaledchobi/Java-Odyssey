package src.odyssey.java.assignments.arrays.w3resource;

public class Ex_W3_005 { // 05. Write a Java program to test if an array contains a specific value.

    public static void main(String[] args) {
        int[] array = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456};

        System.out.println(contains(array, 2013));
        System.out.println(contains(array, 2015));
    }

    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
}
