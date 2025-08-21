public class FeeDiscount {
    public static void main(String[]args){
        int fee = 125000;
        int discountPercent = 10;
        int discountAmount = fee/100*discountPercent;
        int discountedFee = fee-discountAmount;
        System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+discountedFee);
    }
}
