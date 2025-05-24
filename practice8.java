
public class practice8{
    public static void main(String[] args) {
       int rows = 5;

       for(int i = 1; i<=rows; i++) {
        int start = i % 2;

        for(int j = 0; j<i; j++) {
            System.out.print(start + " ");
            start = 1 - start;
    }
    System.out.println();
}
}
}