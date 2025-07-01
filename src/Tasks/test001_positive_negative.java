package Tasks;
import java.util.Scanner;

public class test001_positive_negative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number =scan.nextInt();
        if(number>0){
            System.out.println("Its a positive number");
        }
        else if (number<0){
            System.out.println("Its a negative number");
        }


    }
}
