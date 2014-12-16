/*
 * Course: TCSS142 – Introduction to Object-Oriented Programming Summer 2014
 * File Name: Assign4.java
 * Assignment: 7
 * Due Date: August 18, 2014
 * Instructor: Mr. Schuessler
 */ 
import java.io.*;
import java.util.Scanner;
/**
  * Reads information about clients (id,weight, and name) - stores it in parallel array 
  * perform updates on selected clients' weights displays current data on console while doing so
  * finishes by writing data and stats to output file
  *
  * @author Ian Skyles
  * @version 2014 August 18
  */
public class Assign7 {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in); // For keyboard input
    Scanner input = null;                     // For file input
    PrintStream output = null;                // For file output
    String[] clientNames = null;              
    double[] clientWeights = null;
    boolean filesOK = false;
    try {
      input = new Scanner(new File("Clients.txt"));
      output = new PrintStream(new File("ClientOut.txt"));
      filesOK = true;
    }
    catch (FileNotFoundException e) {
      System.out.println(e);
    }
    if (filesOK) {
      // Create the correct number of elements in the clientNames array
      // Note the input.nextInt() used to acquire the size of the array.
      clientNames = new String[input.nextInt()];
			  
      // Create the correct number of elements in the clientWeights array
      clientWeights = new double[clientNames.length];
			
      readClientData(input, clientNames, clientWeights);
      input.close();
      updateWeights(console, clientNames, clientWeights);
      outputStatistics(output, clientNames, clientWeights);
      output.close();
    }
  }
// Below are methods i have coded
        /**
          * This method reads from the input file starting on the second line, the clients'
          * ID, their weight, and their name. The ID is used as an index into the names and
          * weights arrays.
          *
          * @param in Scanner to the file being read.
          * @param names is an array to hold each client's name.
          * @param weights is an array to hold each client's weight.
          */
        public static void readClientData(Scanner in, String[] names, double[] weights) {
                int clientId = 0;
                for(int i = 0; i < names.length; i++){
                        clientId = in.nextInt();
                        weights[clientId] = in.nextDouble();
                        names[clientId] = in.nextLine();                        
                }
        }
        /**
          * This method allows the user to change the current weights of each client.
          *
          * @param console used for keyboard input
          * @param names is an array to hold each client's name.
          * @param weights is an array to hold each client's weight.
          */
        public static void updateWeights(Scanner console, String[] names, double[] weights) {
                int clientID = 0;
                double updatedWeight = 0.0;
                do {                
                         System.out.println("ID      NAME    WEIGHT");
                         for(int i = 0; i < weights.length; i++) {
                         System.out.println(i + ".   " + names[i] + "        " + weights[i]);
                         }
                         System.out.println("To change a client weight, type the ID (-1 to terminate): ");
                         clientID = console.nextInt();
                         if (clientID != -1) {
                                System.out.print("Enter a new weight for: " + names[clientID]);
                                updatedWeight = console.nextDouble();
                                weights[clientID] = updatedWeight;
                         } 
                }while(clientID!= -1);                
        }
        /**
          * This method writes to a file statistic regarding each client. All the client's ID, 
          * Name, and Weight are listed in a table followed by statistics on how many clients
          * there are, the Average weight, the highest, and lowest weight. 
          *
          * @param output file to which the statistics are written.
          * @param names is an array to hold each client's name.
          * @param weights is an array to hold each client's weight.
          */
         public static void outputStatistics(PrintStream output, String[] names, double[] weights) {
                 output.println("Statistics on our clients:");
                 output.println("Total Number of clients: " + names.length);
                 output.println("Average weight: " + getAverage(weights)); 
                 output.println("Highest weight: " + getHighest(weights)); 
                 output.println("Lowest weight: " + getLowest(weights));
                 output.println();
                 output.println("ID      NAME    WEIGHT");
                 for(int i = 0; i < weights.length; i++) {
                    output.println(i + ".   " + names[i] + "        " + weights[i]);
                 }
         }
         // The following methods are helper methods for outputStatistics:
         /**
           * This method returns the highest weight found in the array.
           *
           * @param weights is an array to hold each client's weight.
           * @return highest weight found in the array.
           */
         public static double getHighest(double[] weights) {
                 double highest = weights[0];
                 for(int i = 1; i < weights.length; i++) {
                        if(weights[i] > highest) {
                                highest = weights[i];
                        }
                 }
                 return highest;
         }
         /**
           * This method returns the lowest weight found in the array.
           *
           * @param weights is an array to hold each client's weight.
           * @return lowest weight found in the array.
           */
         public static double getLowest(double[] weights) {
                 double lowest = weights[0];
                 for(int i = 1; i < weights.length; i++) {
                        if(weights[i] < lowest) {
                                lowest = weights[i];
                        }
                 }
                 return lowest;

         }
         /**
           * This method returns the average of all the weights found in the array.
           *
           * @param weights is an array to hold each client's weight.
           * @return average weight found in the array.
           */
         public static double getAverage(double[] weights) {
                double average = 0.0;
                for(int i = 0; i < weights.length; i++) {
                        average += weights[i];
                 }
                 average = (average / weights.length);
                 return average;
         }
}		
			