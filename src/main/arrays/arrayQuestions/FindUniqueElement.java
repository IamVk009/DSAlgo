// https://www.naukri.com/code360/problems/find-unique_625159

package main.arrays.arrayQuestions;

public class FindUniqueElement {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 22, 55, 33, 11};
        int[] arr1 = {11, 90, 80, 100, 11, 90, 100};
        int[] arr2 = {10};
        System.out.println(findUnique(arr));
        System.out.println(findUnique(arr1));
        System.out.println(findUnique(arr2));
    }

    static int findUnique(int[] arr) {

        int ans = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            ans = ans ^ arr[i + 1];
        }
        return ans;
    }
}
