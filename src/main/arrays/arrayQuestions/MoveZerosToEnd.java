package main.arrays.arrayQuestions;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 10, 3, 0, 12, 23};
        int[] arr1 = {0, 10, 0, 0, 12, 23, 19};
    /*
        moveZerosToEnd(arr);
        printArray(arr);
        System.out.println();
        moveZerosToEnd(arr1);
        printArray(arr1);
        System.out.println();
    */
        moveZerosAtEnd(arr);
        printArray(arr);
        System.out.println();
        moveZerosAtEnd(arr1);
        printArray(arr1);
    }

    static void moveZerosToEnd(int[] arr) {

        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

//    Time Complexity = O(n^2)

    static void moveZerosAtEnd(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }

//    Time Complexity = O(n)

    static void printArray(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
    }
}
