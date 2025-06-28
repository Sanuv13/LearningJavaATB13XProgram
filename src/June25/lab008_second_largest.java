package June25;

public class lab008_second_largest {
    public static void main(String[] args) {


        int[] numbers = {56, 43, 23, 45, 78};
        int max = numbers[0];
        int secondmax = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != max && numbers[i] > secondmax) {
                numbers[i] = secondmax;
            }
        }
                        System.out.println(secondmax);





        }
    }


