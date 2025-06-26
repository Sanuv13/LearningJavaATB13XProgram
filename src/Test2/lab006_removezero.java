package Test2;

public class lab006_removezero {
    public static void main(String[] args) {
String data = "0057758300";

String replace = data.replaceFirst("^0+","");
        System.out.println(replace);
    }
}
