package july_08_all_about_static;

public class lab002_static_variable {
    public static void main(String[] args) {
        example a=new example();
        example b=new example();
    }
}

class example{
    static int count=0;

    example(){
        count++;
        System.out.println("count is "+ count);

    }
}
