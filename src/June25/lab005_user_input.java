package June25;
import java.util.Scanner;
public class lab005_user_input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide size of the array");
        int size= scan.nextInt();

        int []marks=new int[size];
        for (int i=0;i<marks.length;i++) {
            System.out.println("enter marks");
            marks[i] = scan.nextInt();
        }
            for(int i=0;i<marks.length;i++){
                System.out.println(marks[i]);
            }

        }
    }

