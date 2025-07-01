package Tasks;
import java.util.Scanner;
public class test004_vowel_consonant {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the character");
        char ch  = scan.next().charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("its a vowel");

            }
            else {
                System.out.println("its a consonant");
            }
        }

    }

