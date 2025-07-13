package july_10_Generic;

public class lab002_generic_method {
    public static void main(String[] args) {
        demo d=new demo();
        d.value("Hello");
        d.value(123);
        d.value(1.45);
        d.value(true);
        //System.out.println(value(123));
    }
}


class demo{
    public<T> void value(T value){
        //return value;

        System.out.println(value);
    }
}