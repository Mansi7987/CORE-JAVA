// BIT MANIPULATION : the process of applying operations directly on individual bits (0s and 1s) of binary numbers.

// MAJOR OPERATION INTO IT : a) GET -->> to know if the bit is (0) or (1).
// b) SET -->> if wanna make bit 1. ( like to convert bit into only one).
// c) CLEAR -->> if wanna make bit 0. (like to convert into zero only).
// d) UPDATE -->> if wanna convert (0 into 1) or (1 into 0).

/* COMMON BITWISE OPERATOR :
1. AND (&) : Both bits should be 1 for result to be 1.
2. OR (|) : At least one bit should be 1 for result to be 1.
3. XOR (^) : If both bits are same, result is 0, else 1.
4. NOT (~) : Inverts bits, 0 becomes 1 and 1 becomes 0.
5. SHIFT LEFT (<<) : Move bits to left by specified number of places.
6. SHIFT RIGHT (>>) : Move bits to right by specified number of places.
7. ROTATE LEFT (<<) : Rotate bits to left by specified number of places.
8. ROTATE RIGHT (>>) : Rotate bits to right by specified number of places.
9. NAND (&&) : Both bits should be 0 for result to be 1.
10. NOR (||) : At least one bit should be 0 
 */

 /*public class mansi7{
    public static void main(String[] args) {
        int n = 5; //0101

 //  *******GET BIT. *******
 // Q) GET the third bit (Position = 2) of a number n. (n = 0101)
 // BIT MASK : 1<<i
 // OPERATION : AND

     /*   int n = 5; //0101
        int pos = 3 /*2 // ;
        int bitMask = 1<<pos;

        if((bitMask & n) == 0) {
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit was one");
        }
    } */

    // *******SET BIT *******
// Q) Set the 2nd bit (position = 1) of a number n. (n = 0101)
// (i) BIT MASK : 1<<i
// (ii) OPERATION : OR

  /*  int n = 5;
    int pos = 4;
    int bitMask = 1<<pos;

    int newNumber = bitMask | n;
    System.out.println(newNumber); */

// *******CLEAR BIT *******
// Q) Clear the 3rd bit (Positon = 2) of a number n. (n = 0101)
// BITMASK = 1<<i
// OPERATION = AND with NOT.

/*  int n = 5; //0101
  int pos = 2;
  int bitMask = 1<<pos;
  int notBitMask = ~(bitMask);

  int newNumber = notBitMask & n;
  System.out.println(newNumber);
  */

// ******* UPDATE BIT *******
// Q) Update the 2nd bit (Position = 1) of a number n to 1. (n = 0101)
// ***FOR 0 *** (BITMASK = 1<<i) and (OPERATION : AND with NOT).

//  ***FOR 1 *** (BITMASK = 1<<i) and (OPERATION : OR).
import java.util.*;
public class mansi7{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int oper = sc.nextInt();   //oper is an operator here.
        int n = 5; //0101
        int pos = 1;
        int bitMask = 1<<pos;

        if(oper ==1)
        // SET
        {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else 
        // CLEAR
        {
            int newBitMask = ~(bitMask);
            int newNumber =  newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
