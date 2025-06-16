package June13;

public class Lab001_usrinput {
    public static void main(String[] args) {
        String age_string = args[0];

        int age= Integer.parseInt(age_string);
        String canIVote= age>18?"yes":"no";
        System.out.println(canIVote);

    }
}
