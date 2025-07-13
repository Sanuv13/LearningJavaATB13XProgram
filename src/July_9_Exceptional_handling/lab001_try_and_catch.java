package July_9_Exceptional_handling;
import java.util.Scanner;
public class lab001_try_and_catch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("inter the number");
        int a=scan.nextInt();
        try {
            int b=100/a;
            System.out.println(b);
        } catch (Exception e) {
            System.out.println("Exception cought");
        }
        System.out.println("program continue");
    }
}
