package main.arrays.arrayQuestions;

/** Maximum Subarray Sum. */
public class KadanesAlgo {
    public static void main(String[] args) {
        int[] arr = {-5, 4, 6, -3, 4, -1};
        System.out.printf("Maximum Subarray Sum = " + maxSubarraySum(arr));
    }

//    Approach - 1 : Brute force Approach
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
}
