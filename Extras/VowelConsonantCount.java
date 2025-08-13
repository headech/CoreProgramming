package String.Extras;
import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String text = sc.nextLine().toLowerCase();
            int vowels = 0, consonants = 0;
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    if ("aeiou".indexOf(ch) != -1) vowels++;
                    else consonants++;
                }
            }
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
        }
    }
}

