package Level_3;
import java.util.Scanner;

public class CollinearityCheck {

    static boolean checkCollinearSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    static boolean checkCollinearArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        if (checkCollinearSlope(x1, y1, x2, y2, x3, y3))
            System.out.println("Collinear by Slope Formula");
        else
            System.out.println("Not Collinear by Slope Formula");

        if (checkCollinearArea(x1, y1, x2, y2, x3, y3))
            System.out.println("Collinear by Area of Triangle Formula");
        else
            System.out.println("Not Collinear by Area of Triangle Formula");
    }
}
