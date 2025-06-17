package june17;

public class Lab004_continue {
    public static void main(String[] args) {
        int a;
        for (a=0;a<80;a++){
            if(a==30){
                continue;

            }
            else{
                System.out.println(a);
            }
        }
    }
}
