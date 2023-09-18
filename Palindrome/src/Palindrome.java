import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Setting up variables
        Scanner input = new Scanner(System.in);

        // prompt user to enter a three digit number
        System.out.print("Please enter a three digit number: ");
        int userNumber = input.nextInt();

        // Check to ensure number chosen is 3 digits
        if (userNumber > 999) {
            System.out.println("The number chosen is too high...");
        }
        else {
            
            // breaks userNumber into respecting hundreds, tens, and ones (if userNumber = 832, then the number should break into 8, 3, and 2)
            int number1 = userNumber / 100;
            int number2 = ((userNumber - (number1 * 100)) / 10);
            int number3 = (userNumber % 10);
            
            // using broken down userNumber, this flips the number around (if userNumber = 832, then the new number should be 238)
            int flippedUserNumber = (number3 * 100) + (number2 * 10) + number1;
            
            if (userNumber == flippedUserNumber) {
                System.out.println(userNumber + " is a palindrome!");
            }
            else {
                System.out.println(userNumber + " is NOT a palindrome!");
            }

        }

    }
}
