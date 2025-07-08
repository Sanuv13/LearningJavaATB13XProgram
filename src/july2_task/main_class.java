package july2_task;

public class main_class {
    public static void main(String[] args) {
        bike b=new bike();
        b.Vehicle();

    }
}

 class Vehicle{
    void Vehicle(){
        System.out.println("Vihicle is ready");
    }
}
class bike extends Vehicle{
    void Vehicle(){
        System.out.println("bike is ready");
    }
}