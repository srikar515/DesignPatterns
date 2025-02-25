package OberverPattern;

import java.util.Scanner;

public class Main {
    public void funcSubstring(String inputStr) {
        if (inputStr == null || inputStr.length() < 2) {
            System.out.println("None");
            return;
        }
    
        String longestPalindrome = "";
        int maxLength = 0;
    
        // Try all possible substrings
        for (int i = 0; i < inputStr.length(); i++) {
            for (int j = i + 1; j <= inputStr.length(); j++) {
                String substring = inputStr.substring(i, j);
                
                // Check if substring length is greater than current max
                // and if it's a palindrome
                if (substring.length() > maxLength && isPalindrome(substring)) {
                    longestPalindrome = substring;
                    maxLength = substring.length();
                }
                // If same length, check lexicographically smaller
                else if (substring.length() == maxLength && 
                         isPalindrome(substring) && 
                         substring.compareTo(longestPalindrome) < 0) {
                    longestPalindrome = substring;
                }
            }
        }
    
        // Print result based on if we found a valid palindrome
        if (maxLength > 1) {
            System.out.println(longestPalindrome);
        } else {
            System.out.println("None");
        }
    }
    
    // Helper method to check if a string is palindrome
    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
       Main m = new Main();
       m.funcSubstring("YABCCBAZ");
       m.funcSubstring("ABC");
    }
}
