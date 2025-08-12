import java.util.Scanner;

public class CharArrayCompare {
    public static char[] customToCharArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char[] customArr = customToCharArray(text);
        char[] builtInArr = text.toCharArray();
        boolean areEqual = compareCharArrays(customArr, builtInArr);
        System.out.println("Custom char array: " + new String(customArr));
        System.out.println("Built-in char array: " + new String(builtInArr));
        System.out.println("Are both arrays equal: " + areEqual);
    }
}
