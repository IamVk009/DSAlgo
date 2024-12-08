package main.arrays.arrayQuestions;

public class CountEvenOddInArr {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99, 10, 97};
        int[] countedEvenOdd = countEvenOdd(arr);
        System.out.println("Even Numbers In Arr = " + countedEvenOdd[0]);
        System.out.println("Odd Numbers In Arr = " + countedEvenOdd[1]);
    }

    static int[] countEvenOdd(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or Empty");
        }

        int countEven = 0;
        int countOdd = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        return new int[] {countEven, countOdd};
    }
}
