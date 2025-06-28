package June25;


import java.util.Arrays;

public class lab003_sorting_of_array {
    public static void main(String[] args) {
        int [] marks={80,30,79,90,100,50,32};

        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);

        }
        Arrays.sort(marks);
        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);

        }

    }
}
