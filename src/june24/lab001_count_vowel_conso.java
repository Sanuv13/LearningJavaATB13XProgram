package june24;
import java.util.Scanner;
public class lab001_count_vowel_conso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string");
        String name=scan.next();
        int vowels=0;
        int consonants=0;
        for (int i =0; i<name.length();i++){
            char ch =name.charAt(i);
            if (ch== 'a' || ch== 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;

            }
            else {
                consonants++;
            }

            }
        System.out.println("number of vowels are"+vowels);
        System.out.println("number of consonants are"+consonants);
        }

    }

