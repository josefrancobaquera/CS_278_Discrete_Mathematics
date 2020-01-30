// CS-278
// Lab8.java
// Lab Section: M01
// Written by: Jose Franco Baquera
// October 10, 2017
// Purpose of the program: The purpose of the program is to
// print the DNF and/or CNF from a truth table in which 
// the compound proposition value is entered by the user.   
// Input: The truth value of eight compound propositions.
// Output: The DNF and/or CNF of the truth tables.

import java.util.Scanner;

public class Lab8 {

   // Implementation of the disjunctive method.
   // The method is called if a T (true) value was entered
   // by the user. 

   public static String disjunctive ( int w, int x, int y ) {
   
      // Make an array with the values of the three propositional variables.
   
      int DNFArray [ ] = { w, x, y };
      
      String DNFString [ ] = { "p", "q", "r" };
   
      String answer = "";
      
      // Go through the entire array. If the value is 1 (ie. true),
      // then only concatinate the propositional variable.
      // If its a 0, then concatinate a propositional variable with
      // a negation.
      
      for ( int index = 0; index < DNFArray.length; index++ ) {
      
         if ( DNFArray [ index ] == 1 ) {
         
            answer = answer + "" + DNFString [ index ];         
         
         } // end if.
         
         else {
         
            answer = answer + "" + DNFString [ index ] + "'";

         } // end else.
        
      } // end for.
      
      // Return answer.
   
      return answer + "+";  
   
   } // end disjunctive.  
   
   // Implementation of the conjunctive method.
   // The method is called if a F (false) value was entered
   // by the user. 
   
   public static String conjunctive ( int e, int f, int g ) {
   
      // Make an array with the values of the three propositional variables.
   
      String answer = "";
      
      int CNFArray [ ] = { e, f, g };
      
      String CNFString [ ] = { "p", "q", "r" };
      
      // Go through the entire array. If the value is 0 (ie. false),
      // then only concatinate the propositional variable.
      // If its a 1, then concatinate a propositional variable with
      // a negation.
      
      for ( int index = 0; index < CNFArray.length; index++ ) {
      
         if ( CNFArray [ index ] == 0 ) {
         
            answer = answer + "" + CNFString [ index ] + "+";         
         
         } // end if.
         
         else {
         
            answer = answer + "" + CNFString [ index ] + "'" + "+";

         } // end else.
        
      } // end for.
      
      // Eliminate the extra '+' character.
      
      answer = answer.substring( 0, answer.length( ) - 1 );  
      
      // Return the answer with paranthesis.    
      
      return "(" + answer + ")";   
   
   } // end conjunctive.

   public static void main ( String args [ ] ) {
   
      // Declare some variables, an array, a DNF/CNF counter, 
      // and a scanner.
      
      String DNF = "";
      
      String CNF = "";
      
      String tOrF [ ] = { "F", "T" };
            
      int rowArray [ ] = new int [ 4 ];
      
      int DNFCount = 0, CNFCount = 0;
      
      Scanner scan = new Scanner ( System.in );
      
      // Zero represents 'F' and one represents 'T'.
      
      System.out.println( "This program finds compund statements (in CNF and/or DNF)" );
      
      System.out.println( "that have a given truth table." );
      
      System.out.println( "The statements have 3 propositional vaiables: p, q, and r." );
      
      System.out.println( "Please enter truth values for each row of the truth table." );
      
      // Use a for loop that will go trough the entire values of the proposional variables
      // in a specific order.
      
      for ( int a = 1; a >= 0; a-- ) {
      
         for ( int b = 1; b >=0; b-- ) {
         
            for ( int c = 1; c >= 0; c-- ) {
            
               // Print a prompt for the user.         
            
               System.out.print( "p=" + tOrF[ a ] + ", q=" + tOrF [ b ] + ", r=" + tOrF [ c ] + ". Truth value is (T/F): " );      
               
               rowArray [ 0 ] = a;
               
               rowArray [ 1 ] = b;
               
               rowArray [ 2 ] = c;
               
               // Get the user input. If the charcter is a 'T', this means
               // its true (ie. int 1). If the character is a 'F', this means
               // its false (ie. int 0).
               
               if ( scan.next( ).toUpperCase( ).charAt( 0 ) == 'T' ) {
               
                  rowArray [ 3 ] = 1;
               
               } // end if.
               
               else {
               
                  rowArray [ 3 ] = 0;              
               
               } // end else.
               
               // If the user inputted a T, call the disjunctive method, else
               // the conjunctive method.              
               
               if ( rowArray [ 3 ] == 1 ) {
               
                  DNF = DNF + disjunctive ( rowArray [ 0 ], rowArray [ 1 ], rowArray [ 2 ] );
                                
                  DNFCount++;             
               
               } // end if.
               
               else {
               
                  CNF = CNF + "" + conjunctive ( rowArray [ 0 ], rowArray [ 1 ], rowArray [ 2 ] );

                  CNFCount++; 
                
               } // end else.
          
            } // end for.
         
         } // end for.
     
      } // end for.
      
      // If a user inputted one or more character 'T', then print out a prompt
      // plus the DNF terms.
     
      if ( DNFCount > 0 ) {
      
         System.out.println ( "\nDNF expression for the truth table is: " );
         
         System.out.println ( DNF.substring( 0, DNF.length( ) - 1 ) );      
      
      } // end if.
      
      // If a user inputted one or more character 'T', then print out a prompt
      // plus the DNF terms.
      
      if ( CNFCount > 0 ) {
      
         System.out.println( "\nCNF expression for the truth table is: " );
         
         System.out.println( CNF );     
      
      } // end if.
      
   } // end main.
   
} // end class.