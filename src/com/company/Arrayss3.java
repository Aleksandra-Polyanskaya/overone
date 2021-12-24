package com.company;

import java.util.Arrays;

public class Arrayss3 {
    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 3, 5};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min){
                    min = arr[j];
                    min_i = j;
                }
            }
           if (i != min_i){
               int k = arr[i];
               arr[i] = arr[min_i];
               arr[min_i] = k;
            }
        }
        System.out.println(Arrays.toString(arr));
            }
    }
