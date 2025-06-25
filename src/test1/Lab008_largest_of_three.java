package test1;
import java.util.Scanner;
public class Lab008_largest_of_three {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = scan.nextInt();
        System.out.println("Enter the second number");
        int number2=scan.nextInt();
        System.out.println("Entered the third number");
        int number3=scan.nextInt();
        if(number1>number2 && number1>number3){
            System.out.println("largest number is " +number1);
        }
        else if(number2>number1 && number2>number3){
            System.out.println("largest number is " +number2);
        }
        else{
            System.out.println("largest number is " +number3);
        }
    }
}
