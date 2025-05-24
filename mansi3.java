public class mansi3 {
//JAVA METHOD
// TO CREATE METHOD.

// SOME PREDEFINE METHODS: System.out.println();
 // public class mansi3 {
  //      static void myMethod() {
    //        System.out.println("OUTPUT : " + " " + "This is my first method! ");
      //  }

        //public static void main(String[] args) {
            // A method could be called multiple times.
          //  myMethod();
            //myMethod();
            //myMethod();
        //}
//}

// TAKES STRING AS PARAMETER.
// public class mansi3 {
   // static void myMethod(String fname) {
        // static void myMethod(String fname, int age) {
        //    System.out.println("fname " + "is" + age");   ------------>>> WE CAN HAVE AS MANY PARAMETERS AS WE LIKE.
        //  }
  //      System.out.println(fname + "Singh");
   // }

   // public static void main(String[] args) {
     //   myMethod("Mansi" + " ");
       // myMethod("Rohit" + " ");
    //  myMethod("Payal", 19); --------->>>As many parameters we want.
     // 0 }

    // A METHOD WITH IF ELSE.

//public class mansi3 {

    // Create a checkAge() method with an integer variable called age
  //  static void checkAge(int age) {
  
      // If age is less than 18, print "access denied"
    //  if (age < 18) {
      //  System.out.println("Access denied - You are not old enough!");
  
      // If age is greater than, or equal to, 18, print "access granted"
     // } else {
       // System.out.println("Access granted - You are old enough!");
      // }
  
    //}
  
   // public static void main(String[] args) {
     // checkAge(10); // Call the checkAge method and pass along an age of 20
     //}
  //}
 // }

// RETURN VALUES : if you want the method to return a value, 
//      can use primitive data type (int, char, etc.) and use return keyword inside method.

// public class mansi3{
  //  static int myMethod(int x) {
    //    return 5 + x;
   // }

  //  public static void main(String[] args) {
    //    System.out.println(myMethod(8));
   // }
// }


// METHOD OVERLOADING.
static int plusMethodInt(int x, int y) {
    return x + y;
} 

static double plusMethodDouble(double x, double y) {
    return x + y;
}
public static void main(String[] args) {
    int myNum1 = plusMethodInt(8, 5);
    double myNum2 = plusMethodDouble(8.5, 5.28);
    System.out.println("int: "  + myNum1 );
    System.out.println("double: " + myNum2 );
}
}