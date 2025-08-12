package Level_3;
import java.util.Scanner;

public class UniqueCharFrequency {
    public static char[] uniqueCharacters(String text) {
        char[] unique = new char[text.length()];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[index++] = ch;
            }
        }
        char[] finalUnique = new char[index];
        for (int i = 0; i < index; i++) {
            finalUnique[i] = unique[i];
        }
        return finalUnique;
    }

    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        char[] uniqueChars = uniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] frequencyArray = findFrequency(text);
        for (int i = 0; i < frequencyArray.length; i++) {
            System.out.println(frequencyArray[i][0] + " : " + frequencyArray[i][1]);
        }
    }
}

