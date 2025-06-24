package june23;
import java.util.Scanner;
public class lab006_palindrom {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 =scan.next();
        String reverse = "";
        for(int i=s1.length()-1;i>=0;i--) {
            reverse = reverse + s1.charAt(i);
        }
            if(s1.equals(reverse)){
                System.out.println("its a palindrome string");
            }
            else{
                System.out.println("its not a palindrome string");
            }
        }

    }

