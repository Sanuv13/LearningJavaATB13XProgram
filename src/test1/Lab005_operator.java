package test1;

public class Lab005_operator {
    //Create a program to demonstrate all types of operators.
    public static void main(String[] args) {
        int a =20;
        int b=30;
        // Arithmetic Operators
        //        + (Addition)
        //       - (Subtraction)
        //       * (Multiplication)
        //       / (Division)
        //       % (Modulus) | Modulus - Remainder
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        // Unary Operator
        int c = +10;
//        int c = 10; optional
        int c1 = -110;
        int result = c+c1;
        System.out.println(c);
        System.out.println(c1);
        System.out.println(result);


        int d = -1;
        int e = d+1;
        System.out.println(e);

        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        // All of them will result boolean output.


        boolean c2 = a > b; // 10 >30
        System.out.println(c2);

        int age_mamitha = 33;
        int age_pramod = 34;
        boolean total_age = age_pramod >= age_mamitha;
        System.out.println(total_age);
    }
}
