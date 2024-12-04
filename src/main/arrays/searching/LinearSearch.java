package main.arrays.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99, 101};
        System.out.println(searchLinear(arr, 22));
    }

    static int searchLinear(int[] arr, int target) {

        if (arr == null || arr.length == 0) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

//    Time Complexity = O(n)
}
