/*
* Project: ArrayListTest.java
* Description: Playing with ArrayLists
* Name: Juyoung Lee
* Date: Oct 27, 2015
*/

import java.util.ArrayList;

public class ArrayListsTest {
  
  public static void printList( ArrayList a ) {
    
    System.out.println( "The list size is now: " + a.size() + " elements long." );
    for (int i=0; i<a.size(); i++ ) {
      System.out.print( a.get(i) + ", " );
    }
    
  } // End pringList()
  
  public static void main( String[] args ) {
  
  ArrayList<Interger> list = new ArrayList<Interger>();
  
  list.add( 3 );
  list.add( 6 );
  list.add( 9 );
  list.add( 13 );
  list.add( 16 );
  // [ 3, 6, 9, 13, 16 ] length: 5
  printList( list );
  
  list.remove( 1 );    //[3,9,13,16]
  list.remove( 3 );    //[3,6,13]
  list.add( 19 );      //[3,6,13,19]
  list.add( 23 );      //[3,6,13,19,23]
  list.add( 2,235 );   //[3,6,235,13,19,23]
  list.set( 0,17);     //[3,6,235,13,19,23]
  printList( list );
     
  } // End main method
  
  } // End class
