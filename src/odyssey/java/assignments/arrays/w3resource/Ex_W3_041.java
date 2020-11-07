package src.odyssey.java.assignments.arrays.w3resource;

public class Ex_W3_041 { // 41. Write a Java program to find smallest and second smallest elements of a given array.

    public static void main (String[] args)
    {
        int arr[] = {5, 7, -8, 5, 14, 1};

        int first_element, second_element, arr_size = arr.length;

        /* Return if the array size less than two */
        if (arr_size < 2)
        {
            System.out.println("Array size less than two.");
            return;
        }

        first_element = second_element = Integer.MAX_VALUE;
        for (int i = 0; i < arr_size ; i ++)
        {
            /* Update both first and second if current element is smaller than first. */
            if (arr[i] < first_element)
            {
                second_element = first_element;
                first_element = arr[i];
            }

            /* Update second if arr[i] is between first and second
               elements.*/
            else if (arr[i] < second_element && arr[i] != first_element)
                second_element = arr[i];
        }
        if (second_element == Integer.MAX_VALUE)
            System.out.println("No second smallest element.");
        else
            System.out.println("The smallest element is " +
                    first_element + " and second Smallest  element is " + second_element +".");

    }
}
