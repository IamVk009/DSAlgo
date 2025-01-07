package main.arrays.arrayQuestions;

/** Maximum Subarray Sum. */
public class KadanesAlgo {
    public static void main(String[] args) {
        //  Given an array of integers, find the contiguous subarray that has the largest sum and return that sum.
        int[] arr = {-5, 4, 6, -3, 4, -1};
        int[] arr1 = {-5, -3, -1};
        System.out.println("Maximum Subarray Sum = " + kadanesAlgo(arr));
        System.out.println("Maximum Subarray Sum = " + kadanesAlgo(arr1));
    }

    //  Approach - 1 : Brute force Approach
    static int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
        // Time Complexity = O(n^3)
    }

    //   Approach - 2 : Brute force Approach
    static int maxSubarraySum2(int[] arr) {
        int maxSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
        // Time Complexity = O(n^2)
    }

    //  Approach - 3 : Most Optimized Solution
    static int kadanesAlgo(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
        // Time Complexity = O(n)
    }
}
