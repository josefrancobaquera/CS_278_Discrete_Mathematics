// CS-278
// NestedQuantifiers.java
// Lab Section: M01
// Written by: Jose Franco Baquera
// September 12, 2017
// Purpose: The purpose of the program is to 
// print out the truth values of several quantified
// statements with the domain of ten integers
// from the user.
// Input: 10 DIFFERENT integer numbers from the user.
// Output: Truth value of several nested quantifiers. 

// Import statement needed.

import java.util.Scanner;

public class NestedQuantifiers {

   // Implementation of the first nested quantifier.
   
   // All integers x in the domain will have at least one integer (also in the
   // domain) y such that (x + y) is odd or x is divisible by 3. 

   public static String firstNestedQuantifier ( int integerArray [ ] ) {
   
      // Use two nested for loops that will evaluate each and every combination.
      // We assume the first inner iteration is true and that the number
      // of all x that at least has one y that makes the statement true is 
      // equal to zero. 
            
      boolean nestedQuantifier = true;
      int countOfTrue = 0;
     
      for ( int x = 0; x < integerArray.length; x++ ) {
      
         for ( int y = 0; y < integerArray.length; y++ ) {
         
            if ( ( ( ( integerArray [ x ] + integerArray [ y ] ) % 2 != 0 ) || ( integerArray [ x ] % 3 == 0 ) ) && nestedQuantifier ){
            
            // Increment the nestedQuantifier since at least one y worked. Make nestedQuantifer 
            // false to stop the inner from counting more y's that work.
            // At least ONE y will work, more that will work are irrelevant to the quantifier. 
            
            countOfTrue = countOfTrue + 1;
            nestedQuantifier = false;
                     
            } // end if 

         } // end inner for
         
         // "Reset" the nestedQuantifier boolean to make the second for loop able 
         // to execute again
      
         nestedQuantifier = true;
        
      } // end outer for
      
      // Return true if all x had at least one y that made the nested quantifier
      // true, false otherwise.
          
      if ( countOfTrue % 10 == 0 ) {    
      
         return "True";
         
      } // end if
         
      return "False";
           
   } // end firstNestedQuantifier method
   
   // Implementation of the second nested quantifier.  
   
   // There exists at least one integer x in the domain 
   // such that for all integers (also in the domian) y, 
   // (x + y) is odd or x is divisible by 3. 
   
   public static String secondNestedQuantifier ( int integerArray [ ] ) {
   
      // Use two nested for loops and an if statement that will find 
      // at least one x in the domain where all y's make the statement
      // true. We assume that the count of y' that make P(x, y)
      // true is zero.
      
      int countOfTrue = 0;
   
      for ( int x = 0; x < integerArray.length; x++ ) {
      
         for ( int y = 0; y < integerArray.length; y++ ) {
         
            // If P( x, y ) is true, increment countOfTrue.
         
            if ( ( ( integerArray[ x ] + integerArray[ y ] ) % 2 != 0 ) || ( integerArray[ x ] % 3 == 0 ) )
            
               countOfTrue = countOfTrue + 1; 
            
         } // end inner for
         
         // If countOfTrue is 10 (i.e. all y's worked, return true.
         // If not, assign countOfTrue back to zero.
         
         if ( countOfTrue % 10 == 0 )
         
            return "True";
            
         countOfTrue = 0;
     
      } // end outer for
      
      // Return false if countOfTrue never became 10.
      
      return "False"; 
      
   } // end secondNestedQuantifier method
   
   // Implementation of the thirdNestedQuantifier method.
   
   // There exists at least one integer x in the the domain such that at least one
   // integer (also in the domain) y such that ( x + y ) is odd or x is divisible 
   // by 3.
   
   public static String thirdNestedQuantifier ( int integerArray [ ] ) {
   
      // Use two nested for loops that will find at least one x and one 
      // y in the domain such that ( x + y ) is odd or x is
      // divisible by 3. If one combination is found, return true, else
      // false. 
      
      for ( int x = 0; x < integerArray.length; x++ ) {
      
         for ( int y = 0; y < integerArray.length; y++ ) {
         
            if ( ( ( integerArray[ x ] + integerArray[ y ] ) % 2 != 0 ) || ( integerArray[ x ] % 3 == 0 ) ) 
               
               return "True"; 
         
         } // end inner for      
      
      } // end outer for
      
      return "False";   
   
   } // end thirdNestedQuantifier method.
   
   // Implementation of the fourthNestedQuantifier method.
   
   // For all integers x and y in the domain, (x + y) is odd or 
   // x is divisible by 3.
   
   public static String fourthNestedQuantifier ( int integerArray [ ] ) {
   
      // Use two nested for loops and an a if statement that check 
      // if all possible combinations of integers x and y
      // make P(x,y) true.
         
      for ( int x = 0; x < integerArray.length; x++ ) {
      
         for ( int y = 0; y < integerArray.length; y++ ) {
         
            if ( !( ( ( integerArray[ x ] + integerArray[ y ] ) % 2 != 0 ) || ( integerArray[ x ] % 3 == 0 ) ) ) 
            
               return "False";        
         
         } // end inner for
     
      } // end outer for
      
      return "True";   
 
   } // end fourthNestedQuantifier method.
   
   // Main method.

   public static void main ( String args [ ] ) {
   
      // Declare and inizialize the scan object and an integer 
      // array to store the user's ten integers.
      
      Scanner scan = new Scanner ( System.in );
      
      int tenDifferentIntegers [ ] = new int [ 10 ];
        
      // Prompt the user to input ten different integers, then store each 
      // one of them into the integer array.
      
      System.out.println( "Please Enter 10 DIFFERENT (ie. NOT repeating) integers:" );
      
      for ( int i = 0; i < tenDifferentIntegers.length; i = i + 1 ) {
      
         tenDifferentIntegers[ i ] = scan.nextInt( );     
      
      } // end for
      
      System.out.println( "For the domain D which you entered:" );
      
      System.out.println( "(a) is " + firstNestedQuantifier ( tenDifferentIntegers ) );
      System.out.println( "(b) is " + secondNestedQuantifier( tenDifferentIntegers ) );
      System.out.println( "(c) is " + thirdNestedQuantifier( tenDifferentIntegers ) );
      System.out.println( "(d) is " + fourthNestedQuantifier( tenDifferentIntegers ) );
      
      // Find a domain D1 that will make the first nested quantifier false
      // while second one true.
      
      final int D1 [ ] = { 1, 3, 5, 7, 11, 13, 17, 19, 23, 25 };
      
      System.out.println( "D1 = { 1, 3, 5, 7, 11, 13, 17, 19, 23, 25 } makes statement (a) " + firstNestedQuantifier( D1 ) + 
      
      " and (b) " + secondNestedQuantifier( D1 ) + "." );
      
   } // end main method
   
} // end class