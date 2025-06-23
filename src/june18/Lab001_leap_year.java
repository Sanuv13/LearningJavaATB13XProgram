package june18;
import java.util.Scanner;
public class Lab001_leap_year {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Kindly enter a year");

        if(!scan.hasNextInt()){
            System.out.println("Enter valid details");
            return;
        }
        int year =scan.nextInt();
        if((year%4==0 && year%100 !=0 )|| (year%400==0)){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("Given year is not a leap year");
        }
    }
}
