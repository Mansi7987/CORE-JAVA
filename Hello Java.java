// Program that takes three no. from users and print greatest number. //

import java.util.*;
public class akshat{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Input 1st no. : ");
        int num1 = in.nextInt();

        System.out.println("Input 2nd no. : ");
        int num2 = in.nextInt();

        System.out.println("Input 3rd no. : ");
        int num3 = in.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The greatest number is : " + num1); 
        }
            else if (num2 >= num1 && num2 >= num3) {
                System.out.println("The greatest number is : " + num2);
            }
                else {
                    System.out.println("The greatest number is : " + num3);
                }
    }
}