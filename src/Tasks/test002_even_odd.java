package Tasks;
import java.util.Scanner;
public class test002_even_odd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number =scan.nextInt();

        if (number%2==0){
            System.out.println("its a even number");

        }
        else {
            System.out.println("it is a odd number");
        }
    }





}
