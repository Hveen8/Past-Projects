/*
n Choose r
By Harry van der Veen
Made on 11/11/19

This program will find the number of combinations the can be made from nCr items
 */
package recursion;

import java.text.DecimalFormat;

public class Combinations extends javax.swing.JFrame {

    public Combinations() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        explanationLabel = new javax.swing.JLabel();
        instructionLabel1 = new javax.swing.JLabel();
        instructionLabel2 = new javax.swing.JLabel();
        rInput = new javax.swing.JTextField();
        nInput = new javax.swing.JTextField();
        output = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLabel.setText("n Choose r");

        explanationLabel.setText("<html>This will show the number of way you can choose <p>r objects from a group of n objects</html>");

        instructionLabel1.setText("Enter number of objects to choose:");

        instructionLabel2.setText("Enter number of total objects to choose from:");

        output.setEditable(false);
        output.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Find the Number of Combinations");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(141, 141, 141)
                            .addComponent(titleLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(76, 76, 76)
                            .addComponent(explanationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(114, 114, 114)
                            .addComponent(jButton1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(exitButton)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(instructionLabel2)
                                        .addComponent(instructionLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rInput, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nInput, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(explanationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(instructionLabel1)
                            .addComponent(rInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(instructionLabel2)))
                .addGap(11, 11, 11)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitButton)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    DecimalFormat integerNumber = new DecimalFormat("#");
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //making sure the user put numbers into the input
        try {
            int test = Integer.parseInt(rInput.getText()) + Integer.parseInt(nInput.getText());
        }
        catch (NumberFormatException E){
            output.setText("Make sure you have written the proper n and r values!");
        }
        
        double nValue = Double.parseDouble(nInput.getText()),
            rValue = Double.parseDouble(rInput.getText()),
            combinations;
        
        //this will stop if the r value is greater than the n value which is illegal when using nCr
        if (rValue > nValue){
            output.setText("Make sure that the r value is smaller than the n value!");
            return;
        }
        
        //this is the equation for combinations
        combinations = factorial(nValue) / (factorial(rValue) * factorial(nValue - rValue));

        output.setText("There are "  + integerNumber.format(combinations) + " Combinations.");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    public double factorial (double number){
        //if the number is 1 or zero, the recursion will multtiply by zero or negative number which is bad, returning 1 will prevent this and is correct
        if (number == 1 || number == 0){
            return 1;
        }
        else{
            //multiplying the number by its previous integers
            return number * factorial(number - 1);
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Combinations().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel explanationLabel;
    private javax.swing.JLabel instructionLabel1;
    private javax.swing.JLabel instructionLabel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField nInput;
    private javax.swing.JTextField output;
    private javax.swing.JTextField rInput;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
