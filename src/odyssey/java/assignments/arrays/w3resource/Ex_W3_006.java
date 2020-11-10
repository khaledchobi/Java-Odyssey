package src.odyssey.java.assignments.arrays.w3resource;

public class Ex_W3_006 { // 06. Write a Java program to find the index of an array element.
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        System.out.println("Index position of 25 is: " + findIndex(array, 25));
        System.out.println("Index position of 77 is: " + findIndex(array, 77));
    }

    public static int findIndex (int[] arr, int t) {
        if (arr == null) return -1;
        int len = arr.length;
        int i = 0;
        while (i < len){
            if (arr[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
}
