package main.arrays.arrayQuestions;

public class CountOccurrenceOfEleInArr {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 50, 60, 20, 80, 90, 20};
        System.out.println("Total Count = " + countOccurrence(arr, 20));
    }

    static int countOccurrence(int[] arr, int target) {
        int count = 0;
        for (int i : arr) {
            if (i == target) count++;
        }
        return count;
    }

//    Time Complexity = O(n)

}
