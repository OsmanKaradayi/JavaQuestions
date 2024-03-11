package javaQuestions;

import java.util.HashMap;
import java.util.Map;

// Java Program to Find Duplicate Words in a String
//Verilen bir string cümle içinde tekrar eden kelimeleri ve bu kelimelerin sayısını veren kod yazınız

public class DuplicateWords {

    public static void main(String[] args) {

        String sentence = "Hello Java World. Java is really easy. This world is incredible.";
        sentence = sentence.toLowerCase().replaceAll("\\.", ""); // Noktalamaları kaldır
        String[] words = sentence.split("\\s+"); // Boşluklara göre ayır

        HashMap<String, Integer> wordMap = new HashMap<>();

        for (String w : words) {
            Integer count = wordMap.get(w);

            if (count == null) {
                wordMap.put(w, 1);
            } else {
                wordMap.put(w, count + 1);
            }
        }

        for (Map.Entry<String, Integer> w : wordMap.entrySet()) {

            if (w.getValue() > 1) {
                System.out.println("\"" + w.getKey() + "\" occurrence count: " + w.getValue());
            }
        }
    }
}
