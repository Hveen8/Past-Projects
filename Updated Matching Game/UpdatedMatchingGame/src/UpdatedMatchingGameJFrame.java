/*
Matching Game
Updated by Harry van der Veen
Edits done on 10/13/19

This program uses arrays to simulate a matching game.
A grid of cards will be displayed and the user is to select 2 cards at a time
looking for matching cards.  The goal of this game is to see how quickly
the user can find all the matches.

The update does minor changes to the original program such as score counting
and the ability to play the game more than once
 */

import java.util.*;
import javax.swing.ImageIcon;

public class UpdatedMatchingGameJFrame extends javax.swing.JFrame {

    ArrayList <Integer> scores = new ArrayList();
    ArrayList <Integer> rankedScores = new ArrayList();
    ArrayList <String> cards = new ArrayList();
    ArrayList <String> set = new ArrayList();
    ImageIcon a = new ImageIcon("pixelbox1.jpg");
    ImageIcon b = new ImageIcon("pixelbox2.jpg");
    ImageIcon c = new ImageIcon("pixelbox3.jpg");
    ImageIcon d = new ImageIcon("pixelbox4.jpg");
    ImageIcon e = new ImageIcon("pixelbox5.jpg");
    ImageIcon f = new ImageIcon("pixelbox6.jpg");
    ImageIcon g = new ImageIcon("pixelbox7.jpg");
    ImageIcon h = new ImageIcon("pixelbox8.jpg");
    ImageIcon back = new ImageIcon("pixelbackbox.jpg");
    ImageIcon done = new ImageIcon("done.jpg");
    int count, 
        c1,
        c2,
        movesMade,
        gamesPlayed;
    int[] change = new int [16];
    boolean hardMode = false;
    
    public UpdatedMatchingGameJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTitle = new javax.swing.JLabel();
        card1 = new javax.swing.JButton();
        card2 = new javax.swing.JButton();
        card3 = new javax.swing.JButton();
        card4 = new javax.swing.JButton();
        card5 = new javax.swing.JButton();
        card6 = new javax.swing.JButton();
        card7 = new javax.swing.JButton();
        card8 = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        guessAgainButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        instructionField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        scoreField = new javax.swing.JTextArea();
        scoreLabel = new javax.swing.JLabel();
        clicksLabel = new javax.swing.JLabel();
        hardButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainTitle.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        mainTitle.setText("Matching Game");

