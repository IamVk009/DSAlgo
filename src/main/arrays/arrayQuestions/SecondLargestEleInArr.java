package main.arrays.arrayQuestions;

public class SecondLargestEleInArr {
    public static void main(String[] args) {
        int[] arr = {10, 87, 20, 30, 20, 50, 85, 60, 20, 80, 90, 20};
        int[] arr1 = {10, 20, 5, 12, 15};
        System.out.println("Second Largest Element = " + secondLargestElement(arr));
        System.out.println("Second Largest Element = " + secondLargestElement(arr1));
    }

    static int secondLargestElement(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int largest = Integer.MIN_VALUE;
        int large = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > largest) {
                large = largest;
                largest = i;
            } else if (i < largest && i > large) {
                large = i;
            }
        }
        return large;
    }
}

// Time Complexity = O(n)