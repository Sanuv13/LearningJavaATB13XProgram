package july_08_all_about_static;

public class lab001_static_block {
    public static void main(String[] args) {
        block b=new block();
    }

}



class block {
    static {
        System.out.println("this is static code");
    }
}