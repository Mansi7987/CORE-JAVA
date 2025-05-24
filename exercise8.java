/* Take a matrix as input from the user. Search for a given number
 x and print the indices at which it occurs.*/

import java.util.*;

public class exercise8{
    public static void main(String[] args) {
        // Defining an 2D-ARRAY :
        //type[][] arrayName = newtype[rows][columns];

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        //input
        //Rows 
        for(int i=0; i<rows; i++){
            for(int j=0; i<cols; i++){
                numbers[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
}
}