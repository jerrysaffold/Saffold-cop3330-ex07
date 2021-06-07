package base.ex07;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

/*
Exercise 7 - Area of a Rectangular Room
When working in a global environment, you’ll have to present information in both metric and Imperial units.
And you’ll need to know when to do the conversion to ensure the most accurate results.

Create a program that calculates the area of a room. Prompt the user for the length and width of the room in feet.
Then display the area in both square feet and square meters.

Example Output
What is the length of the room in feet? 15
What is the width of the room in feet? 20
You entered dimensions of 15 feet by 20 feet.
The area is
300 square feet
27.871 square meters
The formula for this conversion is m2 = f2 × 0.09290304

Constraints
Keep the calculations separate from the output.
Use a constant to hold the conversion factor.
 */
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        String length_room_string = input.nextLine();
        System.out.print("What is the width of the room in feet? ");
        String width_room_string = input.nextLine();

        final double conversion = 0.09290304;
        int length = Integer.parseInt(length_room_string);
        int width = Integer.parseInt(width_room_string);
        int square_feet = length * width;
        double square_meters = square_feet * conversion;

        System.out.printf("You entered dimensions of %d feet by %d feet.\n", length, width);
        System.out.printf("%d square feet\n%.3f square meters", square_feet, square_meters);
    }



}
