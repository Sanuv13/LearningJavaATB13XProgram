package July_7_extraction;

public class lab001_vehicla {
    public static void main(String[] args) {
        myvehicle mv=new myvehicle();
        mv.bus();
        mv.motercycle();
        mv.train();

    }
}

abstract class car{

    car(){
        System.out.println("my car is Honda city");
    }
    abstract void bus();

    void train(){
        System.out.println("train running on time");
    }


}
class myvehicle extends car{
    void motercycle(){
        System.out.println("bike riding is good");
    }
    void bus(){

    }
}
