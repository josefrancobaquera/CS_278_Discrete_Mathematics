// CS-278
// QuantifiedStatements.java
// Lab Section: M01
// Written by: Jose Franco Baquera
// September 7, 2017
// Purpose: The purpose of the program is to 
// produce the trurth-values of five quantified
// statements, given a domain of ten integers
// inputted by the user.
// Input: Ten integers. 
// Output: The truth value of the five 
// quantified statements.

import java.util.Scanner;

public class QuantifiedStatements {

   // Method for first quantified statement.  
   
   public static String firstQuantifiedStatement ( int intArray [ ] ) {
   
      // Find at least ONE counterexample. If found, return "False,"
      // else "True." (i.e. find a number that is both less than zero 
      // AND not odd).
   
      for ( int i = 0; i < intArray.length; i = i + 1 ) {
      
         if ( ( intArray[ i ] < 0 ) && ( intArray[ i ]%2 == 0 ) )
         
            return "False";
     
      } //end for
      
      return "True";   
   
   } // end firstQuantifiedStatement
   
   // Method for the second quantified statement.   
   
   public static String secondQuantifiedStatement ( int intArray [ ] ) {
   
      // Find at least ONE integer in the domain that makes the statement true.
      // If so, return "True", else "False."
   
      for ( int i = 0; i < intArray.length; i = i + 1 ) {
      
         if ( ! ( ( intArray[ i ] < 0 ) && ( intArray[ i ]%2 == 0 ) ) )
         
            return "True";
     
      } //end for
      
      return "False";   
   
   } // end secondQuantifiedStatement
   
   // Method for the third quantified statement.  
   
   public static String thirdQuantifiedStatement ( int intArray [ ] ) {
   
      // Find at least ONE integer in the domain that makes the statement true.
      // If so, return "True", else "False."
   
      for ( int i = 0; i < intArray.length; i = i + 1 ) {
      
         if (  ( intArray[ i ] < 0 ) && ( intArray[ i ]%2 != 0 ) ) 
         
            return "True";      
      
      } // end for
      
      return "False";   
   
   } // end thirdQuantifiedStatement
   
   // Method for the fourth quantified statement. 
   
   public static String fourthQuantifiedStatement ( int intArray [ ] ) {
   
      // Find at least ONE counterexample. If found, return "False,"
      // else "True." (i.e. find a number that is divisible by 3
      // but not divisible by 5).
   
      for ( int i = 0; i < intArray.length; i = i + 1 ) {
      
         if ( ( intArray[ i ]%3 == 0 ) && !( intArray[ i ]%5 == 0 ) )
         
            return "False";
     
      } //end for
      
      return "True";
         
   } // end fourthQuantifiedStatement
   
   // Method for the fifth quantified statement.   
   
   public static String fifthQuantifiedStatement( int intArray [ ] ) {
   
      // Find at least ONE element in the array that will make the quantified statement true.
      // If so, return "True," otherwise return "False."
   
      for ( int i = 0; i < intArray.length; i = i + 1 ) {
      
         if ( ! ( ( intArray[ i ]%3 == 0 ) && ! ( intArray[ i ]%5 == 0 ) ) ) 
         
            return "True";      
      
      } // end for
      
      return "False";    
   
   } // end fifthQuantifiedStatement
   
   public static void main ( String args [ ] ) {
   
      // Declare and inizialize the scan object and an integer 
      // array to store the user's ten integers.
      
      Scanner scan = new Scanner ( System.in );
      
      int tenDiffIntegers [ ] = new int [ 10 ];
      
      // Prompt the user to input ten different integers, then store each 
      // one of them into the integer array.
      
      System.out.println( "Please Enter 10 DIFFERENT (ie. NOT repeating) integers:" );
      
      for ( int i = 0; i < tenDiffIntegers.length; i = i + 1 ) {
      
         tenDiffIntegers[ i ] = scan.nextInt( );     
      
      } // end for
      
      // Print the truth values of the five quantified statements. 
      
      System.out.println( "a) is " + firstQuantifiedStatement( tenDiffIntegers ) );
      System.out.println( "b) is " + secondQuantifiedStatement( tenDiffIntegers ) );
      System.out.println( "c) is " + thirdQuantifiedStatement( tenDiffIntegers ) ); 
      System.out.println( "d) is " + fourthQuantifiedStatement( tenDiffIntegers ) );
      System.out.println( "e) is " + fifthQuantifiedStatement( tenDiffIntegers ) );  
   
   } // end main

} // end class