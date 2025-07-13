package July_9_Exceptional_handling;
import java.util.Scanner;
public class Lab002_multi_exception {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("inter the number");
        int a = scan.nextInt();
        int[] b = {1, 2, 3};
        try {

            int c = 100 / a;
            System.out.println(b[3]);
        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("continue");
    }
}