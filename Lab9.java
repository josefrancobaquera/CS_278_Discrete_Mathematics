// CS-278
// Lab9.java
// Lab Section: M01
// Written by: Jose Franco Baquera
// October 16, 2017
// Purpose of the program: The purpose of the program is 
// to use recursion to print out two summations given 
// a user input.   
// Input: An integer.
// Output: Two summations.

import java.lang.Math;
import java.util.Scanner;

public class Lab9 {

   // Implementation of the sum1 method.
   
   public static int sum1 ( int inputOne ) {
   
      // Error case. If the user inputed a number
      // that is less than 0, return 0 since, for this summation, 
      // inputOne can only be >= 0.
      
      if ( inputOne < 0 )
      
         return 0;
         
      // Base case. The base case for this summation is when inputOne is zero.
      // Since 2 to the power of 0 is equal to 1. return 1.
      
      if ( inputOne == 0 )
      
         return 1;
         
      // Recursive (inductive) case. We need to seperate the final term in 
      // the summation to implement recursion. The last term
      // is equal to 2 to the power of inputOne.
      
      int inductiveStep = sum1( inputOne - 1 );
            
      int lastTerm = ( int ) Math.pow( 2, inputOne );
      
      return ( inductiveStep + lastTerm );  
   
   } // end sum1 method.
   
   // Implementation of the sum2 method.
   
   public static int sum2 ( int inputTwo ) {
   
      // Error case. If the user inputed a number
      // that is less than 1, return zero since, for this summation, 
      // inputTwo can only be >= 1.
      
      if ( inputTwo < 1 )
      
         return 0;
         
      // Base case. The base case for this summation is 2 
      // since 1*(1+1) equals 2.
            
      if ( inputTwo == 1 )
      
         return 2;
   
      // Recursive (inductive) case. We need to seperate the final term in 
      // the summation to implement recursion. The last term
      // is equal to inputTwo * ( inputTwo + 1 ).
      
      int inductiveStep = sum2( inputTwo - 1 );
            
      int lastTerm = inputTwo * ( inputTwo + 1 );
      
      return ( inductiveStep + lastTerm ); 
      
   } // end sum2 method.
   
   public static void main ( String args [ ] ) {
   
      // Declare a integer variable for user input and 
      // instantiate a scanner object.
      
      int userInput;
      
      Scanner scan = new Scanner ( System.in );
      
      // Prompt the user to input an integer, then print the sum of both
      // summations by calling the sum1 and sum2 methods.
      
      System.out.println( "***NOTE: Valid input for the first summation is >=0. For the second summation, valid input is >=1." );
      
      System.out.print( "Please enter the value of n: " );
      
      userInput = scan.nextInt( );
      
      System.out.println( "---If the value of either summation is zero, then an invalid integer was inputed.---" );
      
      System.out.println( "The value of the 1st summation is " + sum1( userInput ) );
      
      System.out.println( "The value of the 2nd summation is " + sum2( userInput ) );
   
   } // end main method.
   
} // end class.