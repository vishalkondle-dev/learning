package _java.CollectionFramework;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int arr[] = { 8, 2, 4, 9, 1, 4, 6, 3, 5, 7 };

        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");

        int index = Arrays.binarySearch(arr, 4);
        System.out.println("Arrays.binarySearch index : " + index);

        Arrays.fill(arr, 45);
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // arr[11] = 100; //! ArrayIndexOutOfBoundsException
    }
}
