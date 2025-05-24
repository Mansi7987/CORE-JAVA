// RECURSION IN JAVA (W3Schools) :

// TO ADD ALL OF THE NUMBERS UPTO 10.

 /* public class mansi9 {
    public static void main(String[] args) {
        int exam = sum(10);
        System.out.println(exam);
    }
    public static int sum (int k) {
        if (k>0) {
            return k + sum(k-1);
        } else {
            return 0;
        }
    }
} */


public class mansi9{
    public static void main(String[] args) {
        int exam = sum(5,10);
        System.out.println(exam);
}
public static int sum(int start, int end) {
    if (end>start) {
        return end + sum(start, end-1);
        } else {
            return end;
    
    }
}
}