// CS-278
// TruthTable.java
// Lab Section: M01
// Written by: Jose Franco Baquera
// August 22, 2017
// Purpose of the program: The purpose of the program is to
// print all the possible combinations of the last column 
// of all truth tables. The first three columns are static.  
// Input: None
// Output: 256 Truth Tables with all possible combinations of 
// the proposition column.  

public class TruthTable {
   
   public static void main ( String args [] ) {
   
      // Make eight Strings that contain the first three columns. Make them 'final'
      // since they will never change/remain static.
      
      final String FIRST_ROW = "F F F";
      final String SECOND_ROW = "F F T";
      final String THIRD_ROW = "F T F";
      final String FOURTH_ROW = "F T T";
      final String FIFTH_ROW = "T F F";
      final String SIXTH_ROW = "T F T";
      final String SEVENTH_ROW = "T T F";
      final String EIGTH_ROW = "T T T";
      
      // Declare a counting variable that will keep track the number of tables printed. The 
      // first table printed will be "Table 1", so inizilize the variable to 1.
      
      int count = 1;
      
      // Declare an array and use eight nested loops to find all possible combinations
      // of the last column in the truth tables.
      
      int arrayCombinations [] = new int [ 8 ];
            
      for ( int a = 0; a <= 1; a = a + 1 ){
      
         for ( int b = 0; b <= 1; b = b + 1 ) {
         
            for ( int c = 0; c <= 1; c = c + 1 ) {
            
               for ( int d = 0; d <= 1; d = d + 1 ){
               
                  for ( int e = 0; e <= 1; e = e + 1 ) { 
                  
                     for ( int f = 0; f <= 1; f = f + 1 ) {
                     
                        for ( int g = 0; g <= 1; g = g + 1 ) {
                        
                           for ( int h = 0; h <= 1; h = h + 1 ) {
                              
                              System.out.println( "Truth Table: " + count );
                              System.out.println( "p q r proposition" );
                              System.out.println( "-----------------" );
    
                              arrayCombinations[0] = a;
                              arrayCombinations[1] = b;
                              arrayCombinations[2] = c;
                              arrayCombinations[3] = d;
                              arrayCombinations[4] = e;
                              arrayCombinations[5] = f;
                              arrayCombinations[6] = g;
                              arrayCombinations[7] = h;  
                        
                              // Use if-else statements. 0's equal false, 1's equal true.
                              
                              if ( arrayCombinations[0] == 0 )
                                 
                                 System.out.println( FIRST_ROW + " F" );
                                    
                              else
                                 
                                 System.out.println( FIRST_ROW +" T" );  
                                    
                              if ( arrayCombinations[1] == 0 )
                                 
                                 System.out.println( SECOND_ROW + " F" );
                                    
                              else 
                                 
                                 System.out.println( SECOND_ROW +" T" );
                                    
                              if ( arrayCombinations[2] == 0 )
                                 
                                    System.out.println( THIRD_ROW + " F" );
                                    
                              else 
                                 
                                 System.out.println( THIRD_ROW +" T" );
                                    
                              if ( arrayCombinations[3] == 0 )
                                 
                                 System.out.println( FOURTH_ROW + " F" );
                                    
                              else 
                                 
                                 System.out.println( FOURTH_ROW +" T" );
                                    
                              if ( arrayCombinations[4] == 0 )
                                 
                                 System.out.println( FIFTH_ROW + " F" );
                                    
                              else 
                                 
                                 System.out.println( FIFTH_ROW +" T" );
                                    
                              if ( arrayCombinations[5] == 0 )
                                 
                                 System.out.println( SIXTH_ROW + " F" );
                                    
                              else 
                                 
                                 System.out.println( SIXTH_ROW +" T" );     
                                    
                              if ( arrayCombinations[6] == 0 )
                                 
                                 System.out.println( SEVENTH_ROW + " F" );
                                    
                              else 
                                 
                                 System.out.println( SEVENTH_ROW +" T" );
                                    
                              if ( arrayCombinations[7] == 0 )
                                 
                                 System.out.println( EIGTH_ROW + " F" );
                                    
                              else 
                                 
                                 System.out.println( EIGTH_ROW +" T" );
                                 
                              // Print a blank line to make tables easier to read. 
                              
                              System.out.println( );
                              
                              // Update counting variable.
                                 
                              count = count + 1;
                                 
                           } // end for 
                        
                        } // end for
            
                     } // end for
                        
                  } // end for
               
               } // end for
         
            } // end for 
      
         } // end for
         
      } // end for
     
   } // end main method
   
} // end class