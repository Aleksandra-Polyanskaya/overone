package com.company;

import java.util.Arrays;

public class Lesson10 {
    public static void main(String[] args) {

//        int[] arr = {5, 15, 40, 35, -200, 0, 50};
//        System.out.println(Arrays.toString(arr));
//
//        int min_i = 0;
//        int max_i = 0;
//        int min = arr[0];
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]<min){
//                min= arr[i];
//                min_i=i;
//
//            }
//            if(arr[i]>max){
//                max=arr[i];
//                max_i=i;
//            }
//        }
//        int k = arr[min_i];
//        arr[min_i] = arr[max_i];
//        arr[max_i] = k;
//        System.out.println(Arrays.toString(arr));

//        int a = 0;
//        for (int i = 1; i <= 99; i++) {
//            if (i % 2 != 0)
//                a++;
//        }
//        System.out.println(a);
//        int[] ar = new int[a];
//        for (int i = 1, j = 0; i <= 99; i++) {
//            if (i % 2 != 0) {
//                ar[j] = i;
//                System.out.print(ar[j] + " ");
//
//            }
//        }
//        System.out.println();
//        for (int i = ar.length-1; i >=0 ; i--) {
//            System.out.print(ar[i] + " ");
//        }
//        int [] array = {1, 20, -35, 40,10, 15,58,0};
//
//        for (int i = 0; i < array.length; i++) {
//            int min = array[i];
//            int min_i = i;
//
//            for (int j = i+1; j <array.length ; j++) {
//                if (array[j]<min){
//                    min=array[j];
//                    min_i=j;
//
//                }
//
//            }
//            if(i!=min_i){
//                int n = array[i];
//                array[i]=array[min_i];
//                array[min_i]=n;
//            }
//
//
//        }
//        System.out.println(Arrays.toString(array));

        int[] arr = {15, 12, 45, 12, 35, 200, 487, 57};
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int k = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = k;
            }

        }
        System.out.println(Arrays.toString(arr));
    }

}




