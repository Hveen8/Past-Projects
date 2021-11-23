package guessing_game;

/*
Guessing Game
By Harry van der Veen
Made on 03/19/19

This game will pick a random number from 1 to 100 and 
ask the player to gues it until it is guessed
 */

public class Guessing_Game extends javax.swing.JFrame {

    public Guessing_Game() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlelabel = new javax.swing.JLabel();
        instruction1 = new javax.swing.JLabel();
        instruction2 = new javax.swing.JLabel();
        instruction3 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        guessbutton = new javax.swing.JButton();
        hintbutton = new javax.swing.JToggleButton();
        outputresponse = new javax.swing.JLabel();
        outputhint = new javax.swing.JLabel();
        exitbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titlelabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titlelabel.setText("Guessing Game");

        instruction1.setText("How to Play:");

        instruction2.setText("Try to guess the number between");

        instruction3.setText("1 and 100 that I am thinking of");

        input.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N

        guessbutton.setText("Confirm Guess");
        guessbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessbuttonActionPerformed(evt);
            }
        });

        hintbutton.setText("Hints on/off");
        hintbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hintbuttonActionPerformed(evt);
            }
        });

        exitbutton.setText("Exit");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hintbutton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guessbutton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(outputresponse, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titlelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputhint, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(instruction2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(instruction1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(instruction3)
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitbutton)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hintbutton)
                    .addComponent(guessbutton))
                .addGap(18, 18, 18)
                .addComponent(outputresponse, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputhint, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(instruction1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instruction2)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instruction3)
                    .addComponent(exitbutton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int randomnumber = ((int)Math.ceil(Math.random() * 100)); //This line generates a random number between 1 and 100

    boolean hints = false; //This turns hints off at the beginning of the program
    
    private void guessbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessbuttonActionPerformed
        int guess = Integer.parseInt(input.getText()), differenceabs, difference;
        
        difference = randomnumber - guess; //this finds the difference between the number and the guess
        
        if (difference < 0){        //By seeing if the difference is positive or negative, we can deduce whether the guess is higher or lower thean the number
            outputresponse.setText("Too high");
        }
        else if (difference > 0){
            outputresponse.setText("Too low");
        }
        else {
            outputresponse.setText("You got it!");
        }
        
        if (hints){
            differenceabs = Math.abs(randomnumber - guess); //this uses the absolute difference to find out how far away the guess is from the number and depending on this gives a hint
        
            if (differenceabs == 0){
                outputhint.setText("");
            }
            else if (differenceabs <= 4){
                outputhint.setText("Boiling!!!");
            }
            else if(differenceabs <= 9){
                outputhint.setText("Hot!!");
            }
            else if (differenceabs <= 15){
                outputhint.setText("Warm!");
            }
             else if (differenceabs <= 25){
                outputhint.setText("Cool");
            }
             else if (differenceabs <= 50){
                outputhint.setText("Cold");
            }
             else{
                outputhint.setText("Freezing!");
            }
        }
        else{
            outputhint.setText(""); //If hints are off, this will clear the previous hint
        }
    }//GEN-LAST:event_guessbuttonActionPerformed

    private void hintbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hintbuttonActionPerformed
        hints = !hints; //This will toggle the hints funtion when the button is pressed
    }//GEN-LAST:event_hintbuttonActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitbuttonActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guessing_Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbutton;
    private javax.swing.JButton guessbutton;
    private javax.swing.JToggleButton hintbutton;
    private javax.swing.JTextField input;
    private javax.swing.JLabel instruction1;
    private javax.swing.JLabel instruction2;
    private javax.swing.JLabel instruction3;
    private javax.swing.JLabel outputhint;
    private javax.swing.JLabel outputresponse;
    private javax.swing.JLabel titlelabel;
    // End of variables declaration//GEN-END:variables
}
