public class SingleDimensionArray {
    int arr[] = null;

        public static void main(String[] args) {
            SingleDimensionArray sda = new SingleDimensionArray(10);
            sda.insert(0, 10);
            sda.insert(1,10);
            sda.insert(1, 30);
            sda.insert(12,120);
    }

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }
    
    public void insert(int location, int valueToBeInserted) {
        try {
            if(arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted");
            } 
            else {
                System.out.println("Cell already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }

    }
}