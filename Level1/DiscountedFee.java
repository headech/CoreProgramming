import java.util.Scanner;
public class DiscountedFee {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double fee = sc.nextDouble();
        double discountPercent = sc.nextDouble();
        double discountAmount = fee/100*discountPercent;
        double discountedFee = fee - discountAmount;
        System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+discountedFee);
    }

}
