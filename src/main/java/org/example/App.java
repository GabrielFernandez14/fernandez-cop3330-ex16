/* Gabriel Fernandez
 * COP3330 - Summer CV01
 * "Motivated" Practice Exercises
 * Exercise 16 - Legal Driving Age
 */

package org.example;
import java.util.Scanner;

public class App 
{

    // Main function
    public static void main( String[] args )
    {
        // Set minimum driver's age to 16
        final int DRIVERS_AGE = 16;

        // Prompt user to input their age
        System.out.println("What is your age?");
        Scanner ageIn = new Scanner(System.in);
        int age = ageIn.nextInt();

        // Ternary operator which functions as an if statement
        // and updates msg as to whether the age is greater than
        // or equal to the minimum driver's age
        final String msg = age >= DRIVERS_AGE
                ? "You are old enough to legally drive."
                : "You are not old enough to legally drive.";

        // Print out the message
        System.out.println(msg);
    }
}