package main.arrays.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99, 101};
        System.out.println(searchBinary(arr, 100));
    }

    static int searchBinary(int[] arr, int target) {

        if (arr == null || arr.length == 0) return -1;

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; // 4=55
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }

//    Time Complexity = O(log(n))
}
