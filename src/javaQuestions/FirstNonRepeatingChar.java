package javaQuestions;

// Java Program to Find the First Non-repeated Character in a String.
//Girilen sitring bir ifadede tekrar etmeyen ilk karakteri getiren kodu yazınız.

public class FirstNonRepeatingChar {
    public static void main(String[] args) {

        String str = "Hello how are you java";
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First Non-repeated Character : " + ch);
                break;
            }
        }
    }
}