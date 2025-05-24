// TO GET THE AVERAGE OF AGES & LOWEST AGE
public class exercise9 {
    public static void main(String[] args) {
        //An Array stroing different ages
        int ages[] = {20, 21, 22, 18, 48, 26};

        float avg, sum = 0;

        //Get the length of the array
        int length = ages.length;

        //Create a lowest age variable
        int lowestAge = ages[0];

        /*Loop through the elements of the array
        for(int age : ages) {
            sum += age; //Calculate the sum of all ages

        }
        //Calculate the average by dividing the sum by the length
        avg = sum / length; */

        for(int age : ages) {
            if (lowestAge > age) {
                lowestAge = age;
            }
        }

        /*Print the average
        System.out.println("The average age is: " + avg); */

        System.out.println("The lowest age is: " +lowestAge);
    }
}
