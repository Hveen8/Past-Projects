/*
Tic Tac Toe
Modified by Harry van der Veen
Made on 18/10/19

This is a modified version of Tic Tac Toe
 */

import java.awt.*;
import javax.swing.*;

public class TicTac extends JFrame {
    TicTacEvent tictac = new TicTacEvent(this);
     JPanel row1 = new JPanel();
     JButton[ ] [ ] boxes = new JButton [4][4];
     JButton play = new JButton ("Play"),
             reset = new JButton ("Reset");
     JTextArea blank1 = new JTextArea("\n\nX has won: 0 times\nO has won: 0 times"),
               blank2 = new JTextArea("\n\nTie game: 0 times");
     ImageIcon back = new ImageIcon("cat.jpeg ");
     
    //creating the interface
    public TicTac() {
        super ("Tic Tac Toe");
        setSize (700,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        int name = 0;
        String newname;
        
        /*
        making a grid (5x4) with the first 16
        items being buttons for the game. The rest
        are for info and game function buttons.
        Each button is numbered
        */
        GridLayout layout1 = new GridLayout(5, 4, 10, 10);
        row1.setLayout(layout1);
        //creating 16 numbered boxes
        for (int x=0; x<=3; x++){
            for (int y=0; y<=3; y++){
                name++;
                newname = Integer.toString(name);
                boxes[x][y] = new JButton(newname);
                boxes[x][y].setIcon(back);
                row1.add(boxes[x][y]);
            }
        }
        //creating game function buttons and info panels
        row1.add(blank1);
        row1.add(play);
        row1.add(reset);
        row1.add(blank2);
         Component add = add (row1);

         //putting action listeners on all buttons
         reset.addActionListener(tictac);
         play.addActionListener(tictac);
         
        for (int x=0; x<=3; x++){
            for (int y=0; y<=3; y++){
                boxes[x][y].addActionListener(tictac);
            }
        }

        setVisible(true);
    }
    
    public static void main(String[] arguments){
                    TicTac frame = new TicTac();
    }
}

