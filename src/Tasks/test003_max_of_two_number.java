package Tasks;
import java.util.Scanner;
public class test003_max_of_two_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1= scan.nextInt();
        System.out.println("Enter the second number");
        int number2=scan.nextInt();
        if(number1>number2){
            System.out.println("maximum number is " +number1);
        }
        else {
            System.out.println("maximum number is "+number2

            );
        }
    }
}
