import java.util.Scanner;
class PerimeterOfRectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        double perimeter = 2 * (length + breadth);
        System.out.printf("The Perimeter of the Rectangle is: %.2f\n", perimeter);
        sc.close();
    }
}