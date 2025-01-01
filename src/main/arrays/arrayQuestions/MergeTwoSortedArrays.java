package main.arrays.arrayQuestions;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 9, 11};
        int[] arr2 = {0, 1, 3, 5};
        int[] result = mergeTwoSortedArr(arr1, arr2);
        printArray(result);
    }

    static int[] mergeTwoSortedArr(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        // If any of the array is empty, then return the other array as it is.
        if (m == 0) return arr2;
        if (n == 0) return arr1;

        int[] result = new int[m + n];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                result[index++] = arr1[i++];
            } else {
                result[index++] = arr2[j++];
            }
        }

        while (i < m) {
            result[index++] = arr1[i++];
        }

        while (j < n) {
            result[index++] = arr2[j++];
        }

        return result;

    //    Time Complexity = O(m + n), where m and n are sizes of two arrays.
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
