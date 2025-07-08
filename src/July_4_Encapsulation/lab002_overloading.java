package July_4_Encapsulation;

public class lab002_overloading {
    public static void main(String[] args) {
        calculator c=new calculator();

            System.out.println(c.add(10,10));


    }
}
class calculator{

   public int add(int a,int b){
       return a+b;

    }
    public int add(int b,int c,int d){
       return b+c+d;
    }
}