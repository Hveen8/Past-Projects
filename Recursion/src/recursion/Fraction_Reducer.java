/*
Fraction Reducer
By Harry van der Veen
Made on 11/11/19

This program will reduce fractions to their lowest terms
*/
package recursion;

public class Fraction_Reducer extends javax.swing.JFrame {

    public Fraction_Reducer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        explanationLabel = new javax.swing.JLabel();
        instructionLabel1 = new javax.swing.JLabel();
        instructionLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        numeratorInput = new javax.swing.JTextField();
        denominatorInput = new javax.swing.JTextField();
        reduceFractionButton = new javax.swing.JButton();
        output = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleLabel.setText("Fraction Reducer");

        explanationLabel.setText("This program will reduce fractions to their lowest terms");

        instructionLabel1.setText("Enter Numerator:");

        instructionLabel2.setText("Enter Denominator:");

        jLabel1.setText("____________");

        reduceFractionButton.setText("Reduce Fraction");
        reduceFractionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reduceFractionButtonActionPerformed(evt);
            }
        });

        output.setEditable(false);
        output.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(titleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(instructionLabel2)
                            .addComponent(instructionLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numeratorInput)
                            .addComponent(denominatorInput)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(reduceFractionButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(explanationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(output)))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(explanationLabel)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeratorInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instructionLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instructionLabel2)
                    .addComponent(denominatorInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(reduceFractionButton)
                .addGap(18, 18, 18)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reduceFractionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reduceFractionButtonActionPerformed
        //making sure the user put numbers into the input
        try {
            int test = Integer.parseInt(numeratorInput.getText()) + Integer.parseInt(denominatorInput.getText());
        }
        catch (NumberFormatException E){
            output.setText("Make sure you have written the proper n and r values!");
        }
        
        int numerator = Integer.parseInt(numeratorInput.getText()),
            denominator = Integer.parseInt(denominatorInput.getText()),
            reductionFactor;
        
        //determining the Greatest Common Factor is the numbers
        reductionFactor = GCF(numerator, denominator);
        
        //divding each number by the GCF to get the reduced fraction
        output.setText(numerator + "/" + denominator + " in lowest terms is " + (numerator / reductionFactor) + "/" + (denominator / reductionFactor));
    }//GEN-LAST:event_reduceFractionButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    public int GCF (int firstNum, int secondNum){
        //If the previous division had no remainder, then the GCF has been found
        if (secondNum == 0){
            return firstNum;
        }
        else{
            //This will divide the numbers and return the remainder to be divided again to look for the GCF
            return GCF(secondNum, (firstNum % secondNum));
        }
    }
    
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Fraction_Reducer().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField denominatorInput;
    private javax.swing.JLabel explanationLabel;
    private javax.swing.JLabel instructionLabel1;
    private javax.swing.JLabel instructionLabel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField numeratorInput;
    private javax.swing.JTextField output;
    private javax.swing.JButton reduceFractionButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
