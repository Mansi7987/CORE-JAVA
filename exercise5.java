//PROGRAM TO CALCULATE SUM OF TWO NUMBERS.

import java.util.*;
public class exercise5{
    public static int calculateSum (int a , int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Ist number: ");
        int a = scanner.nextInt();
        System.out.print("Enter IInd number: ");
        int b = scanner.nextInt();

        int sum = calculateSum (a , b);
        System.out.println("The sum of two number is: " + sum);
    }
    }
