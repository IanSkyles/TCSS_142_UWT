/*
 * Course: TCSS142 – Introduction to Object-Oriented Programming Summer 2014
 * File Name: Assign6.java
 * Assignment: 6
 * Due Date: August 11, 2014
 * Instructor: Mr. Schuessler
 */ 
import java.util.*;
import java.io.*;
/** 
 * This program reads lines of text from an input file until there are no more lines to read
 * This program keeps track of #lines in input file, echos each line of input to output file
 * This program keeps of how many words are in the input file and counts the occcurences of certain words 
 * and report the percent of numbers. 
 * @Author: Ian Skyles
 * @version August 11, 2014 
 */ 
  
 public class Assign6 {
      public static void main(String[] args) throws FileNotFoundException {  
            Scanner console = new Scanner(System.in);
            String inputFileName = "", outputFileName = "";
            System.out.println("Please enter the input file name: ");
            inputFileName = console.next();
            System.out.println("Please enter the output file name: ");
            outputFileName = console.next();
            Scanner input = new Scanner(new File(inputFileName));            
            PrintStream output = new PrintStream(new File(outputFileName));
            runProgram(input, output, inputFileName);                  
      }
   /**
     *Purpose: keeps track of lines, words, and 5 words of the input file - then it prints all information to the output file 
     *Input: Scanner input, Printstream output, and the string inputFileName (so it can be sent to output
     *Output: none but does print to PrintStream output - output file specificed in main
     */
      public static void runProgram(Scanner input, PrintStream output, String inputFileName) {
            int countThe = 0, countOf = 0, countTo = 0, countAnd = 0, countA = 0;
            int countLines = 0, countWords = 0;
            String line = "", word = "";
            while(input.hasNextLine()){            
               line = input.nextLine();
               Scanner lineScan = new Scanner(line);                // New scanner is necessary to tokenize string into words
               while(lineScan.hasNext()){
                  word = lineScan.next();                  
                  if(word.equalsIgnoreCase("The")) {
                      countThe++;                     
                  } else if(word.equalsIgnoreCase("Of")) {
                      countOf++;
                  } else if(word.equalsIgnoreCase("To")) {                  
                      countTo++;
                  } else if(word.equalsIgnoreCase("And")) {                  
                      countAnd++;
                  } else if(word.equalsIgnoreCase("A")) {                  
                      countA++;
                  }
                  countWords++;
               }               
               countLines++;
            } 
            output.println("The input file \"" + inputFileName + "\" has the following qualities:\n");
            output.println("A total number of:\n");
            output.println("Lines - " + countLines);
            output.println("Words - " + countWords);
            output.println("The word THE - " + countThe);
            output.println("The word OF - " + countOf);
            output.println("The word TO - " + countTo);
            output.println("The word AND - " + countAnd);
            output.println("The word A - " + countA);
      }
      
 
 }