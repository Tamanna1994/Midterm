package math.problems;

import java.util.Arrays;

public class FindLowestDifference {

    /*
     Implement in java.
     Read this below two array. Find the lowest difference between the two array cell.
     The lowest difference between cells is 1
    */
    public static void main(String[] args) {
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        int lowestDifference = findLowestDifference(array1, array2);
        System.out.println("The lowest difference between the two arrays is: " + lowestDifference);
    }

    public static int findLowestDifference(int[] array1, int[] array2) {
        Arrays.sort(array1); // Sort array1 in ascending order
        Arrays.sort(array2); // Sort array2 in ascending order

        int lowestDifference = Integer.MAX_VALUE; // Set initial value to maximum possible integer

        int i = 0; // Index for array1
        int j = 0; // Index for array2

        while (i < array1.length && j < array2.length) {
            int difference = Math.abs(array1[i] - array2[j]); // Calculate absolute difference between array1[i] and array2[j]
            if (difference == 1) { // If difference is 1, return 1 as it is the lowest possible difference
                return 1;
            } else if (difference < lowestDifference) { // If difference is less than current lowest difference, update lowest difference
                lowestDifference = difference;
            }

            // Move pointers in arrays based on values at respective indices
            if (array1[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return lowestDifference;
    }
}


