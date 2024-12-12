package main.arrays.arrayQuestions.leetcode;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 18, 5};
        int[] arr1 = {1, 3, 34, 7, 11, 23};
        int[] arr2 = {3, 2, 4};
        int target = 6;
        int[] twoSum = twoSum(arr2, target);
        for (int i : twoSum) {
            System.out.print(i + " ");
        }
    }

    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
//        Time Complexity = O(n^2)
    }
}