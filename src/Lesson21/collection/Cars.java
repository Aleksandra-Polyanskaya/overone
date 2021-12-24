package Lesson21.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Cars {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("red");
        list.add("green");
        list.add("orange");
        list.add("white");
        list.add("black");

                     //  вывод списка как стринг элементов
//        for (String s: list) {
//            System.out.println(s);
//        }

                   //   вывод как массив

//        System.out.println(list);

                          //   ставка элемента в впервой позиции

//        list.add(0, "pink");

                      // извлечение элемента по индексу

//       6456 System.out.println(list.get(2));

                               //  замена элемента по заданному индексу
//        list.set(2, "yellow");
//        System.out.println(list);


                                                       // извлечь часть массива
//        List<String> sublist = list.subList(1,4);
//        System.out.println(sublist);

                            //  копирование одного списка в другой
//        List<String> list2 = new ArrayList<>();
//        list2.add("name");
//        list2.add("age");
//        list2.add("size");
//
//        Collections.copy(list, list2);
//        System.out.println(list);
//        System.out.println(list2);   // output [name, age, size, white, black]
//[name, age, size]

                       // перемешивание элементов

//        Collections.shuffle(list);
//        System.out.println(list);

                               // в обратном порядке

//        Collections.reverse(list);
//        System.out.println(list);

                              //  поменять 2 существующих элемента

//        Collections.swap(list, 1, 4);
//        System.out.println(list);

                              // клонирование

        List<String> list2Clone = (ArrayList<String>)list.clone();
        System.out.println(list2Clone);
    }
}
