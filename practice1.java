// RECURSION IN JAVA (APNA COLLEGE) :
/*

// PRINT NUMBER 5 TO 1.
import java.util.*;
public class practice1{
    public static void main(String[] args) {
        int number = print(5);
    }
    public static int print(int number) {
        for(int i=number; i>0; i--) {
            System.out.println(i);
        
}
        return 0;
}
} */

// PRINT NUMBER 1 TO 5.
/*public class practice1{
    public static void main(String[] args) {
        int number = print(1);
    }
    public static int print(int number) {
        for(int i=number; i<=5; i++) {
            System.out.println(i);
        
}
        return number;
}
} */

// TO PRINT SUM OF n NATURAL NUMBERS.
/*import java.util.*;
public class practice1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = 0;

        for(int i=1; i<=n; i++) {
            sum += i;
        }
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    
}
} */

//PRINT FACTORIAL OF A NUMBER n : 

import java.util.*;

public class practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        long result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
        
        // Close the scanner
        scanner.close();
    }
    public static long factorial(int n) {
        if (n == 0 || n == 1) {  // Base case: factorial of 0 and 1 is 1
            return 1;
        } else {
            return n * factorial(n - 1);  // Recursive call
        }

    }
}
