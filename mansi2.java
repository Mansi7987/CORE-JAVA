// STRING BUILDER.

public class mansi2{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
         /*System.out.println(sb);

         //char at index 0 
         System.out.println(sb.charAt(0));

         //set char at index 0 
         sb.setCharAt(0, 'P');
         System.out.println(sb);

         
         //to insert anything into the string
         sb.insert(0, 'S');
         System.out.println(sb);

         //delete the extra 'n' : to delete any letter or word from string.
         sb.delete(2, 3);
         System.out.println(sb); */

         //To append : same string k end m chije jodna.
      //   StringBuilder sb = new StringBuilder("h");
       //  sb.append("e");  //str = str + " e" ;
        // sb.append("l");  //str = str + " l" ;
        // sb.append("l");
        // sb.append("o");
        // System.out.println(sb);

         // To reverse string.
        for(int i=0; i<sb.length()/2; i++) {
        int front = i;
        int back =  sb.length() - 1 - i;

        char frontChar = sb.charAt(front);
        char backChar = sb.charAt(back);

        sb.setCharAt(front, backChar);
        sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);
      }
}