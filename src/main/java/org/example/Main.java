package org.example;

import java.util.Stack;

public class Main {

    // Palindrom kontrolü (noktalama, boşluk ve büyük-küçük harf duyarsız)
    public static boolean checkForPalindrome(String input) {
        if (input == null) return false;

        String cleaned = input.replaceAll("[\\W_]", "").toLowerCase();  // harf ve sayı dışı karakterleri çıkar

        Stack<Character> stack = new Stack<>();
        for (char c : cleaned.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return cleaned.equals(reversed.toString());
    }