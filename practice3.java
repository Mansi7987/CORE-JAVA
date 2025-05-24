//import java.util.Arrays;
//import java.util.Collections;

public class practice3 {
    public static void main(String[] args) {
       //  Integer[] numbers = {2,4,5,67,198,122};
        
   /*      Arrays.sort(numbers);
        System.out.println("Ascending order : " + Arrays.toString(numbers));

        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending order : " + Arrays.toString(numbers));


        int [] nexa = {2, 4, 5, 67, 198, 122};
        int max = Arrays.stream(nexa).max().orElseThrow();

        
        System.out.println("Maximum value: " + max);

        int min = Arrays.stream(nexa).min().orElseThrow();
        System.out.println("Minimum value: " + min);   */



        int[] numbers = {2, 4, 5, 67, 198, 122};

        int max = numbers[0];
        int min = numbers[0];

        for(int number : numbers) {
            if(number > max) {
                max = number;
            }
            if(number < min) {
                min = number;
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
