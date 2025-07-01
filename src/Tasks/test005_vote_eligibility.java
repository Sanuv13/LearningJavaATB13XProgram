package Tasks;
import java.util.Scanner;
public class test005_vote_eligibility {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age");
        int age=scan.nextInt();
        System.out.println(age >=18 ? "Can vote" : "Can not vote");

    }

}
