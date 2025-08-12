package Level_3;
import java.util.Scanner;

public class CharFrequency {
    public static String[][] findCharFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        String[][] result = new String[text.length()][2];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                freq[ch] = 0;
                index++;
            }
        }
        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] frequencyArray = findCharFrequency(text);
        for (int i = 0; i < frequencyArray.length; i++) {
            System.out.println(frequencyArray[i][0] + " : " + frequencyArray[i][1]);
        }
    }
}
