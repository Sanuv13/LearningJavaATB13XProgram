package June27;
import java.util.Scanner;
public class lab003_pyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of row ");
        int n = scan.nextInt();
        for (int i = 0; i <n; i++) {
            for (int j =0;j< n-i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
