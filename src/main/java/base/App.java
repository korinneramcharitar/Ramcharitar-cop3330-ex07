package base;
//When working in a global environment, you’ll have to present information in both metric and Imperial units. And you’ll need to know when to do the conversion to ensure the most accurate results.
//
//Create a program that calculates the area of a room. Prompt the user for the length and width of the room in feet. Then display the area in both square feet and square meters.

//What is the length of the room in feet? 15
//What is the width of the room in feet? 20
//You entered dimensions of 15 feet by 20 feet.
//The area is
//300 square feet
//27.871 square meters

//Keep the calculations separate from the output.
//Use a constant to hold the conversion factor.

import java.text.DecimalFormat;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("What is the length of the room in feet?");
    String length = input.nextLine();
    System.out.println("what is the width of the room in feet?");
    String width = input.nextLine();
    System.out.println("You entered dimensions of " + length + "feet by " + width + " feet.");
        int a = Integer.parseInt(length);
        int b = Integer.parseInt(width);
        DecimalFormat formatter = new DecimalFormat("#0.000");
        double convert = 10.764;
        double num1 = ((a*b)/convert);
    System.out.println("The area is " + (a*b) + " square feet.");
    System.out.println(formatter.format(num1) +" square meters.");
    }
}
