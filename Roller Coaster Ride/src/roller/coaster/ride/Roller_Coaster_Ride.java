/*
Roller Coaster Ride
By Harry van der Veen
Made on 09/20/19

This program will determine if someone may go on a coaster
based on their height, and if they have back or heart trouble
 */
package roller.coaster.ride;

public class Roller_Coaster_Ride extends javax.swing.JFrame {

    public Roller_Coaster_Ride() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        instructionLabel1 = new javax.swing.JLabel();
        instructionLabel2 = new javax.swing.JLabel();
        instructionLabel3 = new javax.swing.JLabel();
        heightInput = new javax.swing.JTextField();
        heartInput = new javax.swing.JTextField();
        backInput = new javax.swing.JTextField();
        output = new javax.swing.JTextField();
        calculateButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleLabel.setText("RollerCoaster Ride");

        instructionLabel1.setText("Enter Height (cm)");

        instructionLabel2.setText("Back trouble? (Y/N)");

        instructionLabel3.setText("Heart trouble? (Y/N)");

        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(titleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(instructionLabel2)
                                    .addComponent(instructionLabel1)
                                    .addComponent(instructionLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(heightInput, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(heartInput, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(backInput, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(calculateButton)
                                .addGap(18, 18, 18)
                                .addComponent(exitButton)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instructionLabel1)
                    .addComponent(heightInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instructionLabel2)
                    .addComponent(backInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instructionLabel3)
                    .addComponent(heartInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculateButton)
                    .addComponent(exitButton))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        
        try{
            int test = Integer.parseInt(heightInput.getText());
        }
        catch (NumberFormatException E){
            output.setText("Invalid Height!");
        }
        /*
        This block stops the user from typing letters into the height input
        */
        
        boolean allowed = false;
        String hTrouble = heartInput.getText().toLowerCase(),
                bTrouble = backInput.getText().toLowerCase();
        int height = Integer.parseInt(heightInput.getText());
        
        if (hTrouble.matches("[^ny]") || bTrouble.matches("[^ny]") || hTrouble.isEmpty() || bTrouble.isEmpty()){
            output.setText("Invalid Input!");
            return;
        }
        /*
        This block will see if the "problem" inputs are 'n' or 'y' and send a message if the inputs are wrong
        */
        
        if (height >= 122 && height <= 188 && "n".equals(bTrouble) && "n".equals(hTrouble)){    //testing if the height is within limits and if there are now problems
            allowed = true;
        }
        
        if (allowed){
            output.setText("It is okay for you to ride this roller coaster. Have Fun!");
        }
        else{
            output.setText("Sorry, it is not safe for you to ride this roller coaster.");
        }
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Roller_Coaster_Ride().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField backInput;
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField heartInput;
    private javax.swing.JTextField heightInput;
    private javax.swing.JLabel instructionLabel1;
    private javax.swing.JLabel instructionLabel2;
    private javax.swing.JLabel instructionLabel3;
    private javax.swing.JTextField output;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
