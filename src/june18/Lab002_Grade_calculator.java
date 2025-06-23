package june18;
import java.util.Scanner;

public class Lab002_Grade_calculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks=scan.nextInt();

        if(marks >=90 && marks <=100) {
            System.out.println("You passed with grade A");
        }
        else if(marks>=80 && marks<=89){
                    System.out.println("You passed with grade B");

                }
                else if(marks>=70 && marks<=79){
                    System.out.println("You passed with grade C");

                }
                else if(marks>=60 && marks<=69){
                    System.out.println("You passed with grade D");

                }
                else if(marks>=0 && marks<=59){
                    System.out.println("You are failed with grade F");

                }
    }
        }



