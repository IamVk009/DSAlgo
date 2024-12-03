package main.arrays.arrayQuestions;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr1 = {10, 87, 20, 30, 20, 50, 85, 60, 20, 80, 10, 20};
        int[] arr2 = {10, 20, 30, 40, 50};
        int[] arr3 = {10, 10, 10, 10, 10};
        int[] arr4 = {100, 90, 60, 80, 70, 60};
        int[] arr5 = {70, 70};
/*

        System.out.println("Is Array Sorted = " + isArraySorted(arr1));
        System.out.println("Is Array Sorted = " + isArraySorted(arr2));
        System.out.println("Is Array Sorted = " + isArraySorted(arr3));
        System.out.println("Is Array Sorted = " + isArraySorted(arr4));
        System.out.println("Is Array Sorted = " + isArraySorted(arr5));

*/
        System.out.println("Is Array Sorted = " + isSorted(arr1));
        System.out.println("Is Array Sorted = " + isSorted(arr2));
        System.out.println("Is Array Sorted = " + isSorted(arr3));
        System.out.println("Is Array Sorted = " + isSorted(arr4));
        System.out.println("Is Array Sorted = " + isSorted(arr5));

    }

    static boolean isArraySorted(int[] arr) {

        if (arr == null) {
            return false;
        }

        if (arr[0] <= arr[1]) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isSorted(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return true;
        }
        boolean isAscending = arr[0] <= arr[1];
        for (int i = 0; i < arr.length - 1; i++) {
            if ((isAscending && arr[i] > arr[i + 1])
                    || (!isAscending && arr[i] < arr[i + 1])) return false;
        }
        return true;
    }

//    Time Complexity = O(n)
}

