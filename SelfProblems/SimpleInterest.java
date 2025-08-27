import java.util.Scanner;
class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.printf("The Simple Interest is: %.2f\n", simpleInterest);

        sc.close();
    }
}