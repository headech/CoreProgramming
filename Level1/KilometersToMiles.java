import java.util.Scanner;
public class KilometersToMiles {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
            double km = sc.nextDouble();
            double miles = km*0.621371;
            System.out.println("The total miles is "+miles+" mile for the given "+km+" km");
    }
}