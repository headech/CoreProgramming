package Level_3;
import java.util.Scanner;

public class PalindromeCheck {
    static boolean isPalindrome1(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    static boolean isPalindrome2(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindrome2(text, start + 1, end - 1);
    }

    static char[] reverseString(String text) {
        char[] reversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) reversed[i] = text.charAt(text.length() - 1 - i);
        return reversed;
    }

    static boolean isPalindrome3(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("Logic 1: " + (isPalindrome1(text) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 2: " + (isPalindrome2(text, 0, text.length() - 1) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 3: " + (isPalindrome3(text) ? "Palindrome" : "Not Palindrome"));
    }
}
