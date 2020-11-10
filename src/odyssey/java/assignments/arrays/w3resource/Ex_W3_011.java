package src.odyssey.java.assignments.arrays.w3resource;

public class Ex_W3_011 { // 11. Write a Java program to reverse an array of integer values.
    public static void main(String[] args){
        int[] array = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};

        System.out.print("Original Array: [");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println("]");
        // System.out.println("Original array: "+Arrays.toString(array));

        for(int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        System.out.print("Reverse array : [");
        for (int element: array) {
            System.out.print(element + ", ");
        }
        System.out.println("]");

        //System.out.println("Reverse array : "+Arrays.toString(array));
    }
}
