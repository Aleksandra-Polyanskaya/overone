package oop.interface1.int3;

import java.util.Arrays;

public class maxWord {
    public static void main(String[] args) {
        String[] text = "alphabet hi people word world book hi books book hi woman man boy".split(" ");
        Arrays.sort(text);
        System.out.println(Arrays.toString(text));

        String maxWord = "", word = "";
        int maxCount = 0, count = 1;

        for (String s : text) {
            if (s.equals(word)){
                count++;
            }else{
                if (count > maxCount){
                    maxWord = word;
                    maxCount = count;
                }
                word = s;
                count = 1;
            }
        }
            System.out.println("Самое часто встречающееся слово: " + word + ". Повторяется " + count + " раза");
        }
    }
