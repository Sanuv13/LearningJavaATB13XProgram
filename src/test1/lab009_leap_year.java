package test1;
import java.util.Scanner;
public class lab009_leap_year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year");

        if(!scanner.hasNextInt()){
            System.out.println("Please enter correct data");
            return;
        }
        int year=scanner.nextInt();
        if ((year%4==0 && year%100 !=0 )|| (year%400==0)){
            System.out.println("its a leap year");


        }
        else{
            System.out.println("its not a leap year");
        }
    }
}
