package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {15, 12, -95, 54, 56, 210};
        System.out.println(Arrays.toString(arr));

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int k = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = k;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
