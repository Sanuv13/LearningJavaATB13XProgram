package Tasks;
import java.util.Scanner;
public class test006_minimum_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number1");
        int number1 =scan.nextInt();
        System.out.println("Enter the numner2");
        int number2=scan.nextInt();
        if (number1<number2){
            System.out.println("minimum number is "+number1 );
        }
        else System.out.println("minimum number is " +number2);
    }
}
