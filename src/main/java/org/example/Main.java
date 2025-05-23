package org.example;

public class Main {

    public static void main(String[] args) {
        // test etmek istersen buraya çağrılar yazabilirsin
    }

    // Palindrom kontrolü
    public static boolean checkForPalindrome(String input) {
        if (input == null) return false;

        // Tüm karakterleri küçük harfe çevirip sadece harf ve rakamları tut
        StringBuilder cleaned = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        // Tersini oluştur
        String cleanedStr = cleaned.toString();
        String reversedStr = cleaned.reverse().toString();

        return cleanedStr.equals(reversedStr);
    }

    // Decimal to Binary
    public static String convertDecimalToBinary(int number) {
        if (number == 0) return "0";

        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.insert(0, number % 2);
            number = number / 2;
        }

        return binary.toString();
    }
}
