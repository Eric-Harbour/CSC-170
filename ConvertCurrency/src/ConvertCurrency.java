/*
Program takes input from user (in USD) and converts it to GBP, then prints
*/

import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // prompt user to input amount (USD) they would like to convert
        System.out.print("Enter the number of USD: ");
        String amountUSDString = input.nextLine();
        double amountUSDDouble = Double.parseDouble(amountUSDString);
        
        // conversion is made from USD to GBP (1.38 GBP to 1 USD)
        double amountGBP = (amountUSDDouble * 1.38);
        
        // outputs conversion
       // System.out.println(amountUSDDouble + " USD is " + amountGBP);
        
       // using printf to format our amount that prints to two places after decimal
        System.out.printf("%.2f USD is %.2f GBP.", amountUSDDouble, amountGBP);
        
    }
}
