// CS-278
// DisproofByCounterexample.java
// Lab Section: M01
// Written by: Jose Franco Baquera
// September 19, 2017
// Purpose: The purpose of the program is to 
// print the smallest counterexample to the following
// Theorem: "Every odd number from 3 onwards can be written
// as the sum of a prime number and twice a square." 
// Input: No input.
// Output: The smallest counterexample.

// Import Statements

import java.util.Scanner;

public class DisproofByCounterexample {

   // Implementation of isPrime method.
   
   public static boolean isPrime ( int n ) {
   
      // If n is less than or equal to 1, it is not prime, return false.
   
      if ( n < 2 ) { 
      
         return false;
      
      } // end if.
      
      else {
   
         // Check if the argument is a prime. Return true if 
         // it is, false otherwise. We only have to check up to 
         // the square root of number n.
      
         for ( int i = 2; i < ( int ) ( Math.sqrt( n ) + 1 ); i++ ) {
      
            if ( n % i == 0 )
         
               return false;      
      
         } // end for loop.
      
      } // end else.
      
      return true;  
   
   } // end isPrime method.
   
   public static void main ( String args [ ] ) {
   
      // Generate a list of the first 100 squares ( 0 to 99) and
      // place them in a array size 100.
      
      int squareRoot [ ] = new int [ 100 ];
      
      for ( int i = 0; i <= 99; i++ ) {
      
         squareRoot [ i ] = i * i;     
      
      } // end for loop
      
      // Check every odd number starting at 3 and check
      // if it can be written as the sum of twice a square
      // and a prime number.
      
      boolean oddNumberPrime = true;
      
      int smallestOddNumber = -1;
      
      int oddNumber = 3;
      
      int countOfPrimes = 0;
      
      while ( oddNumberPrime ) {
      
         for ( int j = 0; j < squareRoot.length; j++ ) {
                  
            if ( isPrime( oddNumber - 2 * squareRoot[ j ] ))
            
               countOfPrimes++;
            
         } // end for.
         
         if( countOfPrimes == 0 ) {
         
            smallestOddNumber = oddNumber;
           
            oddNumberPrime = false;
      
         } // end if.
        
         countOfPrimes = 0;
        
         oddNumber = oddNumber + 2;
      
      } // end while.
      
      System.out.print( "\nThe smallest integer counterexample to the Theorem is " + smallestOddNumber + ".\n" );

   } // end main method

} // end class