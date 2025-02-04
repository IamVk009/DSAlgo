package main.arrays.arrayQuestions.tuf;

import java.util.Arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr1 = {90, 80, 10, 20, 509, 75, 100};
        System.out.println("Largest Element = " + getLargestElementInArr(arr1));

        int[] arr2 = {90, 80, 10, 20, 509, 75, 100};
        System.out.println("Largest Element = " + getLargestElement(arr2));
    }

    // Approach 1 : Brute Force Approach
    static int getLargestElementInArr(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    // Time Complexity  : O(n*log(n)) - Linearithmic
    // Space Complexity : O(n) - Linear

    // Approach 2 : Recursive Approach
    static int getLargestElement(int[] arr) {
        int largest = arr[0];
        for (int element : arr) {
            if (element > largest) largest = element;
        }
        return largest;
    }

    // Time Complexity  : O(n) - Linear
    // Space Complexity : O(1) - Linear
}