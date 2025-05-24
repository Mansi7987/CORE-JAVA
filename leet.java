/* public class leet {
    public static void main(String[] args) {
        for (int i=0; i<4; i++) {
            for( int j=0; j<4; j++) {
            System.out.print("*");
        }
        System.out.println();
        }
    }
} */


import java.util.Scanner;

public class leet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of triangle : ");

        Double base = scanner.nextDouble();

        Double height = scanner.nextDouble();

        Double area = 0.5 * base * height;

        System.out.println("Area of triangle is : " + area);

        scanner.close();
    }

}