package Level_2;
import java.util.Scanner;

public class CustomTrim {
    public static int[] findTrimIndexes(String text) {
        int start = 0, end = text.length() - 1;
        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end + 1};
    }

    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < str.length(); i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] indexes = findTrimIndexes(text);
        String customTrimmed = customSubstring(text, indexes[0], indexes[1]);
        String builtInTrimmed = text.trim();
        boolean areEqual = compareStrings(customTrimmed, builtInTrimmed);
        System.out.println("Custom trimmed: '" + customTrimmed + "'");
        System.out.println("Built-in trimmed: '" + builtInTrimmed + "'");
        System.out.println("Are both equal: " + areEqual);
    }
}

