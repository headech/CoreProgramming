package Level_1;

import java.util.Scanner;

public class TriangularPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 (m): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 (m): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 (m): ");
        double side3 = sc.nextDouble();
        
        double perimeter = side1 + side2 + side3;
        double rounds = calculateRounds(perimeter, 5000);
        
        System.out.println("The athlete must complete " + rounds + " rounds to finish 5 km.");
    }

    public static double calculateRounds(double perimeter, double distance) {
        return distance / perimeter;
    }
}

