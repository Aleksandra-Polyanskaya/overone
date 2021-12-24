package Lesson21.collection;

import java.util.*;

public class Practicum {
    public static void main(String[] args) {

//        List<String> list = new LinkedList<>();
//        list.add("Red");
//        list.add("Orange");
//        list.add("Pink");
//        list.add("Black");
//        list.add("White");
//        list.add("Gray");
//
//        list.add(2, "Yellow");
//
//        for (String s:
//             list) {
//            System.out.println(s);
//        }

        HashSet<String> prob = new HashSet<>();
        prob.add("Red");
        prob.add("Orange");
        prob.add("Green");
        prob.add("Black");
        prob.add("White");

        for (String s:
             prob) {
            System.out.print(s + " ");
        }

        System.out.println(prob.size());

//        prob.clear();
//        System.out.println(prob);

        if (!prob.isEmpty())
            System.out.println(prob);

        HashSet<String> clon = new HashSet<>();
        clon = (HashSet<String>) prob.clone();
        System.out.println(clon);

        String [] proba = new String[prob.size()];
        prob.toArray(proba);

        for (String a :
             proba) {
            System.out.println(a);
        }


    }
}
