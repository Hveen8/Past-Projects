/*
Square
By Harry van der Veen
Made on 04/18/19

This program will print numbers and their squares using loops and arrays
 */
package square;

import java.util.ArrayList;
import java.util.Collections;

public class Square {

    public static void main(String[] args) {
        ArrayList <Integer> squares = new ArrayList();  //creating the arraylist "squares" that is an array of integers
        
        for (int j = 0; j < 10; j++){   //this will add the squares of the numbers from 0 and 9 to the arraylist
            Collections.addAll(squares, j*j);
        }
    
        System.out.println("Squares ArrayList:\n******************");   //printing a title header
        
        for (int i = 0; i < squares.size(); i++){   //this will print every square along with it's index place. The array was set up so the index place is also the number that was squared
            System.out.println("Number: " + i + " Square: " + squares.get(i));
        }
    }
}