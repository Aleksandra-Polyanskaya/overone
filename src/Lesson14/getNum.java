package Lesson14;

import java.lang.reflect.Array;
import java.util.Arrays;

public class getNum {

    public String str(String st) {
        st = "упражнения Java!";
        System.out.println(st.charAt(0));
        System.out.println(st.charAt(12));
        return null;
    }

    public String comparisonString(String first, String secondary) {
        System.out.println(first.equals(secondary));
        return null;
    }

    public String sequence(String one, String two) {
        System.out.println(one.contains(two));
        return null;
    }

    public void test(String str) {
        str = "I like Java";
        System.out.println(str);
    }

    public int max(int a, int b) {
        int max = 0;
        if (a > b)
            max = a;
        else
            max = b;
        return max;
    }

    public static int[] sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    int buffer = arr[j];
                    arr[j] = arr[i];
                    arr[i] = buffer;
                }
            }

        }
        return arr;
    }
        public static void printtoArray () {
            int[] arr = new int[10];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 50);
            }
            sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
