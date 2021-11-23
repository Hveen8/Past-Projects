/*
 *Happy Birthday
 *By Harry van der Veen
 *Made on 03/04/19

This program will ask for name and birthdate and print
the results
 */

public class Happy_Birthday extends javax.swing.JFrame {

    public Happy_Birthday() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        happybirthdaylabel = new javax.swing.JLabel();
        namelabel = new javax.swing.JLabel();
        datelabel = new javax.swing.JLabel();
        entername = new javax.swing.JTextField();
        enterdate = new javax.swing.JTextField();
        okbutton = new javax.swing.JButton();
        picture = new javax.swing.JLabel();
        exitbutton = new javax.swing.JButton();
        output = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 102));
        setForeground(new java.awt.Color(255, 255, 51));

        happybirthdaylabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        happybirthdaylabel.setForeground(new java.awt.Color(0, 51, 204));
        happybirthdaylabel.setText("Happy Birthday!");

        namelabel.setText("Name:");

        datelabel.setText("Birthdate");

        entername.setText("Enter Name Here");
        entername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enternameMouseClicked(evt);
            }
        });
        entername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                enternameKeyTyped(evt);
            }
        });

        enterdate.setText("Enter Birthdate Here");
        enterdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterdateMouseClicked(evt);
            }
        });

        okbutton.setText("Ok");
        okbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbuttonActionPerformed(evt);
            }
        });

        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/50-happy-birthday-quotes-thumb.jpg"))); // NOI18N

        exitbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exitbutton.setText("exit");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });

        output.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(okbutton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(happybirthdaylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(datelabel)
                                    .addComponent(namelabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(entername, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(enterdate))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(picture)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(happybirthdaylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namelabel)
                            .addComponent(entername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(datelabel)
                            .addComponent(enterdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(okbutton)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      boolean named = false;
      boolean dated = false;
    
    /*This will use the name and date typed into the boxes and display a message
      using them when the "Ok" button is pressed */
    private void okbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbuttonActionPerformed
        String name, date;
        name = entername.getText();
        date = enterdate.getText();
        
        if (dated == false){
            output.setText("Please enter your birthdate!");
    }   if (named == false){
            output.setText("Please enter your name!");
    }   if (named == false & dated == false){
            output.setText("Please enter your name and birthdate!");
    }   if (named == true & dated == true){
            output.setText(name + "'s birthday is on " + date);
        }
    }//GEN-LAST:event_okbuttonActionPerformed

    
    //This will exit the program when the "exit" button is pressed
    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitbuttonActionPerformed

    //This will erase the initial text written in the name box
    private void enternameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enternameMouseClicked
        if (named == false) {
            entername.setText("");
        }
        named = true;
    }//GEN-LAST:event_enternameMouseClicked

    //This will erase initial text written in the date box
    private void enterdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterdateMouseClicked
        if (dated == false){
            enterdate.setText("");
        }
        dated = true;
    }//GEN-LAST:event_enterdateMouseClicked

    //This will erase the initial text written in the name box
    private void enternameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enternameKeyTyped
        if (named == false){
            entername.setText("");
        } 
        named = true;
    }//GEN-LAST:event_enternameKeyTyped

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Happy_Birthday.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Happy_Birthday.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Happy_Birthday.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Happy_Birthday.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Happy_Birthday().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel datelabel;
    private javax.swing.JTextField enterdate;
    private javax.swing.JTextField entername;
    private javax.swing.JButton exitbutton;
    private javax.swing.JLabel happybirthdaylabel;
    private javax.swing.JLabel namelabel;
    private javax.swing.JButton okbutton;
    private javax.swing.JLabel output;
    private javax.swing.JLabel picture;
    // End of variables declaration//GEN-END:variables
}
