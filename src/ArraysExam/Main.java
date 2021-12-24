package ArraysExam;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        1. Написать функцию, которая возвращает сумму чисел от 1 до 5.
//        2. Написать функцию, которая возвращает среднее арифметическое от 1 до 9.
//        3. Написать функцию, которая получает координаты 2 точек на плоскости и
//        возвращает расстояние между ними.
//        4. Написать функцию, которая возвращает наибольший общий делитель.

        sum();
        taskTwo();
//        System.out.println(taskThree(2, 1, 7, 5));
        taskFour(15, 20);
        taskTri(5, -15);
    }

    public static int sum() {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        return sum;
    }

    public static int taskTwo() {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 9; i++) {
            sum = sum + i;
            count++;
        }
        System.out.println(sum / count);
        return sum / count;
    }

//    public static int taskThree(int x, int y, int x1, int y1) {
//        int result = (y1 - y) * (y1 - y) + (x1 - x) * (x1 - x);
//        return result;
//    }

    public static int taskFour(int a, int b) {
        int nod = 0;
        int min = 0;
        if (a > b)
            min = b;
        else
            min = a;
        for (int count = 1; count <= min; count++) {
            if (a % count == 0 && b % count == 0) {
                if (count > nod) {
                    nod = count;
                }
            }

        }
        System.out.println(nod);
        return nod;
    }

    //             третье переделанное
    public static int taskTri(int a, int b) {
        int max;
        if (a > b) {
            max = a;
            System.out.println(max - b);
        } else {
            max = b;
            System.out.println(max - a);
        }
        return 0;
    }
}

