//Array
//Find the maximum & minimum number in an array of integers. 

import java.util.*;
public class exercise7{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int numbers [] = new int [size];

    //input 

    for(int i = 0; i<size; i++) {
        numbers[i] = sc.nextInt();
    }
    //find max & min values.
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    //Output
    for(int i=0; i<numbers.length; i++) {
        if(numbers[i]>max)
            max = numbers[i];
        if(numbers[i]<min)
            min = numbers[i];
    }
    System.out.println("Maximum: " + max);
    System.out.println("Minimum: " + min);
}
}