        card1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Design\\Desktop\\pixelbackbox.jpg")); // NOI18N
        card1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card1MouseClicked(evt);
            }
        });

        card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbackbox.jpg"))); // NOI18N
        card2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card2MouseClicked(evt);
            }
        });

        card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbackbox.jpg"))); // NOI18N
        card3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card3MouseClicked(evt);
            }
        });

        card4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbackbox.jpg"))); // NOI18N
        card4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card4MouseClicked(evt);
            }
        });

        card5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbackbox.jpg"))); // NOI18N
        card5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card5MouseClicked(evt);
            }
        });

        card6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbackbox.jpg"))); // NOI18N
        card6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card6MouseClicked(evt);
            }
        });

        card7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbackbox.jpg"))); // NOI18N
        card7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card7MouseClicked(evt);
            }
        });

        card8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbackbox.jpg"))); // NOI18N
        card8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card8MouseClicked(evt);
            }
        });

        playButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        playButton.setText("Play");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        guessAgainButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        guessAgainButton.setText("Guess Again");
        guessAgainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessAgainButtonActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        instructionField.setEditable(false);
        instructionField.setBackground(new java.awt.Color(255, 255, 255));
        instructionField.setText("Click the Play button to start.  Make sure to click Guess Again after each guess.");

        scoreField.setEditable(false);
        scoreField.setColumns(20);
        scoreField.setRows(5);
        jScrollPane1.setViewportView(scoreField);

        scoreLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        scoreLabel.setText("Scores:");

        clicksLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        clicksLabel.setText("Clicks: ");

        hardButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        hardButton.setText("<html>HARD<p>MODE</html>");
        hardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hardButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(clicksLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(mainTitle))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(instructionField, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(playButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(guessAgainButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(exitButton))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(card7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(card8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(card6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(63, 63, 63)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(scoreLabel)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainTitle)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scoreLabel)
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(hardButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clicksLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(playButton)
                            .addComponent(guessAgainButton)
                            .addComponent(exitButton))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instructionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        //reseting visual ques
        card1.setIcon(back);
        card2.setIcon(back);
        card3.setIcon(back);
        card4.setIcon(back);
        card5.setIcon(back);
        card6.setIcon(back);
        card7.setIcon(back);
        card8.setIcon(back);
        instructionField.setText("Click the Play button to start.  Make sure to click Guess Again after each guess.");
        
        c1 = 0;
        c2 = 0;
        movesMade = 0;
        
        //erasing the elements of all arrays
        set.clear();
        cards.clear();

        //setting the change array to all one's
        for (int i = 0; i <= 7; i++){
            change[i] = 1;
        }
        
        //Creating an array of a set of a number repeated twice from zeroto seven
        String temp;
        for (int n = 0; n <= 3; n++){
            for (int y = 1; y <= 2; y++) {
                temp = Integer.toString(n);
                set.add(temp);
            }
        }
  
        //mixing the number sets into a random order
        for (int x = 0; x <= 7; x++){
            double index = Math.floor(Math.random()*(8 - x));
            int index1 = (int) index;
            cards.add(set.get(index1));
            set.remove(set.get(index1));      
        }

        gamesPlayed++;
    }//GEN-LAST:event_playButtonActionPerformed

    private void guessAgainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessAgainButtonActionPerformed
        count = 0;
        if (c1 == c2) {
            for (int i = 1; i<=2; i++) {    //going through each element, and changing flaged buttons to 'done'
                if (change[0]==0) {
                    card1.setIcon (done);
                    change[0]=2;
                } else if (change[1] == 0){
                    card2.setIcon (done);
                    change[1]=2;
                } else if (change[2] == 0){
                    card3.setIcon (done);
                    change[2]=2;
                } else if (change[3] == 0){
                    card4.setIcon (done);
                    change[3]=2;
                } else if (change[4] == 0){
                    card5.setIcon (done);
                    change[4]=2;
                } else if (change[5] == 0){
                    card6.setIcon (done);
                    change[5]=2;
                } else if (change[6] == 0){
                    card7.setIcon (done);
                    change[6]=2;
                } else if (change[7] == 0){
                    card8.setIcon (done);
                    change[7]=2;
                }
            }
        } 
        else{
            for (int i = 1; i <= 2; i++) {  //reseting icons if there is no match
                if (change[0] == 0) {
                    card1.setIcon(back);
                    change[0] = 1;
                } else if (change[1] == 0) {
                    card2.setIcon(back);
                    change[1] = 1;
                }else if (change[2] == 0) {
                    card3.setIcon(back);
                    change[2] = 1;
                }else if (change[3] == 0) {
                    card4.setIcon(back);
                    change[3] = 1;
                }else if (change[4] == 0) {
                    card5.setIcon(back);
                    change[4] = 1;
                }else if (change[5] == 0) {
                    card6.setIcon(back);
                    change[5] = 1;
                }else if (change[6] == 0) {
                    card7.setIcon(back);
                    change[6] = 1;
                }else if (change[7] == 0) {
                    card8.setIcon(back);
                    change[7] = 1;
                }
            }
        }
        
        winCondition(); //checking if the player has won
    }//GEN-LAST:event_guessAgainButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void card1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card1MouseClicked
        //increamenting the moves made counter
        movesMade++;
        clicksLabel.setText("Clicks: " + movesMade);
        
        String temp = cards.get(0);
        
        if (hardMode){  //this will switch between two set of icon sets for the game
            switch (temp) { //depending on what random sequence was generated in 'cards' the icon associated to every button will change
                case "0":
                    card1.setIcon(a);
                    break;
                case "1":
                    card1.setIcon(b);
                    break;
                case "2":
                    card1.setIcon(c);
                    break;
                case "3":
                    card1.setIcon(d);
                    break;
                default:
                    break;
            }
        }
        else{
            switch (temp) {
                case "0":
                    card1.setIcon(e);
                    break;
                case "1":
                    card1.setIcon(f);
                    break;
                case "2":
                    card1.setIcon(g);
                    break;
                case "3":
                    card1.setIcon(h);
                    break;
                default:
                    break;
            }
        }
        
        count++;    //storing the chosen 'picture' for comparison
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[0] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[0] = 0;
        }
    }//GEN-LAST:event_card1MouseClicked

    private void card2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card2MouseClicked
        movesMade++;
        clicksLabel.setText("Clicks: " + movesMade);
        
        String temp = cards.get(1);
        
        if (hardMode){
            switch (temp) {
                case "0":
                    card2.setIcon(a);
                    break;
                case "1":
                    card2.setIcon(b);
                    break;
                case "2":
                    card2.setIcon(c);
                    break;
                case "3":
                    card2.setIcon(d);
                    break;
                default:
                    break;
            }
        }
        else{
            switch (temp) {
                case "0":
                    card2.setIcon(e);
                    break;
                case "1":
                    card2.setIcon(f);
                    break;
                case "2":
                    card2.setIcon(g);
                    break;
                case "3":
                    card2.setIcon(h);
                    break;
                default:
                    break;
            }
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[1] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[1] = 0;
        }
    }//GEN-LAST:event_card2MouseClicked

    private void card3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card3MouseClicked
        movesMade++;
        clicksLabel.setText("Clicks: " + movesMade);
        
        String temp = cards.get(2);
        
        if (hardMode){
            switch (temp) {
                case "0":
                    card3.setIcon(a);
                    break;
                case "1":
                    card3.setIcon(b);
                    break;
                case "2":
                    card3.setIcon(c);
                    break;
                case "3":
                    card3.setIcon(d);
                    break;
                default:
                    break;
            }
        }
        else{
            switch (temp) {
                case "0":
                    card3.setIcon(e);
                    break;
                case "1":
                    card3.setIcon(f);
                    break;
                case "2":
                    card3.setIcon(g);
                    break;
                case "3":
                    card3.setIcon(h);
                    break;
                default:
                    break;
            }
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[2] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[2] = 0;
        }
    }//GEN-LAST:event_card3MouseClicked

    private void card4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card4MouseClicked
        movesMade++;
        clicksLabel.setText("Clicks: " + movesMade);
        
        String temp = cards.get(3);
        
        if (hardMode){
            switch (temp) {
                case "0":
                    card4.setIcon(a);
                    break;
                case "1":
                    card4.setIcon(b);
                    break;
                case "2":
                    card4.setIcon(c);
                    break;
                case "3":
                    card4.setIcon(d);
                    break;
                default:
                    break;
            }
        }
        else{
            switch (temp) {
                case "0":
                    card4.setIcon(e);
                    break;
                case "1":
                    card4.setIcon(f);
                    break;
                case "2":
                    card4.setIcon(g);
                    break;
                case "3":
                    card4.setIcon(h);
                    break;
                default:
                    break;
            }
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[3] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[3] = 0;
        }
    }//GEN-LAST:event_card4MouseClicked

    private void card5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card5MouseClicked
        movesMade++;
        clicksLabel.setText("Clicks: " + movesMade);
        
        String temp = cards.get(4);
        
        if (hardMode) {
            switch (temp) {
                case "0":
                    card5.setIcon(a);
                    break;
                case "1":
                    card5.setIcon(b);
                    break;
                case "2":
                    card5.setIcon(c);
                    break;
                case "3":
                    card5.setIcon(d);
                    break;
                default:
                    break;
            }
        }
        else{
            switch (temp) {
                case "0":
                    card5.setIcon(e);
                    break;
                case "1":
                    card5.setIcon(f);
                    break;
                case "2":
                    card5.setIcon(g);
                    break;
                case "3":
                    card5.setIcon(h);
                    break;
                default:
                    break;
            }
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[4] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[4] = 0;
        }
    }//GEN-LAST:event_card5MouseClicked

    private void card6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card6MouseClicked
        movesMade++;
        clicksLabel.setText("Clicks: " + movesMade);
        
        String temp = cards.get(5);
        
        if (hardMode){
            switch (temp) {
                case "0":
                    card6.setIcon(a);
                    break;
                case "1":
                    card6.setIcon(b);
                    break;
                case "2":
                    card6.setIcon(c);
                    break;
                case "3":
                    card6.setIcon(d);
                    break;
                default:
                    break;
            }
        }
        else{
            switch (temp) {
                case "0":
                    card6.setIcon(e);
                    break;
                case "1":
                    card6.setIcon(f);
                    break;
                case "2":
                    card6.setIcon(g);
                    break;
                case "3":
                    card6.setIcon(h);
                    break;
                default:
                    break;
            }
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[5] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[5] = 0;
        }
    }//GEN-LAST:event_card6MouseClicked

    private void card7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card7MouseClicked
        movesMade++;
        clicksLabel.setText("Clicks: " + movesMade);
        
        String temp = cards.get(6);
        
        if (hardMode){
            switch (temp) {
                case "0":
                    card7.setIcon(a);
                    break;
                case "1":
                    card7.setIcon(b);
                    break;
                case "2":
                    card7.setIcon(c);
                    break;
                case "3":
                    card7.setIcon(d);
                    break;
                default:
                    break;
            }
        }
        else{
            switch (temp) {
                case "0":
                    card7.setIcon(e);
                    break;
                case "1":
                    card7.setIcon(f);
                    break;
                case "2":
                    card7.setIcon(g);
                    break;
                case "3":
                    card7.setIcon(h);
                    break;
                default:
                    break;
            }
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[6] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[6] = 0;
        }
    }//GEN-LAST:event_card7MouseClicked

    private void card8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card8MouseClicked
        movesMade++;
        clicksLabel.setText("Clicks: " + movesMade);
        
        String temp = cards.get(7);
        
        if (hardMode){
            switch (temp) {
                case "0":
                    card8.setIcon(a);
                    break;
                case "1":
                    card8.setIcon(b);
                    break;
                case "2":
                    card8.setIcon(c);
                    break;
                case "3":
                    card8.setIcon(d);
                    break;
                default:
                    break;
            }
        }
        else{
            switch (temp) {
                case "0":
                    card8.setIcon(e);
                    break;
                case "1":
                    card8.setIcon(f);
                    break;
                case "2":
                    card8.setIcon(g);
                    break;
                case "3":
                    card8.setIcon(h);
                    break;
                default:
                    break;
            }
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[7] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[7] = 0;
        }
    }//GEN-LAST:event_card8MouseClicked

    private void hardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardButtonActionPerformed
        hardMode = !hardMode; //switching 'hard mode' on and off
    }//GEN-LAST:event_hardButtonActionPerformed

    public void winCondition(){
        
        int cardsLeft = 8;
        
        //if any card isn't matched, this will override the win condition
        for (int n : change){
            if (n == 2){
                cardsLeft-- ;
            }
        }
        
        if (cardsLeft == 0){
            instructionField.setText("Congratulations!");
            updateScore();
        }
    }
    
    public void updateScore(){
        //adding the moves made to separate arrays
        scores.add(movesMade);
        rankedScores.add(movesMade);
        
        //sorting this array to have the lowest number first
        Collections.sort(rankedScores);
        
        //showing the best score
        scoreField.setText("Best Score: " + rankedScores.get(0) + "\n\nAll Games:\n");
        
        //showing the scores for each game
        for (int i = 0; i < gamesPlayed; i++){
            scoreField.append("Game " + (i + 1) + " Score: " + scores.get(i) + "\n");
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new UpdatedMatchingGameJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton card1;
    private javax.swing.JButton card2;
    private javax.swing.JButton card3;
    private javax.swing.JButton card4;
    private javax.swing.JButton card5;
    private javax.swing.JButton card6;
    private javax.swing.JButton card7;
    private javax.swing.JButton card8;
    private javax.swing.JLabel clicksLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton guessAgainButton;
    private javax.swing.JToggleButton hardButton;
    private javax.swing.JTextField instructionField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mainTitle;
    private javax.swing.JButton playButton;
    private javax.swing.JTextArea scoreField;
    private javax.swing.JLabel scoreLabel;
    // End of variables declaration//GEN-END:variables
}
