package project1;


import java.util.Arrays;

public class gitproject {

    // Method to sort an array of integers
    public void sortArray(int[] array) {
        Arrays.sort(array);
        System.out.println("Sorted Integer Array: " + Arrays.toString(array));
    }

    // Method to sort an array of strings
    public void sortArray(String[] array) {
        Arrays.sort(array);
        System.out.println("Sorted String Array: " + Arrays.toString(array));
    }

    // Main method for testing
    public static void main(String[] args) {
        gitproject gitProjectInstance = new gitproject();

        // Test sorting integers
        int[] intArray = {4, 2, 7, 1, 9};
        System.out.println("Original Integer Array: " + Arrays.toString(intArray));
        gitProjectInstance.sortArray(intArray);

        // Test sorting strings
        String[] stringArray = {"banana", "Apple", "orange", "apple"};
        System.out.println("Original String Array: " + Arrays.toString(stringArray));
        gitProjectInstance.sortArray(stringArray);
    }
}

