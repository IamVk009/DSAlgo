package main.arrays.arrayQuestions;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        int[] arr1 = {11, 90, 80, 10, 20, 509, 75, 100};

        reverseArray(arr1);
        printArray(arr1);

        System.out.println();

        reverseArr(arr);
        printArray(arr);
    }

    static void reverseArray(int[] arr) {
        int i = arr.length - 1;
        int j = 0;
        while (j < i) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
            i--;
        }
    }

//    Time Complexity = O(n)

    static void reverseArr(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

//    Time Complexity = O(n)

    static void printArray(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
    }
}
