/* 
 * Course: TCSS142 – Introduction to Object-Oriented Programming Summer 2014 
 * File Name: SeattleSpaceNeedle.java 
 * Assignment: 2 
 * Due Date: July 8, 2014
 * Instructor: Mr. Schuessler 
 */ 
 
 /** 
 * This program draws an image of the Space Needle... 
 * 
 * @author Ian Skyles
 * @version 2014 July 9
 */ 

public class SeattleSpaceNeedle {

//CONSTANT
   public static final int SIZE_SCALE = 2;
   
           public static void main (String[] args) {        
           
           //all required method calls to build a complete space needle 
           //DO YOU WANT THIS TO BE ITS METHOD CALLED buildSpaceNeedle? so that main only calls 1 method?
 
           needlePoint();
           topAndGround();
           middleOfTopOrBase();
           bottomOfTop();
           needlePoint();
           middleColumn();
           topAndGround();
           middleOfTopOrBase();        
           
           }          
                    
          /** 
          * needlePoint method outputs the needle on top
          * This method is also used to print a column that is like a needle below the top part of the space needle 
          */
           
           public static void needlePoint() {
                   
                   // the 1st nestled loop prints the spaces before the needle and 2nd prints the ||
                   for (int i = 1; i <= SIZE_SCALE; i++) {
                           for (int s1 = 1; s1 <= (SIZE_SCALE * 3); s1++) { //determines how many spaces are infront of needle
                           System.out.print(" ");
                           }
                           for (int n = 1; n <= 2; n++) { // changed n from 1 --> 2 so that it loops to print second line
                           System.out.print("|");
                           }                        
                           System.out.println();
                   }               
           }
           
           /** 
            * middleOfTopOrBase method outputs the middle of the top and the base:|""""|
            */
           
           public static void middleOfTopOrBase() {           
               
                   System.out.print("|");
                   
                   //outprints the necessary quotation marks for each line ( 6 " per each increase in scale)
                   for (int i = 1; i <= (SIZE_SCALE * 6); i++)               
                        System.out.print("\"");                   
                   
                   System.out.println("|");
           }
           
           /** 
            * middleColumne method outputs the middle column of the tower: |%%|
            */
           
           public static void middleColumn() {
           
                   //prints the necessary spaces and  |%%| 
                   for (int i = 1; i <= (SIZE_SCALE * 4); i++) {
                           for (int s1 = 1; s1 <= ((SIZE_SCALE * 3) - 3); s1++) { //determines how many spaces are infront of needle
                           System.out.print(" ");
                           }                          
                           //prints twice
                           for (int n = 1; n <= 2; n++) {
                           System.out.print("|%%|");
                           }                        
                           System.out.println();
                   }
           }                
           
           /** 
            * bottomOfTop method outputs the bottom part of the top: \_/\/\/\_/
            */
           
           public static void bottomOfTop () {
           
               //prints necessary lines
               for (int line = 1; line <= SIZE_SCALE; line++) {
                   //prints  necessary # of spaces
                   for (int spaces = 1; spaces < line; spaces++)
                        System.out.print("  ");                                             
                   System.out.print("\\_");
                   //prints # of /\ necessary
                   for (int slashes = 0; slashes <= ((SIZE_SCALE + 1) + (2 * (SIZE_SCALE - line) - 1)); slashes++) 
                        System.out.print("/\\");                        
                          
                   System.out.println("_/");     
                      
               }  
           }
           
           /** 
            * topAndGround method outputs the top of the top and the ground ie: __/||\__ or __/:::||:::\__
            */
           
            public static void topAndGround() {
            
            //nestles all loops below so that every time line increments it will start a new line
            for (int line = 1; line <= SIZE_SCALE; line++) {
                  //prints the necessary spaces decrement by 3 spaces each time
                  for( int spaces = SIZE_SCALE; spaces > line; spaces--)
                      System.out.print("   ");
                  
               System.out.print("__/");               
              
               // prints 3 semi colons per each line except for first one
               for ( int semi = 1; semi <= ((line * 3) - 3); semi++) 
                  System.out.print(":");
               
               //prints | twice
               for ( int i = 1; i <= 2; i++)
                  System.out.print("|");
               
               //prints 3 semi colons per each line except for first one ( on the 2nd part of the line)
               for ( int semi = 1; semi <= ((line * 3) - 3); semi++) 
                  System.out.print(":");
      
               System.out.println("\\__");        
            }
     }
        
}
