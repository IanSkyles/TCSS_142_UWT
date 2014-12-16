/*
 * Course: TCSS142 – Introduction to Object-Oriented Programming Summer 2014
 * File Name: ProgrammingAssignemntFive.java
 * Assignment: 5
 * Due Date: August 4, 2014
 * Instructor: Mr. Schuessler
 */ 
import java.util.*;
/**
  *This program will randomly select a number between 1-10,1-100,or 1-1000. The user will then guess 
  *for the number until they find it. The user will be asked if they want to play again once they guess the right number.
  *
  * @author Ian Skyles
  * @version 2014 July 22
  */

public class ProgrammingAssignemntFive {

         /**
           *Purpose: calls to display the directions and then calls the game (seperate so it doesnt display directions twice)
           *Input: String[] args
           *Output: void
           */
        public static void main(String[] args) {      
        Scanner console = new Scanner(System.in); // create scanner and random object
        Random rand = new Random();
        
        startDirections();
        game(console, rand);
                        
        }
        
        /**
           *Purpose: displays directions
           *Input: none
           *Output: void
           */        
        public static void startDirections() {
                System.out.println("This program prompts the user to play the game; Guess A Number from 1 to ...\n");
                System.out.println("The upper limit being a power of 10 up to and including an exponent of 3 (1 - 10, 1 - 100, or 1 - 1,000\n");
                System.out.println("Once a correct guess is made, the number of guesses is displayed and the user is prompted to play again.\n");
                System.out.println("Games continue until the user responds to the above prompt by typing anything other than a Y or y.");
        }
        
        /**
           *Purpose: randomly selects which 'version' of the game then randomly selects number for that version. Next, it takes users guess and tallies them until user guesses correctly
           *Input: scanner console, and random rand - so that we can read numbers and randomly select numbers
           *Output: void
           */   
        public static void game(Scanner console, Random rand) {
                int upperLimit = 0, secretNumber = 0, numberOfGuesses = 1, userGuess = 1;
                
                do{
                
                upperLimit = rand.nextInt(3);
                
                if (upperLimit == 0) {
                        upperLimit = 10;
                } else if (upperLimit == 1) {
                        upperLimit = 100;
                } else {
                        upperLimit = 1000;
                }
                secretNumber = rand.nextInt(upperLimit) + 1;
                
                System.out.println("Pick a number from 1 to " + upperLimit + ": ");
                userGuess = console.nextInt();

                while (userGuess != secretNumber) {
                        if (userGuess > secretNumber) {
                        System.out.println("No Dude! Your guess is to like elevated man.");
                        } else {
                        System.out.println("Bummer man. Like what a downer. That guess is like under the waves.");
                        }
                        System.out.println("Guess again: ");
                        userGuess = console.nextInt();                        
                        numberOfGuesses++;
                } 
                System.out.println("AWESOME DUDE! You guessed it in " + numberOfGuesses + " tries.");
                }while (playMore(console));
                 
        }
        
        /**
           *Purpose: called by game() method so that we know if the user wants to play another game 
           *Input: scanner console
           *Output: true or false (boolean)
           */           
        public static boolean playMore(Scanner console) {
                char response = getResponse(console);
                return response == 'Y' || response == 'y';
        }
        
        /**
           *Purpose: called by playMore() method so that we can read the users choice to play more or to quit
           *Input: scanner console
           *Output: char
           */ 
        public static char getResponse(Scanner console) {
                String response = "";              
                System.out.print("Hey Dude, want to Party On [Y/N]? ");
                response = console.next();               
                return response.charAt(0);
        }
        
}