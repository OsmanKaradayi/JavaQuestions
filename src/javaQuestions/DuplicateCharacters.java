package javaQuestions;

import java.util.HashMap;

//Java Program to Find Duplicate Characters in a String.
//Verilen String içinde tekrar eden karakterleri ve tekrer sayısını veren bir kod yazınız

public class DuplicateCharacters {

    public static void main(String[] args) {

        String str = "Congratulations";
        String[] characters = str.split("");
        HashMap<String, Integer> characterMap = new HashMap<>();

        for (String w : characters) {
            if (str.indexOf(w) != str.lastIndexOf(w)) {
                Integer count = characterMap.get(w);
                if (count == null) {
                    characterMap.put(w, 1);
                } else {
                    characterMap.put(w, count + 1);
                }
            }
        }
        System.out.println(characterMap);

    }
}
