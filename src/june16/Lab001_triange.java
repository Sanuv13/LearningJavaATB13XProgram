package june16;
import java.util.Scanner;
public class Lab001_triange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kindly inter side1");
        int side1 =scanner.nextInt();
        System.out.println("Kindly enter side2");
        int side2=scanner.nextInt();
        System.out.println("Kindly enter side3");
        int side3= scanner.nextInt();
        if(side1==side2&& side1==side3)

        System.out.println("the triangle is equilateral");
        else if (side1==side2 || side1==side3 || side2==side3)

        System.out.println("the triangle is isoscales");
        else
        System.out.println("the triangle is scalene");



    }
}
