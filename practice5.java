// METHODS IN JAVA ARRAY CLASSES.
import java .util.Arrays;

class practice5{

public static void main(String[] args) {
    //   int[] numbers = {12, 4, 8, 15, 10};
    // System.out.println("Integer are : " + Arrays.asList(numbers));


    // int [] intArr = { 10, 23, 45, 22};
    //  Arrays.sort(intArr);
    //  int intKey = 22;
    // System.out.println("Integer are :" +  Arrays.toString(intArr));


   // int intArr[] = {21, 10, 15, 22, 35};

    // Arrays.sort(intArr);

 //   int intkey = 22;

   // System.out.println(intkey + " fount at index = " + Arrays.binarySearch(intArr, intkey));

   int intArr[][] = {{10, 20, 34, 56, 65}};
   
   int intArr1[][] = {{10, 20, 34, 56, 65}};

   System.out.println("Integer arrays are: " + Arrays.deepEquals(intArr, intArr1));

}
}