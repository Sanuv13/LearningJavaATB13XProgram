package June13;
import java.util.Scanner;

public class lab002_scanner {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("inter the age");
        int age= scanner.nextInt();
        String CanIVote= age >= 18 ? "you can vote" : "you are not eligble";
        System.out.println(CanIVote);
    }
}
