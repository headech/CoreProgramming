package Level_1;

import java.util.Scanner;

public class MaxHandshakes {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of students: ");
            int n = sc.nextInt();

            int handshakes = calculateHandshakes(n);

            System.out.println("The maximum number of handshakes among " + n + " students is " + handshakes);
        }
    }
}

