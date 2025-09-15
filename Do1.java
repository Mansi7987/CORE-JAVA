public class Do1 {
    int arr[] = null;

    public Do1(int sizeofArray) {
      arr = new int [sizeofArray];
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }
    public void insert(int location, int valueToBeInserted) {
        try {
        if (arr [location] == Integer.MIN_VALUE) {
            arr[location] = valueToBeInserted;
            System.out.println("Successfully inserted");
        } else {
            System.out.println("This cell already occupied");
        }
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Invalid Index");
    }
}


 public static void main(String[] args) {
            Do1 sda = new Do1(10);
            sda.insert(0,0);
            sda.insert(1,10);
            sda.insert(2,20);
            sda.insert(1,10);
        }
}
