import java.util.Scanner;
public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        double result = Math.pow(base, exponent);
        System.out.printf("The result is: %.2f\n", result);
        sc.close();
    }
}
