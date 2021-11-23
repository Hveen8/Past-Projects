/*
Powers
By Harry van der Veen
Made on 27/09/19

This program will print out the powers of a specified base
 */
package powers;

import java.text.DecimalFormat;

public class Powers extends javax.swing.JFrame {

    public Powers() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        instructionLabel = new javax.swing.JLabel();
        instructionLabel2 = new javax.swing.JLabel();
        baseInput = new javax.swing.JTextField();
        exponentInput = new javax.swing.JTextField();
        titleLabel = new javax.swing.JLabel();
        calculateButton = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        instructionLabel.setText("Enter Base:");

        instructionLabel2.setText("Enter Exponent:");

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        titleLabel.setText("Powers");

        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        exitbutton.setText("Exit");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });

        output.setEditable(false);
        output.setColumns(20);
        output.setRows(5);
        jScrollPane1.setViewportView(output);
        output.getAccessibleContext().setAccessibleParent(output);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(instructionLabel)
                            .addComponent(instructionLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(baseInput, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(calculateButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(exponentInput, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(exitbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(baseInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calculateButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exponentInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exitbutton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(instructionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(instructionLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        output.setText(""); //clearing the output
        
        try{     //This will check the data types input of the power and bases to make sure numbers have been typed
            double test = Double.parseDouble(baseInput.getText()) + Double.parseDouble(exponentInput.getText());
        }
        catch (NumberFormatException E){
            output.setText("Illegal Input!");
        }
        
        double base = Double.parseDouble(baseInput.getText()),
            exponent = Double.parseDouble(exponentInput.getText());
        
        if (exponent < 1 || exponent > 10){ //making sure the input is within 1 to 10 for the exponents
            output.setText("Exponent must be between 1 and 10!");
            return;
        }
        
        DecimalFormat intForm = new DecimalFormat("0"); //creating a format to avoid showing decimals from the doubles
        
        for (double i = 1; i <= exponent; i++){
            output.setText(output.getText() + intForm.format(base) + " to the exponent " + intForm.format(i) + " = " + Math.pow(base,i) + "\n");
        }
        /*
        This block will print out each power of the specified base until the
        specified power was been reached
        */
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitbuttonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Powers().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField baseInput;
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton exitbutton;
    private javax.swing.JTextField exponentInput;
    private javax.swing.JLabel instructionLabel;
    private javax.swing.JLabel instructionLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea output;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
