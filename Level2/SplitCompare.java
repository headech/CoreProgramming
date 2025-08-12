package Level_2;
import java.util.Scanner;

public class SplitCompare {
    public static int customLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] customSplit(String text) {
        int len = customLength(text);
        int spaceCount = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') spaceCount++;
        }
        int[] spaceIndexes = new int[spaceCount + 2];
        spaceIndexes[0] = -1;
        int index = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = len;
        String[] words = new String[spaceCount + 1];
        for (int i = 0; i < words.length; i++) {
            String word = "";
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] customWords = customSplit(text);
        String[] builtInWords = text.split(" ");
        boolean areEqual = compareArrays(customWords, builtInWords);
        System.out.println("Custom split result:");
        for (String word : customWords) System.out.println(word);
        System.out.println("Built-in split result:");
        for (String word : builtInWords) System.out.println(word);
        System.out.println("Are both equal: " + areEqual);
    }
}
