import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        double[][] marks = new double[number][3];
        double[] percentage = new double[number];
        String[] grade = new String[number];

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                double mark;
                do {
                    System.out.print("Enter marks for " + subject + " for student " + (i + 1) + ": ");
                    mark = sc.nextDouble();
                } while (mark < 0 || mark > 100);
                marks[i][j] = mark;
            }
        }

        for (int i = 0; i < number; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 90) grade[i] = "A";
            else if (percentage[i] >= 75) grade[i] = "B";
            else if (percentage[i] >= 50) grade[i] = "C";
            else grade[i] = "F";
        }

        System.out.println("\nStudent Marks, Percentage, and Grade:");
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) + ": Physics = " + marks[i][0] +
                               ", Chemistry = " + marks[i][1] +
                               ", Maths = " + marks[i][2] +
                               ", Percentage = " + percentage[i] +
                               ", Grade = " + grade[i]);
        }

        sc.close();
    }
}
