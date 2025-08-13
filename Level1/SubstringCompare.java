import java.util.Scanner;

public class SubstringCompare {
    static String createSubstringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String substringCharAt = createSubstringUsingCharAt(text, start, end);
        String substringMethod = text.substring(start, end);

        boolean areEqual = compareStringsUsingCharAt(substringCharAt, substringMethod);

        System.out.println("Substring using charAt(): " + substringCharAt);
        System.out.println("Substring using substring(): " + substringMethod);
        System.out.println("Are both substrings equal? " + areEqual);
    }
}
