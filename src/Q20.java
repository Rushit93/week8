//Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class Q20 {

    public static void main(String[] args) {

        // Declare and initialize an integer array.
        int[] Number = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };

        System.out.println("Original numeric array : " + Arrays.toString(Number));

        Arrays.sort(Number);

        System.out.println("Sorted numeric array : " + Arrays.toString(Number));

    }
}