package com.company;

import java.util.Arrays;

public class SortOfArray {
// Создать статический метод  "sort", который сортирует массив.
//создать метод "printToArray", который создаёт, сортирует и выводит массив.

public static int [] sort (int [] arr){
    Arrays.sort(arr);
    return arr;
}
public static void printToArray(){
    int [] arr = new int[10];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = (int) (Math.random() *20);
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    for (int i = arr.length-1; i > 0; i--) {
        for (int j = 0; j < i; j++) {
            if (arr[j] > arr[j+1]){
                int k = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = k;
            }
        }
    }
    System.out.println(Arrays.toString(arr));
}
}

