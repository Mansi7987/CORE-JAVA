import java.util.Arrays;
import java.util.Scanner;

class Leet2 {
    public static int SecondLargest(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr); 
        
        for(int i = n-2; i >=0; i--) {
            if(arr[i] != arr[n-1]) {
                return arr[i];
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(SecondLargest(arr));
    }
}