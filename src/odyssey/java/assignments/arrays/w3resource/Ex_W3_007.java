package src.odyssey.java.assignments.arrays.w3resource;

public class Ex_W3_007 { // 07. Write a Java program to remove a specific element from an array.
    public static void main(String[] args) {
        int array[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        System.out.print("Original Array: [");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println("]");

        int index = 1;
        System.out.println("Element of Index to be removed: " + index);

        array = removeTheElement(array, index); // Remove the element

        System.out.print("After removing the second element: [");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println("]");

    }

    public static int[] removeTheElement(int[] arr, int index){

        // If the array is empty or the index is not in array range return the original array.
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }

        int[] anotherArray = new int[arr.length - 1]; // Create another array of size one less

        // Copy the elements except the index from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {
            // if the index is the removal element index
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i]; // if the index is not the removal element index
        }

        return anotherArray; // return the resultant array
    }
}
