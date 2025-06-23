package june17;
import java.util.Scanner;

public class Lab005_factoreal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your value:");

        if (!scan.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            return;
        }

        int number = scan.nextInt();
        long factorial = 1;

        if (number < 0) {
            System.out.println("Negative value not allowed.");
            return;
        }

        for (int i = 1; i <= number; i++) {
            factorial =factorial* i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}