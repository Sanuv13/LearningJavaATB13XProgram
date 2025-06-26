package Test2;

public class lab001_remove_white_space {
    public static void main(String[] args) {
        String name="S anu S a chan";

        String result = name.replaceAll("\\s+","");
        System.out.println(result);
    }
}
