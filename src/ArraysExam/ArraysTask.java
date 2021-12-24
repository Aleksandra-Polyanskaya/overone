package ArraysExam;

import java.util.Scanner;

public class ArraysTask {
    public static void main(String[] args) {
//        Пользователь должен указать с клавиатуры чётное положительное число, а
//        программа должна создать массив указанного размера из случайных целых чисел из [-5;5]
//        и вывести его на экран в строку. После этого программа должна определить и сообщить
//        пользователю о том, сумма модулей какой половины массива больше: левой или правой, либо сообщить,
//                что эти суммы модулей равны. Если пользователь введёт
//        неподходящее число, то программа должна требовать повторного ввода до тех
//    пор, пока не будет указано корректное значение.
//        System.out.print("Введите чётное число: ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int[] arr = new int[a];
//        for (int i = 0; i <= arr.length - 1; i++) {
//            arr[i] = (int) (Math.random() * 10 - 5);
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        int sum = 0;
//        int sum2 = 0;
//        for (int i = 0; i < arr.length / 2; i++) {
//            sum = sum + arr[i];
//        }
//
//            System.out.print(sum + " ");
//        System.out.println();
//        for (int i = arr.length/2-1; i < arr.length; i++) {
//            sum2 = sum2 + arr[i];
//        }
//        System.out.println(sum2);
//        if (sum > sum2)
//            System.out.println("Cумма первых модулей больше.");
//        else
//            System.out.println("Сумма модулей второй половины больше");

//
//        Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом, чтобы
//        отрицательных и положительных элементов там было поровну и не было нулей. При этом порядок следования
//        элементов должен быть случаен (т. е. не подходит вариант, когда в массиве постоянно выпадает сначала
//    6 положительных, а потом 6 отрицательных чисел или же
//        когда элементы постоянно чередуются через один и пр.). Вывести полученный массив на экран.
//        int[] arr = new int[12];
//        int pol = 0;
//        int otr = 0;
//        do {
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = (int) (Math.random() * 21 - 10);
//                if (arr[i] > 0) {
//                    pol++;
//                } else {
//                    otr++;
//                }
//                if (arr[i] == 0) {
//                    --i;
//                }
//                if (i == arr.length - 1 & pol != arr.length / 2) {
//                    pol = 0;
//                    otr = 0;
//                }
//            }
//        }
//        while (pol != arr.length / 2 & otr != arr.length / 2);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

    int a = 10;
    int b = 100;

    int nod = 0;
    int min = 0;
    if (a > b) {
        min = b;
    }
    else{
        min = a;
    }
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0){
                if (i > nod){
                    nod = i;
                }
            }
        }
        System.out.println(nod);
    }
}
