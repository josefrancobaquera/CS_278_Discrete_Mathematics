// CS-278
// SubsetOfASet.java
// Lab Section: M01
// Written by: Jose Franco Baquera
// October 2, 2017
// Purpose: The purpose of the program is to 
// print all the subsets in which their sum is equal 
// to a user's inputed number. 
// Input: The size of a set, the set itself,
// and the sum integer. 
// Output: All the subsets in which all 
// their elements add to the sum integer.

// Import Statements

import java.util.Scanner;

public class SubsetOfASet {

   // Implementation of the printMask method.

   public static void printMask ( int userArray [ ], int bitArray [ ] ) {
   
      // Go through the entire bit array and compare it 
      // to the set that the user inputted. If the bit
      // is 1, then print the corresponding integer in the 
      // user set. If it's 0, then do not print anything.  
      
      System.out.print( "{" );
   
      for ( int j = 0; j < userArray.length; j++ ) {
     
         if ( bitArray [ j ] == 1 )
         
            System.out.print( " " + userArray [ j ] + " " );
    
      } // end for.
      
      System.out.print( "}" );
      
      // Print a newline for easier read.
      
      System.out.println( );
 
   } // end printMask method.
   
   // Implementation of the mask method.

   public static boolean mask ( int array [ ] ) {
   
      // Use a for loop that will "flip the bits"
      // of the bit array and find all possible combinations
      // depending on the size of the set.
      
      int i;
       
      for ( i = 0; ( i < array.length ) && ( array [ i ] != 0 ); i++ ) { 
      
         array [ i ] = 0;
         
      } // end for.
      
      // Return true if all the possible combinations have not
      // been found, else return false.
         
      if ( i < array.length ) {
      
         array [ i ] = 1;
         
         return true;
      
      } // end if.        
      
      return false;
    
   } // end mask method.
   
   // Main method.

   public static void main ( String args [ ] ) {
   
      // Declare variables and a scanner.
         
      int sizeOfArray, numN, tempN = 0, numOfSubsets = 0;
      
      Scanner scan = new Scanner ( System.in );
      
      // Declare two arrays: One for the set S entered by 
      // the user, and another one for the mask.
      
      int setArray [ ], maskArray [ ];
      
      // Print a prompt to the user for the size of S
      // and store it.  
      
      System.out.print( "Please enter the size of S (NOTE: S cannot be larger than 10): " );
      
      sizeOfArray = scan.nextInt( );
      
      // Both the setArray and maskArray must be the same length
      // in order to compare them correctly. 
      
      setArray = new int [ sizeOfArray ];
      
      maskArray = new int [ sizeOfArray ];
      
      // Fill the entire maskArray with zeros in order to 
      // "flip the bits" later.
      
      for ( int i = 0; i < maskArray.length; i++ ) {
      
         maskArray [ i ] = 0;      
      
      } // end for.
      
      // Prompt the user to input all the elements in set S 
      // and store them in the array.
      
      System.out.print( "Please enter S: " );
      
      if ( sizeOfArray == 0 ) {
      
         System.out.print( "***Note*** Cannot enter any elements since size of S is 0." );
      
         System.out.println( " " );
         
      } // end if
            
      for ( int i = 0; i < setArray.length; i++ ) {
      
         setArray [ i ] = scan.nextInt ( );     
      
      } // end for.
      
      // Prompt the user to enter the sum to find and store
      // that number.
      
      System.out.print( "Please enter the number N: " );
      
      numN = scan.nextInt ( );
      
      System.out.println( "Subsets with sum " + numN + ":" );
      
      // Use a while loop that will stop until you find all the 
      // subsets of the set.
      
      while ( mask ( maskArray ) ) {
      
         // Use a for loop that will add all the elements
         // in the setArray by comparing the 1's and 0's 
         // in the maskArray to the setArray.
      
         for ( int k = 0; k < maskArray.length; k++ ) { 
         
            if ( maskArray [ k ] == 1 )
            
               tempN = tempN + setArray [ k ];   
         
         } // end for
         
         // If the sum was equal to the number inputed by the user,
         // print the subset.
         
         if ( tempN == numN ) {
         
            printMask ( setArray, maskArray );
            
            numOfSubsets = numOfSubsets + 1;
                      
         } // end if.
         
         tempN = 0;
        
      } // end while.
      
      // If none of the subsets had a sum equal to 
      // the user inputted number, print out a 
      // message to the user. 
      
      if ( numOfSubsets == 0 )
      
         System.out.println( "Do Not Exist." ); 
        
   } // end main method.
   
} // end class.