package main.arrays.arrayQuestions;

public class SwapAlternate {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        int[] arr1 = {11, 90, 80, 10, 20, 509, 75, 100};
        swapAlternate(arr);
        printArray(arr);
        System.out.println();
        swapAlternate(arr1);
        printArray(arr1);
    }

    static void swapAlternate(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    static void printArray(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
    }
}
