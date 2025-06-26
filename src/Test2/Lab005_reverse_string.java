package Test2;
import java.util.Scanner;
public class Lab005_reverse_string {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a string");

        String string=scan.nextLine();
        String reverse ="";
        for (int i=string.length()-1;i>=0;i--){
            reverse = reverse+string.charAt(i);

        }
        System.out.println(reverse);
        StringBuilder name=new StringBuilder("Sanu");
        name.reverse();
        System.out.println(name);
    }
}
