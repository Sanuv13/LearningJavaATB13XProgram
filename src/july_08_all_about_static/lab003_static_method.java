package july_08_all_about_static;

public class lab003_static_method {
    public static void main(String[] args) {
        int result= math.multi(4,7);//no need to create object
        System.out.println(result);
    }
}

class math{
    static int multi(int a,int b){
        return a*b;
    }

}
