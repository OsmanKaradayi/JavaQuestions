package javaQuestions;

//Java Program to Check Palindrome String.
//Verilen String ifadenin palindrome olup olmadığını kontrol eden kod yazınız

public class PalindromeCheck {
    public static void main(String[] args) {

        String s = "Kazak";
        s = s.toLowerCase();
        String reversedStr = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + s.charAt(i);
        }
        if (s.equals(reversedStr)) {
            System.out.println(s + " is a palindrome word.");
        } else {
            System.out.println(s + " is not a palindrome word.");
        }
    }
}
