//JAVA SORTING
// SORTING : to arrange elements of a collection in specific order.

// BUBBLE SORT : compare adjacent elements and swap them (if in wrong order).
// time complexity : 0(n^2).

/*import java.util.*;

  class Sorting {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] arg) {
         int arr[] = {7,8,1,3,2};

         //bubble sort
         for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                     //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
         }
    }
    printArray(arr);
}
} */


// SELECTION SORT : select the smallest element from unsorted part and put it in ascending order.
// time complexity : 0(n^2)

/*public class mansi8{
    public static void main(String[] args) {
    
    int arr[] = {3,12,32,13,23};

    //selection sort
    for(int i=0; i<arr.length-1; i++) {
        int smallest = i;
        int j;
        for(j=i+1; j<arr.length; j++) {
            if(arr[smallest] > arr[j]) {
                smallest = j;
            }
    }
    int temp = arr[smallest];
    arr[smallest] = arr[i];
    arr[i] = temp;
}

         printArray(arr);

     }
     public static void printArray(int[] arr) {
         for(int i=0; i<arr.length; i++) {
             System.out.print(arr[i]+" ");
         }
         System.out.println();
     }
} */

//INSERTION SORT : each element from the unsorted portion of the array and inserting it into the correct position in the sorted portion.

//time complexity : 0(n^2)

public class mansi8{
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}

    public static void main(String[] args) {
        int arr[] = {7,8,4,1,3,6,2};
        
        //insertion sort
        for(int i=1; i<arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > temp) {
                //leep swapping
                arr[j+1] = arr[j];
                j--;
        }
        arr[j+1] = temp;
    }
    printArray(arr);
}
}