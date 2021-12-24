package Lesson14;

public class Probnyj {
    public static void main(String[] args) {
        String verse = "У лукоморья дуб зелёный;\n" +
                "Златая цепь на дубе том:\n" +
                "И днём и ночью кот учёный\n" +
                "Всё ходит по цепи кругом;\n" +
                "Идёт направо — песнь заводит,\n" +
                "Налево — сказку говорит.\n" +
                "Там чудеса: там леший бродит,\n" +
                "Русалка на ветвях сидит;\n" +
                "Там на неведомых дорожках\n" +
                "Следы невиданных зверей;";

//                                  every word from a new line
//        String [] arrverse = verse.split(" ");
//        for (String verse1: arrverse) {
//            System.out.println(verse1.trim());
//        }

//                              replace all letter yo with e, and a with ya
//        String verseWithReplace = verse.replace('ё', 'е');
//        String verseWithReplace1 = verseWithReplace.replace('а', 'я');
//        System.out.println(verseWithReplace1);

//                                  Вырезать строку «И днём и ночью»
//        int string = verse.indexOf("И днём и ночью кот учёный");
//        System.out.println(string);
//        int string1 = verse.indexOf("учёный");
//        System.out.println(string1);
//        String ver = verse.substring(0, 49);
//        String vers = verse.substring(70);
//        System.out.println(ver + vers);

//
        String rev = " ";
        int l = verse.length();
        for (int i = l-1; i >= 0; i--) {
            rev = rev + verse.charAt(i);
        }
        System.out.println(rev);
    }
}
