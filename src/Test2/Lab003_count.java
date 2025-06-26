package Test2;

public class Lab003_count {
    public static void main(String[] args) {
        String string = "Hello world welcome to java";

String [] word = string.split("\\s+");
        System.out.println(word.length);
    }
}
