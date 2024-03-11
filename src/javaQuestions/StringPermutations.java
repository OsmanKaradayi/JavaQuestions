package javaQuestions;

import java.util.HashSet;
import java.util.Set;

//Java Program to Find All the Permutations of a String.
//Girilen String bir ifadenin harfleri yer değiştirilerek oluşturulabilecek anlamlı anlamsız bütün kelimeleri gösteren bir program yazınız.

public class StringPermutations {

    public static void main(String[] args) {

        String str = "Code";
        Set<String> words = new HashSet<>();
        words = findPermutations(str);
        System.out.println("Total : " +  words.size() + " \nwords : "+ words);

    }

    public static Set<String> findPermutations(String str) {

        Set<String> permutations = new HashSet<>();

        if (str == null || str.isEmpty()) {
            permutations.add("");
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remainingChars = str.substring(0, i) + str.substring(i + 1);
            Set<String> subPermutations = findPermutations(remainingChars);

            for (String w : subPermutations) {
                permutations.add(ch + w);
            }

        }
        return permutations;


    }
}