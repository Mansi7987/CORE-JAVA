// mansi5.java deleted 'coz it didn't contain any information.

//MINI PROJECT

import java.util.*;

public class mansi6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);
        int userNumber = 0;

        do {
            System.out.println("Guess my number(1-100) : ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("Woohoo...CORRECT NUMBER!!!");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Too low, try higher.");
            } else {
                System.out.println("Too high, try lower.");
            }
        } while (userNumber >= 0);
        System.out.println("My number was : ");
    }
}
