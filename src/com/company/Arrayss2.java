package com.company;

import java.util.Arrays;

public class Arrayss2 {
    public static void main(String[] args) {

        //       Создайте массив из 4 случайных целых чисел.
//Выведите его на экран в строку.
//Определить и вывести на экран сообщение о том,
//является ли массив строго возрастающей последовательностью.

        int [] ar = new int[4];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = i;
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < ar.length; i++) {
            if (i > 0){
                if (ar[i-1] > ar [i]){
                    System.out.println("Массив с не возрастающей прогрессией");
                    break;
                }
            }
            if (i == ar.length - 1){
                System.out.println("Массив строго возрастающей последовательности");
            }
        }
    }
}
