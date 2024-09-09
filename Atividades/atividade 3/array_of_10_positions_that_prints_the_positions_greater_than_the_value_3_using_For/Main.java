package array_of_10_positions_that_prints_the_positions_greater_than_the_value_3_using_For;

public class Main {
    public static void main(String[] args){
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;

            if(array[i] > 3){
                System.out.println(array[i]);
            }
        }
    }
}
