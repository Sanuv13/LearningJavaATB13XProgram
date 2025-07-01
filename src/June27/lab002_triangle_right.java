package June27;
import java.util.Scanner;
public class lab002_triangle_right {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int number =scan.nextInt();

        for (int i=0;i<number;i++){
            for(int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
