// CS-278
// Functions.java
// Lab Section: M01
// Written by: Jose Franco Baquera
// October 3, 2017
// Purpose: The purpose of the program is to 
// print all the possible functions from X = { a, b, c }
// to a set Y = { 0, 1, ...., n } where n is provided by the 
// user. Each function will the be checked if it is onto,
// one-to-one, and a bijection. The total functions that are
// one-to-one, onto, and a bijaction will then be printed 
// at the end. Note: n is >= 0 but cannot be greater than 10.  
// Input: The value of n for the set Y. 
// Output: All functions from X to Y.

// Import Statements

import java.util.Scanner;

public class Functions {

   // Implmentation of the isOneToOne method.

   public static boolean isOneToOne ( int a, int b, int c ) {
   
      // Check if the any value in the range is equal to one another.
      // If this occurs, then the function is not one-to-one, so return false.
      // If this does not occur, then the function is one-to-one, so return true.
   
      if ( a == b || a == c || b == c )
      
         return false;
         
      // Return true if the if statement did not execute.
         
      return true;   
   
   } // end isOneToOne.
   
   // Implementation of the isOnto method.
   
   public static boolean isOnto ( int x, int y, int z, int numElements ) { 
   
      int zeroCount = 0, oneCount = 0, twoCount = 0;
      
      int parameters [ ] = { x, y, z };
      
      // Divide the problem into parts depending on the number of elements
      // entered by the user.
   
      // If the cardinality of function Y is one, it is autmatically 
      // onto.    
      
      if ( numElements == 1 ) 
      
         return true;
         
      // If the cardinality of function Y is two, then 
      // check that there are at least one "0" and one "1".
                  
      if ( numElements == 2 && !( x == y && y == z ) ) 
      
         return true;
         
      // The last scenerio to check is when the cardinality of function
      // Y is three. Here, there must be at least one "0", one "1", and
      // one "2".
         
      if ( numElements == 3 ) {
      
         for ( int index = 0; index < 3; index++ ) {
         
            if ( parameters [ index ] == 0 )
            
               zeroCount++;
               
            if ( parameters [ index ] == 1 )
            
               oneCount++; 
               
            if ( parameters [ index ] == 2 )
            
               twoCount++;  
                        
         } // end for.
         
         return zeroCount == 1 && oneCount == 1 & twoCount == 1;
    
      } // end if.
      
      // If none of the above if statements executed, then the function is auto-
      // matically not onto since a function that has larger domain than its 
      // target cannnot possibly be onto. Therefore, return false.
      
      return false;
     
   } // end isOnto.
   
   // Main method.
   
   public static void main ( String args [ ] ) {
   
      // Declare variables. One for input, one for printing the
      // function number, another for counting the number of functions,
      // another for counting the one-to-one functions, another
      // one for counting the number of onto functions, and another 
      // one for counting the number of bijection functions.
   
      int inputN, printFunctionNum = 1, functionCount = 0, oneToOneCount = 0, ontoCount = 0, bijectionCount = 0;
            
      Scanner scan = new Scanner ( System.in );
      
      // Print a prompt for the user.
      
      System.out.println( "The program will generate all functions from X = { a,b,c } to Y = { 0,1,....,n }." );
      
      System.out.println( "Note: n is >= 0 but cannot be larger than 10." );
      
      System.out.print( "Please enter the value of n: " );
      
      inputN = scan.nextInt( );
            
      // Use three nested loops to find all the possible function combinations. 
      
      for ( int i = 0; i <= inputN; i++ ) {
      
         for ( int k = 0; k <= inputN; k++ ) {
         
            for ( int m = 0; m <= inputN; m++ ) {
            
               System.out.printf( "f%d(a) = %d          f%d(b) = %d          f%d(c) = %d\n", printFunctionNum, i, printFunctionNum, k, printFunctionNum, m );
               
               // Check if the function is one-to-one.
               
               if ( isOneToOne ( i, k, m ) ) {
               
                  System.out.print( "     f" + printFunctionNum + " is one-to-one, " );
                  
                  oneToOneCount = oneToOneCount + 1;
                  
               } // end if.
                  
               else 
               
                  System.out.print( "     f" + printFunctionNum + " is not one-to-one, " ); 
                  
               // Check if the function is onto.

               if ( isOnto ( i, k, m, inputN + 1  ) ) {
               
                  System.out.print( "onto, and " );
                  
                  ontoCount = ontoCount + 1;
                  
               } // end if.
                  
               else
               
                  System.out.print( "not onto, and " ); 
                  
               // Check if the function is a bijection.
                  
               if ( isOnto ( i, k, m, inputN + 1 ) && isOneToOne ( i, k, m ) ) {
               
                  System.out.println( "a bijection." );
                  
                  bijectionCount++;
                  
                  System.out.println( " " );
                             
               } // end if.
               
               else {
               
                  System.out.println( "not a bijection." );
         
                  System.out.println( " " );
                  
               } // end else
            
               printFunctionNum++;
               
               functionCount++;
        
            } // end for.       
         
         } // end for.
      
      } // end for.
      
      // Print the total sum of each indivdual type of function.
      
      System.out.println( "There are " + functionCount + " functions total." );
      
      System.out.println( oneToOneCount + " of them are one-to-one." );
      
      System.out.println( ontoCount + " of them are onto." );
      
      System.out.println( bijectionCount + " of them are bijections." );
        
   } // end main.
   
} // end class.