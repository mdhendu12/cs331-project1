/*

Problem Statement: PP 14 Write a program that computes and prints the mean and standard deviation of a list of integers 
x1 through xn. Assume that there will be no more than 50 input values. Compute both the mean and the 
standard deviation as floating point values.

*/
       
package cs331.project1;

import java.util.Scanner;

/**
 *
 * @author Matthew
 */
public class Cs331Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare variables
        double mean, sd;
        int numOfInts;
        boolean runAgain = true;
        
        Scanner inputDevice = new Scanner(System.in);
        
        //Ask user how many integers are in the list
        System.out.println("This program will take a list of integers, then "
                + "compute the mean and standard deviation for that list.");
        System.out.println("How many integers are in your list?");
        numOfInts = inputDevice.nextInt();
        
        //Prompt user for list of integers using a while loop
        
    }
    
}
