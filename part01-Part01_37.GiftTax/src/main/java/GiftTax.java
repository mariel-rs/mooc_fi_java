
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");

        int giftValue = Integer.valueOf(scan.nextLine());

        // Initialize tax rates and tax limits depending on gift value
        int lowLimitTax = 0;
        double taxRate = 0.0;
        int lowLimit = 0;

        if (giftValue > 1000000) {
            lowLimitTax = 142100;
            taxRate = 0.17;
            lowLimit = 1000000;
        } else if (giftValue >= 200000 && giftValue < 1000000) {
            lowLimitTax = 22100;
            taxRate = 0.15;
            lowLimit = 200000;
        } else if (giftValue >= 55000 && giftValue < 200000) {
            lowLimitTax = 4700;
            taxRate = 0.12;
            lowLimit = 55000;
        } else if (giftValue >= 25000 && giftValue < 55000) {
            lowLimitTax = 1700;
            taxRate = 0.10;
            lowLimit = 25000;
        } else if (giftValue >= 5000 && giftValue < 25000) {
            lowLimitTax = 100;
            taxRate = 0.08;
            lowLimit = 5000;
        }
        // Calculate the tax
        double tax = lowLimitTax + ((giftValue - lowLimit) * taxRate);
        
        // Output the tax
        if (tax > 0){
            System.out.println("Tax: " + tax);
        } else {
            System.out.println("No tax!");
        }
    }
}
