package main.arrays.arrayQuestions;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {90, 80, 10, 20, 509, 75, 100};
        System.out.println("Largest Element = " + getLargestElement(arr));
    }

    static int getLargestElement(int[] arr) {
        int largest = arr[0];
        for (int element : arr) {
            if (element > largest) largest = element;
        }
        return largest;
    }
}

// Time Complexity : O(n) i.e. Linear
