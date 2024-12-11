package main.arrays.arrayQuestions;

public class SecondSmallestEleInArr {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99, 10, 97};
        int[] arr1 = {11, 9, 20, 8, 25, 6, 77, 2, 99, 10, 7};
        int[] arr2 = {11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11};
        int[] arr3 = {3, 1, 4, 2};
        System.out.println(getSecondElement(arr));
    }

    static int getSecondElement(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return -1;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i : arr) { // smallest = 1, secondsmallest = 3
            if (i < smallest) {
                secondSmallest = smallest;
                smallest = i;
            } else if (i > smallest && i < secondSmallest) {
                secondSmallest = i;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element found.");
            return -1;
        }
        return secondSmallest;
    }
}
