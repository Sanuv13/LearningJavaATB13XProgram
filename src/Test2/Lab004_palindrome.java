package Test2;
import java.util.Scanner;
public class Lab004_palindrome {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a String");

            String string=scanner.nextLine();
            String correctdata = string.replaceAll("[^a-zA-Z]","").toLowerCase();
            String reverse ="";
            for(int i=correctdata.length()-1;i>=0;i--) {
                reverse = reverse + correctdata.charAt(i);
            }

                if(correctdata.equals(reverse)) {
                    System.out.println("true");
                }
                    else
                    {
                        System.out.println("False");
                    }
                }



            }




