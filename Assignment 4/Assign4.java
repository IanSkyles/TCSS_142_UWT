/*
* Course: TCSS142 – Introduction to Object-Oriented Programming Summer 2014
* File Name: Assign4.java
* Assignment: 4
* Due Date: July 22, 2014
* Instructor: Mr. Schuessler
*/ 
import java.util.*;
/**
* Based on a user input value for the number of employees to process, this program will also prompt the 
* user for each employee’s hours worked, hourly pay rate, and name. Once enter.... etc.
*
* @author Ian Skyles
* @version 2014 July 22
*/

public class Assign4 {

                /**
                *Purpose: calls prcoessEmployeePay and creates a new Scanner
                *Input: String[] args
                *Output: void
                */
                
        public static void main(String[] args) {
                Scanner console = new Scanner(System.in);
        processEmployeePay(getEmployeeCount(console), console);
        }
                public static int getEmployeeCount(Scanner console) {
                        //int employeeCCount = 0;
                        //employeeCount = console.nextInt();
                        System.out.print("Enter number of employees and press enter: ");
                        return console.nextInt();                        
                }
                
                /**
                *Purpose: scans hours,payrate, and employee name and calls other methods , also keeps track of top employee (hrsWorked)
                *Input: int num of employees and scanner console
                *Output: void
                */
                
                public static void processEmployeePay(int employeeCount, Scanner console) {
                        double hoursWorked = 0.0, payRate = 0.0, totalPay = 0.0, topEmployeeHours = 0.0;
                        String employeeName = "", TopEmployeeName = "";
                        
                        for(int i = 1; i <= employeeCount; i++) {
                                System.out.print("Enter hours worked, pay rate, and employee name seperated by a space: ");
                                hoursWorked = console.nextDouble();
                                payRate = console.nextDouble();
                                employeeName = console.nextLine(); // null
                                //employeeName = console.nextLine();
                                //employeeName = console.next() +console.next();
                                totalPay = getGrossPay(hoursWorked,payRate);
                                if (hoursWorked > topEmployeeHours) {
                                        topEmployeeHours = hoursWorked;
                                        TopEmployeeName = employeeName;
                                }
                                displayEmployeeInfo(employeeName, hoursWorked, payRate, totalPay);
                                }
                                displayTopEmployee(TopEmployeeName,topEmployeeHours);
                                
                                
                        } 
                        
                /**
                *Purpose: Calculates gross pay and factors in overtime
                *Input: hours rate
                *Output: grossPay as double
                */
                
                public static double getGrossPay(double hours, double rate) {
                        double grossPay = 0.0;
                        if(hours <= 40) {
                                grossPay = hours * rate;
                        } else if (hours <= 48) {
                                grossPay = ((rate * 40) + ((hours - 40) * (rate * 1.5)));
                        } else if (hours > 48) {
                                grossPay = ((rate * 40) + ((rate * 1.5) * 8) + ((2 * rate) * (hours - 48)));
                        } 
                        return grossPay;
                }  
                
                /**
                *Purpose: prints employee name, hours, pay rate, gross pay
                *Input: name,hours,pay rate,total pay
                *Output: void
                */
                
                public static void displayEmployeeInfo(String employeeName, double hoursWorked, double payRate, double totalPay) {
                        System.out.println("\t" + padLeft("Employee name: ", 27) + employeeName);
                        //could impliment twoDigit method and call twoDigit(hoursWorked); like we did in PA3.
                        System.out.printf("\t" + padLeft("Hours worked:\t ", 27) + padLeft(twoDigit(hoursWorked), 14) + "\n");
                        System.out.printf("\t" + padLeft("Pay rate:\t ", 27) + padLeft(twoDigit(payRate), 14) + "\n");
                        System.out.printf("\t" + padLeft("Gross pay:\t ", 27) + padLeft("$" + twoDigit(totalPay), 14) + "\n");
                }
                
                /**
                *Purpose: Displays top employee and his/her hours
                *Input: employee name and hours
                *Output: void
                */
                
                public static void displayTopEmployee(String theTopEmployee, double theTopEmployeesHours) {
                System.out.println("WOW!!!!! What a Dynamo!    " + theTopEmployee + " worked "  + theTopEmployeesHours + " hours this WEEK!");
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
                *Purpose: Rounds any number input to 2nd decimal place
                *Input: number to be rounded
                *Output: number rounded to 2nd decimal
                */
               
               public static String twoDigit (double theNumber) {
                // needs to be fixed to display .00 not .0 ie 2 digits after decimal place
                       String  toBeReturned = "will be changed";             
                       theNumber = Math.round(theNumber*100);
                       theNumber = (theNumber / 100.0);
                       toBeReturned = String.valueOf(theNumber);
                       return toBeReturned;
               }
                       
                
        
}