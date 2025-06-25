package test1;
public class Lab006_number_prime {
    //Write a program to find prime numbers between 1 to 100 using loops.
    public static void main(String[] args) {

        for (int i=2;i<=100;i++){
            if(i/1==0 && i/i==0){
                System.out.println("It is a prime number" +i);
            }
            else{
                System.out.println("Its not a prime number" +i);
            }

        }

    }
}
