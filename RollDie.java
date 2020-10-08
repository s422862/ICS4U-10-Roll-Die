/*
* Roll Die is a program that asks the user to input the max value of a random number
* then the program calculates it and displays it by using a procedure
* @author  John Junior OmagrL
* @version 1.0
* @since 2020-09-2.
*/

import java.util.Random;
import java.util.Scanner;

public class RollDie {
 
  // procedure that calculates the random number and displays it
  public static void rollDice(int maxValue) {
     
    // declare local variables and constants
    Random random = new Random();
   
    // creates the random number
    int randomNum = random.nextInt(maxValue - 1 + 1) + 1;
   
    // Displays the random number
    System.out.println("The random number you got with a max of " + maxValue + " is " + randomNum);
  }
   
  public static void main(String[] args) {
   
    // asks the user the max number of their random number
    System.out.println("Please enter the max value of your random number");
   
    //Read the input from the console
    Scanner scan = new Scanner(System.in);
   
    // creates the variable thats passed by the function
    int maxValueMain = scan.nextInt();
   
    // calls the function
    rollDice(maxValueMain);
  }
}