package test1;

public class lab004_typecasting {
    //Write a program to demonstrate type casting (both implicit and explicit).
    public static void main(String[] args) {
        int a=10;
        int b=a;//  Widening -> Implicit Casting

        byte b1 = 10;
        int a2 = (int)b1; // Widening -> Explicit Casting

        int val  = 300;
//        byte b = val; // Narrowing (int -> byte) - Implicit Casting is not allowed.
        byte b2 = (byte)val; // Narrowing (int -> byte) - Explicit Casting is not allowed.
        // Data Loss.
        System.out.println(b2);
    }
}
