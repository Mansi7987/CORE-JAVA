/*Program for taken away number from the user and to generate 
int b/w 1 and 7 and it helps to display weekend name. */

import java.util.*;
public class exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        System.out.print(getdayname(day));
    }

    public static String getdayname(int day) {
        String dayname =  "";
        switch (day) {
            case 1:
                dayname = "Sunday";
                break;
            case 2:
                dayname = "Monday";
                break;
            case 3:
                dayname = "Tuesday";
                break;
            case 4:
                dayname = "Wednesday";
                break;
            case 5:
                dayname = "Thursday";
                break;
            case 6:
                dayname = "Friday";
                break;
            case 7:
                dayname = "Saturday";
                break;
            default:
                dayname = "Invalid Day Number";
                break;
        }
        return dayname;
    }
    }
