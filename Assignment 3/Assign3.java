
/* 
 * Course:      TCSS142 - Intro. to OOP - Summer 2014
 * File Name:   Assign3.java
 * Assignment:  3
 * Due Date:    July 14, 2014
 *Instructor:   Mr. Schuessler
 */
 
import java.util.*; //imports math and other methods that will be used
 /**
  *This program calculates dimensions of various shapes...
  *
  *@author Ian Skyles
  *@version 2014 July 14
  */  
  
public class Assign3 {
        public static void main(String[] args) {             
                Scanner console = new Scanner(System.in);                
                //creation of circular and box variables
                double radiusCircular = 0.0, heightCircular = 0.0, circleArea = 0.0;
                double lengthBox = 0.0, widthBox = 0.0, heightBox = 0.0;
                String firstAndLastName = "input real String later";
                //prompts and takes input for circle/cone shape
                System.out.println("For circular shapes, please enter a radius and height separated by a space:");
                radiusCircular = console.nextDouble();                
                heightCircular = console.nextDouble();
                System.out.println();
                //prompts and takes input for box shape
                System.out.println("For rectangular/box shapes, please enter a length, width, and height separated by a space:");
                lengthBox = console.nextDouble();
                widthBox = console.nextDouble();
                heightBox = console.nextDouble();
                System.out.println();
                //circle and cone info
                System.out.println("Circular shapes sizes using a radius of " + radiusCircular + " and a height of " + heightCircular);
                System.out.println("\t" + padLeft("Circle circumference:\t", 27) + padLeft(twoDigit(circumference(radiusCircular)), 14));
                System.out.println("\t" + padLeft("Circle Area:\t", 27) + padLeft(twoDigit(circleArea(radiusCircular)), 14));                
                System.out.println("\t" + padLeft("Line length up cone side:\t", 27) + padLeft(twoDigit(lineLength(radiusCircular, heightCircular)), 14));
                System.out.println("\t" + padLeft("Cone Surface Area:\t", 27) + padLeft(twoDigit(coneArea(radiusCircular, lineLength (radiusCircular, heightCircular))), 14));                
                System.out.println("\t" + padLeft("Cone Volume:\t", 27) + padLeft(twoDigit(coneVolume(radiusCircular, heightCircular)), 14));
                System.out.println("\t" + padLeft("Cylinder Surface Area:\t", 27) + padLeft(twoDigit(cylinderArea(radiusCircular, heightCircular)), 14));
                System.out.println("\t" + padLeft("Cylinder Volume:\t", 27) + padLeft(twoDigit(cylinderVolume(radiusCircular, heightCircular)), 14));
                System.out.println();
                //box and rectangle info
                System.out.println("Box sizes using a length of " + lengthBox + ", a width of " + widthBox + ", and a height of " + heightBox + ":");
                System.out.println("\t" + padLeft("Box Surface Area:\t", 27) + padLeft(twoDigit(boxSurfaceArea(lengthBox, widthBox, heightBox)), 14));
                System.out.println("\t" + padLeft("Box Volume:\t", 27) + padLeft(twoDigit(boxVolume(lengthBox, widthBox, heightBox)), 14));
                //Not sure if you wanted Rectangle Area to print; delete comment below to have program print rectangle area.
                //System.out.println("\t" + padLeft("Rectangle Area:\t", 27) + padLeft(twoDigit(rectangleArea(widthBox, heightBox)), 14));
                System.out.println();
                //takes users name
                System.out.print("Please enter your first and last name: ");
                console.nextLine(); // consumes null character
                firstAndLastName = console.nextLine(); 
                System.out.println();
                System.out.println(firstAndLastName + " in a LAST, FIRST format: " + switchNames(firstAndLastName));
                System.out.println();
                System.out.println(firstAndLastName + " backwards is " + reverseName(firstAndLastName));
                System.out.println();
                System.out.println("Now isn't that silly!");
                
       }
       
       /**
        *Purpose: Calculates circumference of a circle
        *Input: radius of circle
        *Output: circumference of a circle
        */
       public static double circumference (double radiusOfCircle) {
                return ((2 * Math.PI) * radiusOfCircle);
       }
       
       /**
        *Purpose: Calculates Area of circle
        *Input: radius of circle
        *Output: Area of circle
        */
       
       public static double circleArea (double radiusOfCircle) {
                return (Math.PI) * (radiusOfCircle * radiusOfCircle);
       }
       
