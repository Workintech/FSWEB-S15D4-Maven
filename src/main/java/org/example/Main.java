package org.example;

public class Main {
    public static String convertDecimalToBinary(int n) {
        if (n == 0) return "0";
        boolean negative = n < 0;
        long value = n;
        if (negative) value = -value;
        StringBuilder sb = new StringBuilder();
        while (value > 0) {
            sb.append(value % 2);
            value /= 2;
        }
        if (sb.length() == 0) sb.append('0');
        if (negative) sb.append('-');
        return sb.reverse().toString();
    }

    public static boolean checkForPalindrome(String input) {
        if (input == null) return false;
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) sb.append(Character.toLowerCase(c));
        }
        String cleaned = sb.toString();
        if (cleaned.length() == 0) return false;
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }
}