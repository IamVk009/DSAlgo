package main.arrays.arrayQuestions;

public class PrintAlternateElement {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        printArray(arr);
    }

    static void printArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
