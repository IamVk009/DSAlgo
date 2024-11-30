package main.arrays;

public class Arrays {
    public static void main(String[] args) {
        Integer[] arr = {11, 22, 33, 44, 55};
        Integer[] arr2 = new Integer[4];
        arr2[0] = 10;
        String[] arr3 = new String[5];
        Character[] arr4;
        arr4 = new Character[]{'c', 'h', 'd', 'r'};

        printArray(arr);
        printArray(arr2);
        printArray(arr3);
        printArray(arr4);

//        How to see memory address of an array.
        int[] arr5 = {33, 44, 11, 33, 22};
/*      This value is JVM-specific and should not be interpreted as a direct physical memory address or "bytes."
        It is simply an identity-based hash value provided by the JVM.
        Why Can't Java Provide Direct Memory Addresses?
        Java operates within the JVM, and it abstracts away direct memory access for safety and portability.
        The address you see via the hash code or toString() is not the actual physical memory address but a JVM-dependent representation of it.
*/
        System.out.println("Memory Address Using ToString() : " + arr5.toString());
        System.out.println("Memory Address Using System.identityHashCode(): " + System.identityHashCode(arr5));
        System.out.println("Memory Address Using System.identityHashCode(): " + System.identityHashCode(arr5[0]));
        System.out.println("Memory Address Using System.identityHashCode(): " + System.identityHashCode(arr5[1]));
    }

    private static <T> void printArray(T[] arr) {
        if (arr[0] != null) {
            for (T element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
