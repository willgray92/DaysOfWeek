/* Will Gray 3/9/2020 Programming project 6
 *Create an application that contains an enumeration that represents the days of the week. 
Display a list of the days, and then prompt the user for a day. Display business hours for the chosen day.
Assume that the business is open from 11 to 5 on Sunday, 9 to 9 on weekdays, and 10 to 6 on Saturday. 
Save the file as DayOfWeek.java.
 */
package dayofweek;
import java.util.Scanner;

/**
 *
 * @author will
 */
public class DayOfWeek {

     enum DaysOfWeek {MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY};
    
     //enums that represent days of the week
     
     public static void main(String[] args)       
    {
        System.out.println("Days of the Week:");
        //Displays a list of all the days of the week
        for(DaysOfWeek d:DaysOfWeek.values())
        {
            System.out.println(d);
        }
        
        System.out.println("----------------------------");
        
       //accept input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day of the week: ");
        String day = input.next();
        //check that user puts in a day regardless of capitalization
        if((day.equalsIgnoreCase("MONDAY")) || (day.equalsIgnoreCase("TUESDAY")) || (day.equalsIgnoreCase("WEDNESDAY")) || (day.equalsIgnoreCase("THURSDAY"))|| (day.equalsIgnoreCase("FRIDAY")))
        {
            System.out.println("The business hours are from 9 AM to 9 PM.");
            
        }
        else if (day.equalsIgnoreCase("SATURDAY"))
        {
            System.out.println("The business hours are 10 AM to 6 PM. ");
        }
           
        else if(day.equalsIgnoreCase("SUNDAY"))
        {
            System.out.println("The business hours are from 11 AM to 5 PM.");
        
        }
        // error message if a day was not entered correctly
        else
        {
            System.out.println("No valid day was entered.");
        }
       
    }
    
}
