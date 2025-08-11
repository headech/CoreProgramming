package Level_1;

import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of students: ");
            int numberOfStudents = sc.nextInt();
            int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
            System.out.println("The maximum number of possible handshakes is: " + handshakes);
        }
    }
}
