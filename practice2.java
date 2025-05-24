// GFG PRACTICE SESSION.
// JAVA PROGRAM TO MULTIDIMENSIONAL ARRAY

// EXAMPLE 1 :
public class practice2 {
	public static void main(String args[]) {
	/* 	int[][]  book = new int[3][3];
		System.out.println("Number of Rows : " + book.length);

		System.out.println("Number of Columns : " + book[0].length); */

// EXAMPLE 2 :
	/* 	int book[][] = { {2, 7, 9}, {3,6,1}, {3,8,5} };

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) 
                    System.out.print(book[i][j]+" ");
                System.out.println();
		}  */


// CLASS OBJECT FOR ARRAY: 
/* 
		int intArray[] = new int[3];
        byte byteArray[] = new byte[3];
        short shortsArray[] = new short[3];

        // array of Strings
        String[] strArray = new String[3];

        System.out.println(intArray.getClass());
        System.out.println(
            intArray.getClass().getSuperclass());
        System.out.println(byteArray.getClass());
        System.out.println(shortsArray.getClass());
        System.out.println(strArray.getClass());
    } */


// ARRAY OF OBJECT IN JAVA :
   /*     int [] arr=new int[4];

       System.out.println("Array Size : " + arr.length);
       


		int[][] arr = new int[10][20];
		arr[8][15] = 70;

		System.out.println("arr[0][0] = " + arr[8][15]); */

        /* 
        int rows = 4;
        int columns = 4;
 
        int[][] array = new int[rows][columns];
 
        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = value;
                value++;
            }
        }

         System.out.println("The 2D array is : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
                System.out.println();
    } */


		int[][] arr = { { 1, 2 }, { 3, 4 } };

		System.out.println("arr[0][0] = " + arr[0][1]);
	}
}
