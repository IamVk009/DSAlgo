package main.arrays.arrayQuestions;

import java.util.Arrays;

public class SumOfElmntsInArr {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Sum of all Elements = " + sumOfAllElementsInArray(arr));
        System.out.println("Sum of all Elements = " + arraySum(arr));
    }

    static int sumOfAllElementsInArray(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        return sum;
    }

//    Time Complexity = O(n)

    static int arraySum(int[] arr) {
        return Arrays.stream(arr).sum();
    }
}