       /**
        *Purpose: Calculates Length of line in circle
        *Input: radius of circle and height of circle
        *Output: Length of line in circle
        */
       
       public static double lineLength (double radiusOfCircle, double heightOfCircle) {
                return Math.sqrt((Math.pow(radiusOfCircle, 2)) + (Math.pow(heightOfCircle, 2)));
       }
       
       /**
        *Purpose: Calculates area of cone
        *Input: radius of cone and length of line
        *Output: Area of cone
        */
       
       public static double coneArea (double radiusOfCone, double lineLength) {
                return ((Math.PI * (Math.pow(radiusOfCone,2))) + (Math.PI * radiusOfCone * lineLength));
       }
       
       /**
        *Purpose: Calculates volume of cone
        *Input: radius of cone and height of cone
        *Output: Volume of cone
        */
       
       public static double coneVolume (double radiusOfCone, double heightOfCone) {
                return (((Math.PI) * (Math.pow(radiusOfCone,2)) * heightOfCone) / 3);
       }
       
       /**
        *Purpose: Calculates area of cylinder
        *Input: radius of cylinder and height of cylinder
        *Output: Area cylinder
        */
       
       public static double cylinderArea (double radiusOfCylinder, double heightOfCylinder) {
                return ((2 * Math.PI * (Math.pow(radiusOfCylinder,2))) + (2 * Math.PI * radiusOfCylinder * heightOfCylinder));
       }
       
       /**
        *Purpose: Calculates volume of cylinder
        *Input: radius of cylinder and height of cylinder
        *Output: volume of cylinder
        */
       
       public static double cylinderVolume (double radiusOfCylinder, double heightOfCylinder) {
                return (Math.PI * Math.pow(radiusOfCylinder,2) * heightOfCylinder);               
       }
       
       /**
        *Purpose: Calculates area of rectangle
        *Input: width of rectangle and height of rectangle
        *Output: area of rectangle
        */
       
       public static double rectangleArea (double widthOfRectangle, double heightOfRectangle) {
                return widthOfRectangle * heightOfRectangle;
       }
       
       /**
        *Purpose: Calculates Volume of box
        *Input: length of box, width of box, height of box
        *Output: Volume of box
        */
       
       public static double boxVolume (double lengthOfBox, double widthOfBox, double heightOfBox) {
                return lengthOfBox * heightOfBox * widthOfBox;
       }
       
       /**
        *Purpose: Calculates Surface area of box
        *Input: length of box, height of box, and width of box
        *Output: Surface area of box
        */
       
       public static double boxSurfaceArea (double lengthOfBox, double widthOfBox, double heightOfBox) {
                return ((2* lengthOfBox * heightOfBox) + (2 * widthOfBox * heightOfBox) + (2 * lengthOfBox * widthOfBox));
       }
       
       /**
        *Purpose: Rounds any number input to 2nd decimal place
        *Input: number to be rounded
        *Output: number rounded to 2nd decimal
        */
       
       public static String twoDigit (double theNumber) {
               String  toBeReturned = "will be changed";             
               theNumber = Math.round(theNumber*100);
               theNumber = (theNumber / 100.0);
               toBeReturned = String.valueOf(theNumber);
               return toBeReturned;
       }
       
       /**
        *Purpose: prints white space next to strings to the are right justified
        *Input: string and the index that of characters and white spaces
        *Output: white spaces and string
        */
       
       public static String padLeft (String theString, int theLength) {
               String toBeReturned = "";
               //int x = theString.length;
               for (int i = (theLength - theString.length()); i > 0; i--) {
                      toBeReturned = toBeReturned + " ";
               }
               toBeReturned = toBeReturned + theString;
               
               return toBeReturned;
       }
       
       /**
        *Purpose: Switches first and last name, puts comma in the middle
        *Input: users name
        *Output: LAST NAME, FIRST NAME
        */
       
       public static String switchNames (String fullName) {
               String toBeReturned = "name to be returned";
               String first = fullName.substring(0, fullName.indexOf(" ")); 
               String last = fullName.substring(fullName.indexOf(" ") + 1);
               first = first.toUpperCase();
               last = last.toUpperCase();
               toBeReturned = last + ", " + first;
               
               return toBeReturned;       
       }
       
       /**
        *Purpose: name reversed
        *Input: users name
        *Output: reversed name ie: input: ian return: nai
        */
       
       public static String reverseName (String fullName) {
               String toBeReturned = "String to be returned";
               toBeReturned = new StringBuffer(fullName).reverse().toString();
               return toBeReturned;               
       }
}