/*
Hi-Lo Game
By Harry van der Veen
Made on 23/05/19

This is a gambling game where the user sets their wager, and guesses if
a generated number will be high or low
There is also a secret mode that will skew the probabilities
 */

package hi.lo.game;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Hi_Lo_Game extends javax.swing.JFrame {

    public Hi_Lo_Game() {
        initComponents();
        numberspambutton.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        predictiongroup = new javax.swing.ButtonGroup();
        titlelabel = new javax.swing.JLabel();
        enternamelabel = new javax.swing.JLabel();
        nameinput = new javax.swing.JTextField();
        nameoutput = new javax.swing.JLabel();
        namebutton = new javax.swing.JButton();
        ruleslabel = new javax.swing.JLabel();
        betlabel = new javax.swing.JLabel();
        betinput = new javax.swing.JTextField();
        highbet = new javax.swing.JRadioButton();
        lowbet = new javax.swing.JRadioButton();
        predictionlabel = new javax.swing.JLabel();
        submitwagerbutton = new javax.swing.JButton();
        output = new javax.swing.JLabel();
        pointcounter = new javax.swing.JLabel();
        playagainbutton = new javax.swing.JButton();
        numberspambutton = new javax.swing.JButton();
        numberoutput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titlelabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        titlelabel.setText("Hi-Lo");
        titlelabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                titlelabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                titlelabelMouseExited(evt);
            }
        });

        enternamelabel.setText("Enter Name:");

        nameoutput.setText("Hello: ");

        namebutton.setText("Submit User Name");
        namebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namebuttonActionPerformed(evt);
            }
        });

        ruleslabel.setText("RULES: The numbers 1 - 6 are low, the numbers 8 - 13 are high, 7 is neither");

        betlabel.setText("Enter Bet:");

        predictiongroup.add(highbet);
        highbet.setText("High");

        predictiongroup.add(lowbet);
        lowbet.setText("Low");

        predictionlabel.setText("Choose Prediction:");

        submitwagerbutton.setText("Submit Wager");
        submitwagerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitwagerbuttonActionPerformed(evt);
            }
        });

        pointcounter.setText("Current Points: 1000");

        playagainbutton.setText("Play Again");
        playagainbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playagainbuttonActionPerformed(evt);
            }
        });

        numberspambutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberspambuttonActionPerformed(evt);
            }
        });

        numberoutput.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(titlelabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(numberspambutton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pointcounter)
                                    .addComponent(ruleslabel)
                                    .addComponent(nameoutput)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(enternamelabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nameinput, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(namebutton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(betlabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addComponent(predictionlabel))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(betinput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(highbet)
                                                    .addComponent(lowbet))
                                                .addGap(52, 52, 52)
                                                .addComponent(submitwagerbutton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(numberoutput, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 25, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(playagainbutton)
                                .addGap(15, 15, 15)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titlelabel)
                    .addComponent(numberspambutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enternamelabel)
                    .addComponent(nameinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namebutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameoutput)
                .addGap(29, 29, 29)
                .addComponent(ruleslabel)
                .addGap(18, 18, 18)
                .addComponent(predictionlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(highbet)
                                    .addComponent(betinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(betlabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lowbet))
                            .addComponent(numberoutput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(pointcounter))
                    .addComponent(submitwagerbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playagainbutton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    boolean real = false;
    int points = 1000,
        timesplayed = 0,
        difficultylvl = 0;   

    private void namebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namebuttonActionPerformed

        nameoutput.setText("Hello: Please Enter Full Name!!!"); //preloading the screen with an error statment in case the user inputs a name that cannot be converted
        
        String name = nameinput.getText().toLowerCase(),    //collects the lower case version of the name
               username;    //creating other variables
        int lastnamestart;
        String [] animals = {"dog", "cat", "zebra", "horse", "bird", "fish", "monkey", "lion"};    //just a list of animals for the username
        
        lastnamestart = name.indexOf(" ");  //this will locate the first occurance of a "space" and return the index
        name = name.replaceAll("[^a-zA-Z ]", "").replaceAll("\\s", "");  //this will replace all puncuation and spaces with "nothing"
        username = name.substring(lastnamestart,lastnamestart + 4);  //this will take four letters after the fisrt space in the name (hopefully the last name)
        username += name.charAt(0) + animals[((int)Math.ceil(Math.random() * 8)) - 1]; //adding the first letter of the first name as well as a random animal from the list above
        
        nameoutput.setText("Hello: " + username);   //printing the final username
    }//GEN-LAST:event_namebuttonActionPerformed

    private void submitwagerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitwagerbuttonActionPerformed
            if (points == 0){   //if the player has no points, the program will tell them and refuse to continue playing
                output.setText("No points! You Lose!");
                return; }

            try { //if the bet is not an integer (letters or decimals) the user will be told so
                int bet = Integer.parseInt(betinput.getText()); 
            }
            catch (NumberFormatException e){
                output.setText("Please enter Integer bet!!!");  
            }
        
        int bet = Integer.parseInt(betinput.getText()), //collecting the bet for real this time
            choice, //making variables for logic later
            number = 0;
        
            if (bet > points){  //the the bet is larger than the amount of points the user has, or if the bet is zero or negative, the user will be told to change their bet
                output.setText("Your bet is too high!!!");
                return; 
            }
            if (bet <= 0){
                output.setText("Your bet is too low!!!");
                return; 
            }
        
            if (highbet.isSelected()){  //assigning an integer value to the radio button selections (0 is low, 1 is high)
                choice = 1; 
            }
            else if (lowbet.isSelected()){
                choice = 0; 
            } 
            else{   //if nothing is selected the user will be told to chose a button
                output.setText("<html>Please choose a \"High\" or \"Low\" bet!!!</html>");
                return; 
            }
        
        if (real == false){ // "real" is the standard mode changed by a secret
            
            number = (int)Math.ceil(Math.random() * 13);    //a random number from one to 13 is chosen 
            
            results(number, choice, bet);   //a method to determine if the user won is used
        }
        else{    //if the secret mode has been turned on this new set of instructions gets executed
            
            /*
            In this mode, the likelyhood of winning is first guaranteed to lull the user into betting higher and higher
            until the probability of losing begins to increase the more times the user plays.  The  chances of winning
            will never be zero but it will be effectively impossible to win after a point
            */
            ArrayList <Integer> outcomes = new ArrayList(); //An arraylist for random numbers is created
            
            timesplayed++;  //the number of plays is increatmented
            
            if (timesplayed % 5 == 0){  //every 5 plays will increment the difficulty counter wich lowers chances of winning
                difficultylvl++;    
            }
            
            for (int i = 0; i < difficultylvl; i++){    //this loop will happen once for every difficulty level, at the begining the diificulty is zero, so the loop will not even happen and the user has a guaranteed win
                number = (int)Math.ceil(((int)Math.ceil(Math.random() * 65) + (int)Math.ceil(Math.random() * 65)) / 10);    //this will still give a number between 1 and 13, but will a probability curve that makes 7 a very likely number
                outcomes.add(number);   //adding the random number to the arraylist
                number = outcomes.get(0);   //the number will be whatever the first "roll" was
            }

            if (outcomes.contains(7) == true){  //if any of the other "rolls" were a seven, the number becomes 7
                number = 7; 
            }

            results(number, choice, bet);   //a method to determine if the user won is used again
        }
    }//GEN-LAST:event_submitwagerbuttonActionPerformed

    private void playagainbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playagainbuttonActionPerformed
        //if the reset button is pushed, all values will be returned to their staring conditions
        points = 1000; 
        timesplayed = 0;
        difficultylvl = 0;
        pointcounter.setText("Current Points: " + points);
        output.setText("");
        numberoutput.setText("");
    }//GEN-LAST:event_playagainbuttonActionPerformed

    boolean in; //this will be used to access the secret mode
    private void titlelabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlelabelMouseEntered
        /*
        If the user moves the mouse over the title for 5 seconds, the second mode will toggle on or off
        */
        in = true;
        Timer wait = new Timer(); 
        wait.schedule(new TimerTask(){  //A timer will wait 5 seconds to perform the mode swap
            @Override
            public void run() {
                if (in == true){
                    real = !real;   //changing the mode
                    playagainbutton.doClick();  //reseting stats to begin new mode (and to stop user from abusing the guaranteed wins at the start)
                    if (!real){
                        output.setText("Harsh Reality Deactivated");    //telling the user what mode is on
                    }
                    else{
                        output.setText("Harsh Reality Activated");  
                    }
                }      
            }
        }, 5000);    
    }//GEN-LAST:event_titlelabelMouseEntered

    double clicks = 0,
        slow = 1.3725;  //this is the multiplier by which the time to change the number increases
    private void numberspambuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberspambuttonActionPerformed
        numberoutput.setText(Integer.toString((int)Math.ceil(Math.random() * 13))); //changing the displayed number to a random one from 1 to 13
        clicks++;
            if (clicks != 15){  //this will loop 15 times
                Timer numberspam = new Timer(); 
                numberspam.schedule(new TimerTask(){
                    @Override
                    public void run() {
                    numberspambutton.doClick();
                    }
                }, (long) (5 * Math.pow(slow, clicks)));    //the process will repeat slower and slower as the number of times to loop has been completed increases
            }
            else{
                clicks = 0; //at the end the clicks are set to zero and the loop is broken
            }
    }//GEN-LAST:event_numberspambuttonActionPerformed

    private void titlelabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlelabelMouseExited
        in = false; //if the user moves the mouse off of the label, this will abort the mode change
    }//GEN-LAST:event_titlelabelMouseExited

    private void results(int number, int choice, int bet){
                
        numberspambutton.doClick(); //triggering the "animation"
        
        Timer wait = new Timer(); 
                
        wait.schedule(new TimerTask(){
            @Override
            public void run() {
                output.setText("The number was " + number + ", ");  //printing the number
                numberoutput.setText(Integer.toString(number));
                if (number == 0){   //the only way to get a "0" is during the guaranteed wins in the second mode, but "0" is not an official option, so a special case is needed
                    points += bet;
                    int newNumber = (int)Math.ceil(Math.random() * 6);
                    if (choice == 0){
                        output.setText("The number was " + newNumber + ", You Win");  //generating a fake win number and awarding points
                        numberoutput.setText(Integer.toString(newNumber));
                    }
                    else{
                        output.setText("The number was " + (newNumber + 7) + ", You Win");
                        numberoutput.setText(Integer.toString(newNumber + 7));
                    } 
                }
                else if ((number < 7 && choice == 0) || (number > 7 && choice == 1)){   //if the number is high and the user guessed high, they win and vice versa
                    points += bet;
                    output.setText(output.getText() + "You win");   
                }
                else{
                    points -= bet;
                    output.setText(output.getText() + "You lose");  
                }
                pointcounter.setText("Current Points: " + points);  //updating the points
            }
        }, (long) 3292.80732538); //this is exactly how long it will take the number spam to finish in a way where this method prints its number as if it is next in the sequence
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Hi_Lo_Game().setVisible(true);
        });    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField betinput;
    private javax.swing.JLabel betlabel;
    private javax.swing.JLabel enternamelabel;
    private javax.swing.JRadioButton highbet;
    private javax.swing.JRadioButton lowbet;
    private javax.swing.JButton namebutton;
    private javax.swing.JTextField nameinput;
    private javax.swing.JLabel nameoutput;
    private javax.swing.JLabel numberoutput;
    private javax.swing.JButton numberspambutton;
    private javax.swing.JLabel output;
    private javax.swing.JButton playagainbutton;
    private javax.swing.JLabel pointcounter;
    private javax.swing.ButtonGroup predictiongroup;
    private javax.swing.JLabel predictionlabel;
    private javax.swing.JLabel ruleslabel;
    private javax.swing.JButton submitwagerbutton;
    private javax.swing.JLabel titlelabel;
    // End of variables declaration//GEN-END:variables
}
