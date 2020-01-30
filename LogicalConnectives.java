// CS-278
// LogicalConnectives.java
// Lab Section: M01
// Written by: Jose Franco Baquera
// August 29, 2017
// Purpose: The purpose of the program is to produce
// the truth values of two compound propositions from the user's input. 
// Input: Three characters. T for true and F for false.
// Output: The truth value of the two compound compositions. 

import java.util.Scanner;

public class LogicalConnectives {

   // Negation method. If the parameter is true, return false,
   // otherwise return true.
   
   public static char neg ( char a ) {
   
      if ( a == 'T' )
      
         return 'F';
         
      return 'T';
  
   } // end neg method
   
   // Disjunctive method. A disjunction proposition is only false
   // when BOTH proposition variables are false. 
   
   public static char disj ( char b, char c ) {
   
     if ( b == 'T' || c == 'T' )
     
        return 'T';
        
     return 'F'; 
   
   } // end disj method
   
   // Conjunctive method. A disjunctive proposition is only true
   // when BOTH propostion variables are true.
   
   public static char conj ( char d, char e ) {
   
     if ( d == 'T' && e == 'T' ) 
     
        return 'T';
        
     return 'F';   
   
   } // end conj method 
   
   // Implicative method. A implicative propsition is false only when 
   // the first propostion variable is true then the second propostion is false
   // (i.e. the only time when the "contract" is broken).   
   // NOTE: ORDER MATTERS HERE.
   
   public static char impl ( char f, char g ) {
   
      if ( f == 'T' && g == 'F' )
      
         return 'F';
      
      return 'T';
   
   } // end impl method 
   
   public static void main ( String args [] ) {
   
      // Inizialize the Scanner.
      
      Scanner scan = new Scanner ( System.in );
      
      // Declare variables.
      
      char p, q, r;
      
      // Ask for input three times, scan it as a String, then convert it to a char using the charAt method.
      // Assign them to the char variables.
      
      // NOTE: Use toUpperCase just in case user inputs 't' or 'f' instead of
      // 'T' or 'F'.
      
      System.out.println( "Please enter truth-value of p: (NOTE: Enter 'T' for true or 'F' for false. No lower-case, spaces, or quotes are allowed!)" );
      p = scan.next( ).toUpperCase( ).charAt( 0 );      
      
      System.out.println( "Please enter truth-value of q: (NOTE: Enter 'T' for true or 'F' for false. No lower-case, spaces, or quotes are allowed!)" );
      q = scan.next( ).toUpperCase( ).charAt( 0 );
      
      System.out.println( "Please enter truth-value of r: (NOTE: Enter 'T' for true or 'F' for false. No lower-case, spaces, or quotes are allowed!)" );
      r = scan.next( ).toUpperCase( ).charAt( 0 );
      
      // Print a blank line for easier readability.
      
      System.out.println( );
      
      // Output the result by calling the methods. 
      
      System.out.println( "Truth-value of statement 1 is " + conj( impl( neg( p ), q ), impl( r, p ) ) + "." );
      System.out.println( "Truth-value of statement 2 is " + conj( disj( neg( p ), r ), disj( q, neg( impl( r, q ) ) ) ) + "." );
   
   } // end main method
   
} // end class 