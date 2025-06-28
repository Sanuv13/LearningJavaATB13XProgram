package June25;

import java.util.Arrays;

public class Lab004_max_min_find {
    public static void main(String[] args) {
        int[] array = {37, 68, 96, 84, 8, 34, 12, 88, 96};
        // Arrays.sort(array);
        //System.out.println(array[array.length-1]);
        int maximum_value = maximum_array(array);
        int minimum_value = minimum_array(array);
        System.out.println(maximum_value);
        System.out.println(minimum_value);
    }

    static int maximum_array(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        return max;
    }
    static int minimum_array(int[] array){
        int min=array[0];
        for (int j=0;j<array.length;j++){
            if (min>array[j]){
                min=array[j];
            }

        }
        return min;
    }
}

