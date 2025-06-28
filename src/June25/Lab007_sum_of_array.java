package June25;

public class Lab007_sum_of_array {
    public static void main(String[] args) {

        int[] array = {23, 4, 5, 6};
        int sum = 0;
        for (int i = 0; i <=array.length-1; i++) {
            sum = sum + array[i];
        }
            System.out.println(sum);
        }
    }
