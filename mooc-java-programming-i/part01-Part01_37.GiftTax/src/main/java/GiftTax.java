
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        double gift = scan.nextInt();
        if (gift < 5000) {
            System.out.println("No tax!");
        } else if (gift >= 5000 && gift < 25000) {
            System.out.println("Tax: " + giftTaxCalculator(gift, 5000, 100, 0.08));
        } else if (gift >= 25000 && gift < 55000) {
            System.out.println("Tax: " + giftTaxCalculator(gift, 25000, 1700, 0.1));
        } else if (gift >= 55000 & gift < 200000) {
            System.out.println("Tax: " + giftTaxCalculator(gift, 55000, 4700, 0.12));
        } else if (gift >= 200000 && gift < 1000000) {
            System.out.println("Tax: " + giftTaxCalculator(gift, 200000, 22100, 0.15));
        } else {
            System.out.println("Tax: " + giftTaxCalculator(gift, 1000000, 142100, 0.17));
        }

    }
    
    public static double giftTaxCalculator(double gift, int lowerLimit, int lowerLimitTax, double taxRate) {
        double giftTax = lowerLimitTax + (gift - lowerLimit) * taxRate;
        return giftTax;
    }
}
