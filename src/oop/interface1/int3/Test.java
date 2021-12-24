package oop.interface1.int3;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        boolean a;


        String s = "4425232";
        StringBuffer stringBuffer2 = new StringBuffer(s);
        stringBuffer2.setLength(9);
        System.out.println(stringBuffer2.toString());


//        ArrayList<Integer> lot = new ArrayList<>(100);
//        for (int i = 0; i < 100; i++) {
//            lot.add(i);
//        }
//        Collections.shuffle(lot);
//        System.out.print("Выигрышная комбинация ");
//        for (int i = 0; i < 11; i++) {
//            System.out.print(lot.get(i) + " ");
//        }


//        String[] text = "alphabet 0 hi 1 people word world book hi books book hi woman man boy".split(" ");
//        Arrays.sort(text);
//        System.out.println(Arrays.toString(text));
//
//        String maxWord = "";
//        String word = "";
//        int maxCount = 0;
//        int count = 1;
//
//        for (String s : text) {
//            if (s.equals(word)) {
//                count++;
//            } else {
//                if (count > maxCount) {
//                    maxCount = count;
//                    maxWord = word;
//                }
//                word = s;
//                count = 1;
//            }
//        }
//
//        if (count > maxCount) {
//            maxCount = count;
//            maxWord = word;
//        }
//
//        System.out.println("Самое часто встречаемое слово: " + maxWord + " . Повторяется " + maxCount + " раза");






}
}