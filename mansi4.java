// public class mansi4{
/*static int plusMethod(int x, int y) {
    return x + y;
}

static double plusMethod(double x, double y) {
    return x + y;
}

public static void main(String[] args) {
    int myNum1 = plusMethod(4, 5);
    double myNum2 = plusMethod(4.5, 5.2);

    System.out.println("int: " + myNum1);
    System.out.println("double : " + myNum2);
}*/


// }


// JAVA SCOPE.

// -->> SCOPE : variables are only accesible inside the region they are created.

// METHOD SCOPE : Variables declared inside method are available anywhere in the method.

/*public class mansi4{
    public static void main(String[] args) {
        int x = 100; // x cant be used here.

        System.out.println(x);  
      }
} */


// BLOCK SCOPE : All of  the code between the curly braces. Variables
//         inside braces are only accessible.

public class mansi4{
    public static void main(String[] args) {
        {
        int x = 100;
        System.out.println(x);
    }
}

}