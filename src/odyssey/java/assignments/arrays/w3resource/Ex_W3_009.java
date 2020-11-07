package src.odyssey.java.assignments.arrays.w3resource;

public class Ex_W3_009 { // 09. Write a Java program to insert an element (specific position) into an array.
    public static void main(String[] args) {

        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        // System.out.println("Original Array : "+Arrays.toString(my_array));
        System.out.print("Original Array : [");
        for (int element: my_array) {
            System.out.print(element + ", ");
        }
        System.out.println("]");


        // Insert an element in 3rd position of the array (index->2, value->5)
        int Index_position = 2;
        int newValue    = 5;

        for(int i=my_array.length-1; i > Index_position; i--){
            my_array[i] = my_array[i-1];
        }
        my_array[Index_position] = newValue;

        System.out.print("New Array: [");
        for (int new_Element: my_array) {
            System.out.print(new_Element + ", ");
        }
        System.out.println("]");
    }
}
