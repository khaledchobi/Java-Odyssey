package src.odyssey.java.assignments.arrays.w3resource;

public class Ex_W3_001 { // 01. Write a Java program to sort a numeric array and a string array.
    public static void main(String[] args) {
        String[] array = new String[]{"Java", "Python", "PHP", "C#", "C Programming", "C++"};
        int n = 6;

        InSortedOrder();
        SortedString(array, n);
    }

    public static int InSortedOrder() {
        int[] array = new int[]{1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
        int tem = 0;

        for (int n = 0; n < array.length; n++) {
            for (int m = n + 1; m < array.length; m++) {
                if (array[n] > array[m]) {
                    tem = array[n];
                    array[n] = array[m];
                    array[m] = tem;
                }
            }
        }

        System.out.println();

        System.out.println("Original numeric array : " + array.length);
        System.out.println("Elements of array sorted in ascending order: ");
        for (int n = 0; n < array.length; n++) {
            System.out.print(array[n] + ", ");
        }
        return tem;
    }
    public static void SortedString(String arr[], int n) {
        int index[] = new int[n];
        int i, j, min;

        for (i = 0; i < n; i++) {
            index[i] = i;
        }

        for (i = 0; i < n - 1; i++) {
            min = i;
            for (j = i + 1; j < n; j++) {
                if (arr[index[min]].compareTo(arr[index[j]]) > 0) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = index[min];
                index[min] = index[i];
                index[i] = temp;
            }
        }
        System.out.println("\nString of array sorted in ascending order: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[index[i]] + ", ");
        }
    }


}

