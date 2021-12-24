package Lesson14;

import java.util.Scanner;

public class ArrayaAndMethods {
    public static void main(String[] args) {

        System.out.println("Введите первое число: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();
        number(a, b);
    }
        public static int number (int a, int b){
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
            return 0;
        }
//        String t = "У лукоморья дуб зелёный;\n" +
//                "Златая цепь на дубе том:\n" +
//                "И днём и ночью кот учёный\n" +
//                "Всё ходит по цепи кругом;\n" +
//                "Идёт направо — песнь заводит,\n" +
//                "Налево — сказку говорит.\n" +
//                "Там чудеса: там леший бродит,\n" +
//                "Русалка на ветвях сидит;\n" +
//                "Там на неведомых дорожках\n" +
//                "Следы невиданных зверей;";

//        StringBuffer stringBuffer = new StringBuffer(t);
//        System.out.println(stringBuffer.reverse());

//        String rev = " ";
//        int l = t.length();
//        for (int i = l-1; i >= 0; i--) {
//            rev = rev + t.charAt(i);}
//            System.out.println(rev);

//    вывести числа от m до n



//        String t = "У лукоморья дуб зелёный;\n" +
//                "Златая цепь на дубе том:\n" +
//                "И днём и ночью кот учёный\n" +
//                "Всё ходит по цепи кругом;\n" +
//                "Идёт направо — песнь заводит,\n" +
//                "Налево — сказку говорит.\n" +
//                "Там чудеса: там леший бродит,\n" +
//                "Русалка на ветвях сидит;\n" +
//                "Там на неведомых дорожках\n" +
//                "Следы невиданных зверей;";


//                            Вывести каждое слово с новой строки и удалить все ненужные пробелы.

//        String[] t1 = t.split(" ");
//        for (String word : t1) {
//            System.out.println(word);//   }

//                          Заменить все буквы «ё» на «е» и все буквы «а» на «я»

//        String t1 = t.replace('ё', 'е');
//        String t2 = t1.replace('а', 'я');
//        System.out.println(t2);

//                              Вырезать строку «И днём и ночью».
//        String t1 = t.substring(0, 49);
//        String t2 = t.substring(65);
//
//        System.out.println(t1 + '\n' + t2);

//                            Вывести текст в ВЕРХНЕМ РЕГИСТРЕ.

//        String t1 = t.toUpperCase(Locale.ROOT);
//        System.out.println(t1);

//                         Вывести текст в нижнем регистре.
//        String t1 = t.toLowerCase(Locale.ROOT);
//        System.out.println(t1);

//                                 Проверить, содержит ли наш текст строку «Русалка на ветвях сидит;»
//        System.out.println(t.indexOf("Русалка на ветвях сидит;"));


//                 Переверните текст наоборот, что бы начало оказалось в конце, а конец текста в начале.
//      String rev = " ";
//      int l = t.length();
//        for (int i = l-1; i >=0 ; i--) {
//            rev = rev + t.charAt(i);
//        }
//        System.out.println(rev);


//                    !!НЕ ЗНАЮ ИЛИ ПРАВИЛЬНО ПОНЯЛА
//                    На каждую строку создайте отдельную ссылку. Сравните ссылки(==) и значения(.equals()).
//
//        String t1 = "У лукоморья дуб зелёный;\n";
//        String t2 = t1;
//        String t3 = "И днём и ночью кот учёный\n";
//        String t4 = t3;
//        String t5 = "Идёт направо — песнь заводит,\n";
//        String t6 = "Налево — сказку говорит.\n";
//        String t7 = "Там чудеса: там леший бродит,\n";
//        String t8 = t7;
//        String t9 = "Там на неведомых дорожках\n";
//        String t10 = "Следы невиданных зверей;";
//
//        boolean sr = t1.equals(t2);
//        boolean sr1 = t3.equals(t4);
//        boolean sr2 = t5.equals(t6);
//        boolean sr3 = t7.equals(t8);
//        boolean sr4 = t9.equals(t10);
//        System.out.println(sr);
//        System.out.println(sr1);
//        System.out.println(sr2);
//        System.out.println(sr3);
//        System.out.println(sr4);

    }






