package com.javarush.task.pro.task18.task1812;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

/* 
Рейтинг языков программирования
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<Language> languages = new ArrayList<>();
        Collections.addAll(languages,
                new Language("С#", 4.58),
                new Language("JavaScript", 2.54),
                new Language("Python", 10.47),
                new Language("C++", 7.11),
                new Language("Go", 1.46),
                new Language("R", 2.37),
                new Language("Java", 13.48),
                new Language("C", 15.95),
                new Language("Swift", 1.38),
                new Language("PHP", 2.49));

        Stream<Language> languageStream = sortByRanking(languages);
        languageStream.forEach(System.out::println);
    }

    public static Stream<Language> sortByRanking(ArrayList<Language> languages) {
        Comparator<Language> comparator = new Comparator<Language>() {
            @Override
            public int compare(Language o1, Language o2) {
                Double ranking1 = o1.getRanking();
                Double ranking2 = o2.getRanking();
                int compare = Double.compare(ranking2, ranking1);
//                int i = ranking1.compareTo(ranking2);
                return compare;
            }
        };
        return languages.stream().sorted(comparator);
    }
}
