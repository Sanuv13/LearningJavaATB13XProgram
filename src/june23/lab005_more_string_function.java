package june23;

public class lab005_more_string_function {
    public static void main(String[] args) {
        String name = "Sanu Sachan";
        System.out.println(name.length());
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(10));
        //concatenation
        System.out.println(name.concat("vaijyanti"));
        //contains
        System.out.println(name.contains("Sa"));
        //equals
        System.out.println(name.equals("SANU"));
        //equal ignore case
        System.out.println(name.equalsIgnoreCase("SANU"));
        //indexOf() //  sonal -> ? o
        System.out.println(name.indexOf('n'));

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));

        System.out.println(s1.lastIndexOf("m"));
        // 8. replace( , ) // sonal
        System.out.println(name.replace('n', 'N'));
        String name4 = "pramod@live.com@123";
        String[] split_name4 = name4.split("@");
        System.out.println(split_name4[0]);
        System.out.println(split_name4[1]);
        System.out.println(split_name4[2]);
        // 10. substring( , )
        System.out.println(name.substring(1, 6));

        // 14. startsWith()
        System.out.println(name.startsWith("S"));

        // 15. endsWith()
        System.out.println(name.endsWith("a"));

    }
}
