package com.company;

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {

//        Создайте массив из 15 случайных целых чисел
//        из отрезка [0;9]. Выведите массив на экран. Подсчитайте сколько в массиве чётных
//        элементов и выведете это количество на экран на отдельной строке.

//        int chet = 0;
//        int[] ar = new int[15];
//        for (int i = 0; i <= ar.length-1; i++) {
//            ar[i] = (int) (Math.random() * 9);
//            System.out.println(ar[i]);
//            if (ar[i] % 2 == 0)
//                chet++;
//        }
//                System.out.println("chet" + chet);


//        Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку.
//        Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.

        int[] ar = new int[8];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 9 + 1);
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 != 0)
                ar[i] = 0;
            System.out.print(ar[i] + " ");
        }

//        Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
//                выведите массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое
//        элементов каждого массива и сообщите, для какого из массивов это значение оказалось больше
//                (либо сообщите, что их средние арифметические равны)

//        int [] ar = new int[5];
//        int [] arr = new int[5];
//        int sum_ar = 0;
//        int sum_arr = 0;
//        int k_ar = 0;
//        int k_arr = 0;
//        double result1 = 0;
//        double result2 = 0;
//
//        for (int i = 0; i < ar.length; i++) {
//        ar[i] = (int) (Math.random() * 5);
//            System.out.print(ar[i] + " ");
//        sum_ar = sum_ar + ar[i];
//        k_ar++;
//        result1 = sum_ar / k_ar;}
//        System.out.println();
//            System.out.println("Cреднее арифметическое чисел первого массива " + result1);
//
//            for (int j = 0; j < arr.length; j++) {
//        arr[j] = (int) (Math.random() * 5);
//                System.out.print(arr[j] + " ");
//            sum_arr = sum_arr + arr[j];
//            k_arr++;
//            result2 = sum_arr / k_arr;
//            }
//        System.out.println("Среднее арифметическое второго массива " + result2);
//            if (result1 > result2){
//                System.out.println("в первом больше");
//            }else if (result1 < result2){
//                System.out.println("второй больше");
//            }else
//                System.out.println("равны");

//       Создайте массив из 4 случайных целых чисел.
//Выведите его на экран в строку.
//Определить и вывести на экран сообщение о том,
//является ли массив строго возрастающей последовательностью.

//        int[] arr = new int[4];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 20);
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//            for (int i = 0; i < arr.length; i++) {
//                if (i>0){
//                if(arr[i - 1] >= arr[i]){
//                    System.out.println("Не возрастающая");
//                    break;
//                }}
//                  if (i == arr.length-1)
//                      System.out.println("Возрастающая");

//                3 10 11 18
//                0,1,2,3
                    }

                    }

