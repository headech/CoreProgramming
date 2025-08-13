package String.Extras;
import java.util.Scanner;

public class MostFrequentChar {
    public static char findMostFrequentChar(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        int max = -1;
        char result = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > max) {
                max = freq[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Most Frequent Character: '" + findMostFrequentChar(input) + "'");
        sc.close();
    }
}
