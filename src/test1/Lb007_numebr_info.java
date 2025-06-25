package test1;
import java.util.Scanner;
public class Lb007_numebr_info {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter a number");
        int number =scan.nextInt();
        if(number>0){
            System.out.println("Entered number is positive");
        }
        else if(number<0)
        {
            System.out.println("entered number is negative number");
        }
        else {
            System.out.println("Entered number is zero");
        }
    }
}
