//STRING DECLARATION, CONCATENATION, ARRAY LENGTH
// Strings are immutable
public class mansi1{
   public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
      //  String name = sc.nextLine();
        //System.out.println("Your name is : " + name);
    //
    
    //CONCATENATION : It means too add two strings.
   // String firstName = "Mansi";
    //String lastName = "Sengar";
    //String fullName = firstName + " " + lastName;
    //System.out.println(fullName);

    //ARRAY LENGTH : To define no. of element.
    //String firstName = "Mansi";
    //String lastName = "Sengar";
    //String fullName = firstName + " " + lastName;
    //Mansi Sengar
    // System.out.println(fullName.length());


    //charAt : To print our output one by one.
   // for(int i=0; i<fullName.length(); i++) {
   //     System.out.println(fullName.charAt(i));
    //}

    // .compareTo() : Used to compare twwo strings.
   // String name1 = "Mansi";
    // String name2 = "Sengar";
    // String name2 = "Mansi";
    // String name2 = "mansi";

   // if(name1.compareTo(name2) == 0) {
     //   System.out.println("Strings are equal");
   // } else {
     //   System.out.println("Strings are not equal");
    // }

// To add new string in between the code. ----->>>> This will add new string in between the code withput disturbing it.
   //if(new String("Tony") == new String("Tony")) {
   //     System.out.println("Strings are equal");
   // } else {
  // System.out.println("Strings are not equal");
  //}    

  //Substring : To print any part of the input as an output.
  String sentence = "My name is mansi sengar ";
  String name = sentence.substring(17, sentence.length());

  System.out.println(name);

}
}