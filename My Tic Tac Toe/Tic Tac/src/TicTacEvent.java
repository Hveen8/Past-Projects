
import javax.swing.*;
import java.awt.event.*;

public class TicTacEvent implements ItemListener, ActionListener, Runnable {
    TicTac gui;
    Thread playing;
    ImageIcon a = new ImageIcon("x.jpg");
    ImageIcon b = new ImageIcon("o.jpg");
    ImageIcon back = new ImageIcon("cat.jpeg ");

    boolean justWon = false;
    int clicks = 0,
        xwin = 0,
        owin = 0,
        catwin = 0;
    int[][] check = new int[4][4];

    public TicTacEvent (TicTac in){
        gui = in;
        //initialize check array
        for (int row=0; row<=3; row++){
           for (int col=0; col<=3; col++){
               check[row][col]=0;
           }
       }
    }
    
    @Override
    public void actionPerformed (ActionEvent event) {
        String command = event.getActionCommand();
       //deciphering which button is pressed and activating the corresponding method
       if (command.equals("Play")) {
           startPlaying();
       }
       if (command.equals("Reset")) {
           restart();
       }
       if (justWon){    //if a game just ended, this will stop any more button presses
           gui.blank2.setText("\n\nStart New Game!");
           return;
       }
       if (command.equals("1")) {
           button(1);
       }
       if (command.equals("2")) {
           button(2);
       }
       if (command.equals("3")) {
           button(3);
       }
       if (command.equals("4")) {
           button(4);
       }
       if (command.equals("5")) {
           button(5);
       }
       if (command.equals("6")) {
           button(6);
       }
       if (command.equals("7")) {
           button(7);
       }
       if (command.equals("8")) {
           button(8);
       }
       if (command.equals("9")) {
           button(9);
       }
       if (command.equals("10")) {
           button(10);
       }
       if (command.equals("11")) {
           button(11);
       }
       if (command.equals("12")) {
           button(12);
       }
       if (command.equals("13")) {
           button(13);
       }
       if (command.equals("14")) {
           button(14);
       }
       if (command.equals("15")) {
           button(15);
       }
       if (command.equals("16")) {
           button(16);
       }
    }
    
    
    void button(int bttnNum) {
        double row,
               column;
        /*
        This will use the button number to identify
        the buttons postion in the 'check' array.
        We divide the button number by four and with some modification
        we get the row number. Then the row number can be used
        to identify which coloumn the button is in,
        and we can now do logic on that paricular button
        */
        row = Math.ceil((double)bttnNum / 4) - 1;
        column = bttnNum - (row * 4) - 1;

        clicks++; //incrementing 'clicks' counter to decide if x or o
        if ((clicks%2)==1){
            gui.boxes[(int)row][(int)column].setIcon(a); // set to x or y
            check[(int)row][(int)column] = 1;
        } 
        else {
            gui.boxes[(int)row][(int)column].setIcon(b); //check 2D array determines if x or o
            check[(int)row][(int)column] = 2;
        }
        winner();
    }

    void startPlaying() {
        playing = new Thread(this);
        playing.start();
        gui.play.setEnabled(false);
    }
    
    //reset all numbers and button states
    void restart(){    
        justWon = false;
        clicks = 0;
        //reinitializing the 'check' array
        for (int row=0; row<=3; row++){
           for (int col=0; col<=3; col++){
               check[row][col]=0;
           }
        }
        //reseting the card icons
        for (int x = 0; x <= 3; x++){
            for (int y = 0; y <= 3; y++){
                gui.boxes[x][y].setIcon(back);
            }
        }
    }

    void winner() {
        //checking all rows for matches
        for (int x=0; x<=3; x++){
            if ((check[x][0]==check[x][1])&&(check[x][0]==check[x][2])&&(check[x][0]==check[x][3])) {
                if (check[x][0]==1) {
                    JOptionPane.showMessageDialog(null, "X is the winner"); //find out who won based sign in winning line
                    xwin++;
                    justWon = true;
                } else if (check[x][0]==2){
                    JOptionPane.showMessageDialog(null, "O is the winner");
                    owin++;
                    justWon = true;
                }
            }
        }
        //checking all coloumns for matches
        for (int x=0; x<=3; x++){
            if ((check[0][x]==check[1][x])&&(check[0][x]==check[2][x])&&(check[0][x]==check[3][x])) {
                if (check[0][x]==1) {
                    JOptionPane.showMessageDialog(null, "X is the winner");
                    xwin++;
                    justWon = true;
                } else if (check[0][x]==2) {
                    JOptionPane.showMessageDialog(null, "O is the winner");
                    owin++;
                    justWon = true;
                }
            }
        }
        //checking for major TL-BR diagonal and minor MTR-MBL diagonal (T = Top, M = middle, B = bottom) 
        if (((check[0][0]==check[1][1])&&(check[0][0]==check[2][2])&&(check[0][0]==check[3][3]))||
                (check[0][2]==check[1][1])&&(check[0][2]==check[2][0])){
            if (check[1][1]==1) {
                JOptionPane.showMessageDialog(null, "X is the winner");
                xwin++;
                justWon = true;
            } else if (check[1][1]==2) {
                JOptionPane.showMessageDialog(null, "O is the winner");
                owin++;
                justWon = true;
            }
        }
        //checking for major TR-BL diagonal and minor MTL-MBR diagonal (T = Top, M = middle, B = bottom) 
        if (((check[0][3]==check[1][2])&&(check[0][3]==check[2][1])&&(check[0][3]==check[3][0]))||
                (check[0][1]==check[1][2])&&(check[0][1]==check[2][3])){
            if (check[1][2]==1) {
                JOptionPane.showMessageDialog(null, "X is the winner");
                xwin++;
                justWon = true;
            } else if (check[1][2]==2) {
                JOptionPane.showMessageDialog(null, "O is the winner");
                owin++;
                justWon = true;
            }
        }
        //checking for  minor MTL-MBR diagonal (T = Top, M = middle, B = bottom) 
        if ((check[1][0]==check[2][1])&&(check[1][0]==check[3][2])){
            if (check[2][1]==1) {
                JOptionPane.showMessageDialog(null, "X is the winner");
                xwin++;
                justWon = true;
            } else if (check[2][1]==2) {
                JOptionPane.showMessageDialog(null, "O is the winner");
                owin++;
                justWon = true;
            }
        }
        //checking for  minor MTL-MBR diagonal (T = Top, M = middle, B = bottom)
        if ((check[1][3]==check[2][2])&&(check[1][3]==check[3][1])){
            if (check[2][2]==1) {
                JOptionPane.showMessageDialog(null, "X is the winner");
                xwin++;
                justWon = true;
            } else if (check[2][2]==2) {
                JOptionPane.showMessageDialog(null, "O is the winner");
                owin++;
                justWon = true;
            }
        }
        
        //after the board is full and there are no wins, a tie game is called
        if (clicks==16) {
            JOptionPane.showMessageDialog(null, "The game is a tie");
            catwin++;
            justWon = true;
        }
        //printing the score
        gui.blank1.setText("\n\nX has won: " + xwin + " times\nO has won: " + owin + " times");
        gui.blank2.setText("\n\nTie game: " + catwin + " times");
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}