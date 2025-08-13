package String.Extras;
import java.util.Scanner;

public class SubstringOccurrences {
    public static int countOccurrences(String text, String sub) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String text = sc.nextLine();
        System.out.print("Enter the substring: ");
        String sub = sc.nextLine();
        System.out.println("Occurrences: " + countOccurrences(text, sub));
        sc.close();
    }
}
