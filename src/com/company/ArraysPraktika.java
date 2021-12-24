package com.company;

import java.util.Arrays;

public class ArraysPraktika {

    public static void main(String[] args) {

//             cортировка массива
//        int [] arr = {15, 45, 24, 75, 125, 12};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

//                     binarySearch  - поиск элемента по значению.. !!ТОЛЬКО В ОТСОРТ одномерном!! массиве
//        int [] arr = {15, 54, 12, 65, 12};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int num = Arrays.binarySearch(arr, 12);
//        System.out.println(num);

        //             System.arraycopy

//           int[] arr = {1, 15, 62, 45, 7, 12, 64, 254, 45};
//           int[] arra = {0, 0, 0, 0, 0, 0, 0, 0, 0};
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arra));
//
//        System.arraycopy(arr, 3, arra, 5, 3);
//        System.out.println(Arrays.toString(arra));

//       int [] arr ={12, 15, 23, 45, 12, 5};
//       int [] arra = {0, 0, 0, 0, 0, 0};
//        Arrays.sort(arr);
//       System.arraycopy(arr, 2, arra, 3, 2);
//        System.out.println(Arrays.toString(arra));

//                           РАЗНОЕ КОЛИЧЕСТВО СТОЛБЦОВ
//        int[][] array = new int[5][];
//        array[0] = new int[4];
//        array[1] = new int[3];
//        array[2] = new int[2];
//        array[3] = new int[6];
//        array[4] = new int[1];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = 1;
//                System.out.print(array[i][j] + " " + '\t');
//            }
//            System.out.println();

//        int [][] arr = new int[3][];
//        arr[0] = new int [3];
//        arr[1] = new int[5];
//        arr[2] = new int [6];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " " + '\t');
//            }
//            System.out.println();
//        }


//             MINIMUM    MAXIMUM  in ARRAY
//        int [][] arr = new int [4][5];
//        int k = 0;
//        int min = arr[0][0];
//        int max = arr[0][0];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = k++;
//                if (arr[i][j]<min)
//                    min = arr[i][j];
//                if (arr[i][j]>max)
//                    max = arr[i][j];
//            }
//        }
//        System.out.println("min "+min);
//        System.out.println("max "+max);
//        }


        //                      ARRAY  10*10  ------
//    char [][] arr= new char [10][10];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = '-';
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }


        //                           СРЕДНЕЕ ЗНАЧЕНИЕ ЭЛЕМЕНТОВ ИЗ МАССИВА
//        int[][] arr = new int[5][10];
//        int count = 0;
//        int k = 0;
//        int sum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = count++;
//                k++;
//                sum = sum + arr[i][j];
//                System.out.print(arr[i][j] + " " + '\t');
//            }
//            System.out.println();
//        }
//
//        System.out.println(sum / k);


//        int[][] arr = new int[4][5];
//        int k = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = k++;
//                if (arr[i][j] == 15)
//                    System.out.print("15");
//        int []arr = {15, 12, 46, 85, 64};
//        Arrays.sort(arr);
//        System.out.println(Arrays.binarySearch(arr, 54));


//                   ЧЁТНЫЕ ЧИСЛА ОТ 2 ДО 20
//        int a = 0;
//        for (int i = 2; i <= 20; i++) {
//            if (i % 2 == 0)
//                a++;
//        }
//
//        int[] mas = new int[a];
//        for (int i = 2, b = 0; i <= 20; i++) {
//            if (i % 2 == 0){
//                mas[b] = i;
//                System.out.println(mas[b]+" ");
//                b++;
//        }
//    }

//        int [] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 15);
//        }
//            System.out.println(Arrays.toString(arr));
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i > 0){
//                if (arr[i-1] > arr[i]){
//                    System.out.println("Не возраст");
//                    break;
//                }
//            }
//            if (i == arr.length - 1){
//                System.out.println("Возраст");
//            }
//        }
//        System.out.println(Arrays.toString(arr));


//       int [] arr = {12, 56, 23, 47, 879, 15};
//        System.out.println(Arrays.toString(arr));
//        int min = arr[0]; int max = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min){
//                min = arr[i];
//            }
//            if (arr[i] > max){
//                max = arr[i];
//            }
//        }
//        System.out.println("Min " + min);
//        System.out.println("Max "  + max);

//                                      фибоначчи
//        int[] ar = new int[20];
//        for (int i = 0; i < ar.length; i++) {
//            if (i < 2) {
//                ar[i] = 1;
//            } else {
//                ar[i] = ar[i - 2] + ar[i - 1];
//            }
//        }
//        System.out.println(Arrays.toString(ar));


//                     СТРОКИ СТОЛБЦЫ ДВУМЕРНЫЙ
//        int [][] arr = new int[5][8];
//        int k = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                arr[i][j] = k++;
//                System.out.print(arr[i][j] + " ");
//
//            }
//            System.out.println();
//
//        }System.out.println(arr.length);
//        System.out.println(arr[2].length);

        //                              Создайте массив из 12 случайных целых чисел
        //                              из отрезка [-15;15]. Определите какой элемент является в этом массиве
        //                              максимальным и сообщите индекс его последнего вхождения в массив.
//        int [] arr = new int[12];
//        int max = -16;
//        int ind = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 30 - 15);
//            if (max < arr[i]){
//                max = arr[i];
//                ind = i;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Max " + max);
//        System.out.println("Ind " + ind);

//  Создайте массив из 12 случайных целых чисел
//  из отрезка [-15;15]. Определите какой элемент является в
//  этом массиве максимальным и сообщите индекс его последнего вхождения в массив.

//        int[] ar = new int[12];
//        int max = ar[0];
//        int ind = 0;
//        for (int i = 0; i < ar.length; i++) {
//            ar[i] = (int) (Math.random() * 30 - 15);
//            if (ar[i] > max) {
//                max = ar[i];
//                ind = i;
//            }
//
//
//        } System.out.println(Arrays.toString(ar));
//        System.out.println("max " + max);
//        System.out.println("ind" + ind);
//    }

//        Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на
//        экран в строку. Определите какой элемент встречается
//        в массиве чаще всего и выведите об этом сообщение на экран. Если два каких-то элемента встречаются одинаковое
//        количество раз, то не выводите ничего.

       int am = 0;
       int a0 = 0;
       int a1 = 0;
       int [] ar = new int[11];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int)(Math.random() * 3 - 1);
            System.out.print(ar[i] + " ");
            if (ar[i] < 0) am++;
            if (ar[i] == 0) a0++;
            if (ar[i] > 0) a1++;
        if (i == ar.length-1){
            if (am > a0 & am > a1)
                System.out.println(">-1");
            if (a0 > am & a0 > a1)
                System.out.println(">0");
            if (a1> am & a1 > a0)
                System.out.println(">1");

            }
        }
        }
    }












