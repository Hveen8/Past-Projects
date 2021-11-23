/*
 *Pizza Anyone
 *By Harry van der Veen
 *Made on 03/06/19


This program will output the price of a pizza of a 
particular inputed diameter
 */

import java.text.DecimalFormat;

public class Pizza_Anyone extends javax.swing.JFrame {

    public Pizza_Anyone() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        picturelabel = new javax.swing.JLabel();
        titlelabel = new javax.swing.JLabel();
        questionlabel = new javax.swing.JLabel();
        inputText = new javax.swing.JTextField();
        calcbutton = new javax.swing.JButton();
        outputText = new javax.swing.JLabel();
        exitbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setForeground(new java.awt.Color(255, 153, 0));

        picturelabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pizza.jpg"))); // NOI18N

        titlelabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        titlelabel.setForeground(new java.awt.Color(51, 51, 255));
        titlelabel.setText("Pizza Anyone?");

        questionlabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        questionlabel.setForeground(new java.awt.Color(0, 0, 153));
        questionlabel.setText("Please Enter Desired Pizza Diameter");

        inputText.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        inputText.setText("*Diameter in Inches");
        inputText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputTextMouseClicked(evt);
            }
        });
        inputText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputTextKeyTyped(evt);
            }
        });

        calcbutton.setText("Calculate Price");
        calcbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcbuttonActionPerformed(evt);
            }
        });

        outputText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        outputText.setForeground(new java.awt.Color(0, 0, 153));
        outputText.setText("           And Find Out the Cost!");

        exitbutton.setText("Exit");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titlelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(outputText, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(questionlabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(inputText, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(picturelabel)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(calcbutton)
                .addGap(693, 693, 693))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picturelabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(titlelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(questionlabel)
                .addGap(37, 37, 37)
                .addComponent(inputText, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(calcbutton)
                .addGap(49, 49, 49)
                .addComponent(outputText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    boolean typed = false; //This is created for later use
    
    //this block will calculate the cost for the pizza when the user clicks the "calculate" button
    private void calcbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcbuttonActionPerformed
        
        if (typed == false){    //This will check if anything has been typed into the box (the boolean "typed" is "false" until any action has been taken.
            outputText.setText("Please enter desired pizza diameter");
        }
        double lcost = 1.00, scost = 1.50, mcost, total; //making the values for labour cost, store cost, and cost for materials
        
        mcost = Double.parseDouble(inputText.getText())*0.50; //this will convert the string input from the text field into a double and multiply by 0.5 it to determine the materials cost
        total = lcost + scost + mcost;
        
        DecimalFormat money = new DecimalFormat("$#.00"); //this will make the output into proper money format
           
        if (typed == true){ 
            outputText.setText ("Your pizza will cost " + money.format(total));
        }
    }//GEN-LAST:event_calcbuttonActionPerformed

/*
*The next two blocks will delete the text in the text field for the user
*They do this using the boolean "typed."
*When the user clicks the box or begins to type, the blocks see that "typed"
is false and deletes the text, and then sets "typed" to true.
*This means that the first time an action is taken the text is deleted, but not
the text the user has inputed
*/
    
    private void inputTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTextKeyTyped
        if (typed == false){
            inputText.setText("");
        }   
        typed = true;
    }//GEN-LAST:event_inputTextKeyTyped
    private void inputTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputTextMouseClicked
         if (typed == false){
            inputText.setText("");
        }   
         typed = true;
    }//GEN-LAST:event_inputTextMouseClicked

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        System.exit(0); //this ends the program once the exit button is pressed
    }//GEN-LAST:event_exitbuttonActionPerformed


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
            java.util.logging.Logger.getLogger(Pizza_Anyone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pizza_Anyone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pizza_Anyone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pizza_Anyone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pizza_Anyone().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcbutton;
    private javax.swing.JButton exitbutton;
    private javax.swing.JTextField inputText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel outputText;
    private javax.swing.JLabel picturelabel;
    private javax.swing.JLabel questionlabel;
    private javax.swing.JLabel titlelabel;
    // End of variables declaration//GEN-END:variables
}
