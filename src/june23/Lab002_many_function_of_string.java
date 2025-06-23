package june23;

public class Lab002_many_function_of_string {
    public static void main(String[] args) {
        // String 2 ways
        String s1 = "Sanu Sachan"; // SCP
        String s2 = new String("Sanu Sachan"); // OA -> Object Area

        //concatenation of string
        String s3= "learning";
        String s4="java";
        String s5= s3.concat(s4);//Concat, basically add the value or merge the value in the end.
        System.out.println(s5);
        //few string functions
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.concat("E"));
    }
}
