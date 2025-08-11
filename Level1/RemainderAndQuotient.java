package Level_1;

import java.util.Scanner;

public class RemainderAndQuotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();
        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println("Remainder: " + result[0]);
        System.out.println("Quotient: " + result[1]);
        sc.close();
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;
        return new int[]{remainder, quotient};
    }
}
