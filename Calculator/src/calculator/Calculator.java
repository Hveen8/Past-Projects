/*
Calculator
By Harry van der Veen
Made on 27/09/19

This program is like a regular calculator
 */
package calculator;

import java.awt.Color;

public class Calculator extends javax.swing.JFrame {

    public Calculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        affectSelector = new javax.swing.ButtonGroup();
        yInput = new javax.swing.JTextField();
        xLabel = new javax.swing.JLabel();
        yLabel = new javax.swing.JLabel();
        xInput = new javax.swing.JTextField();
        TitleLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        output = new javax.swing.JTextField();
        additionButton = new javax.swing.JButton();
        subtractionButton = new javax.swing.JButton();
        multiplicationButton = new javax.swing.JButton();
        divisionButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        modulusButton = new javax.swing.JButton();
        powerButton = new javax.swing.JButton();
        yellowPanel = new javax.swing.JPanel();
        inverseButton = new javax.swing.JButton();
        affectYRadioButton = new javax.swing.JRadioButton();
        affectXRadioButton = new javax.swing.JRadioButton();
        affectANSRadioButton = new javax.swing.JRadioButton();
        switchSignButton = new javax.swing.JButton();
        memoryAddButton = new javax.swing.JButton();
        memoryRecallButton = new javax.swing.JButton();
        squareButton = new javax.swing.JButton();
        squareRootButton = new javax.swing.JButton();
        switchXYButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        xLabel.setText("X:");

        yLabel.setText("Y:");

        TitleLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TitleLabel.setText("Calculator");

        jLabel2.setText("ANS:");

        output.setEditable(false);
        output.setBackground(new java.awt.Color(255, 255, 255));

        additionButton.setText("X + Y");
        additionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionButtonActionPerformed(evt);
            }
        });

        subtractionButton.setText("X - Y");
        subtractionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractionButtonActionPerformed(evt);
            }
        });

        multiplicationButton.setText("X * Y");
        multiplicationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicationButtonActionPerformed(evt);
            }
        });

        divisionButton.setText("X / Y");
        divisionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionButtonActionPerformed(evt);
            }
        });

        clearButton.setText("CLEAR");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        modulusButton.setText("X % Y");
        modulusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modulusButtonActionPerformed(evt);
            }
        });

        powerButton.setText("X ^ Y");
        powerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerButtonActionPerformed(evt);
            }
        });

        yellowPanel.setBackground(new java.awt.Color(255, 255, 0));
        yellowPanel.setLayout(null);

        inverseButton.setText("1 / X");
        inverseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inverseButtonActionPerformed(evt);
            }
        });
        yellowPanel.add(inverseButton);
        inverseButton.setBounds(80, 110, 59, 23);

        affectSelector.add(affectYRadioButton);
        affectYRadioButton.setText("Affect Y");
        yellowPanel.add(affectYRadioButton);
        affectYRadioButton.setBounds(20, 10, 120, 23);

        affectSelector.add(affectXRadioButton);
        affectXRadioButton.setText("Affect X");
        yellowPanel.add(affectXRadioButton);
        affectXRadioButton.setBounds(20, 30, 120, 23);

        affectSelector.add(affectANSRadioButton);
        affectANSRadioButton.setText("Affect ANS");
        yellowPanel.add(affectANSRadioButton);
        affectANSRadioButton.setBounds(20, 50, 120, 23);

        switchSignButton.setText("+ / -");
        switchSignButton.setMaximumSize(new java.awt.Dimension(59, 23));
        switchSignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchSignButtonActionPerformed(evt);
            }
        });
        yellowPanel.add(switchSignButton);
        switchSignButton.setBounds(80, 140, 59, 23);

        memoryAddButton.setText("M+");
        memoryAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryAddButtonActionPerformed(evt);
            }
        });
        yellowPanel.add(memoryAddButton);
        memoryAddButton.setBounds(80, 80, 59, 23);

        memoryRecallButton.setText("MR");
        memoryRecallButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryRecallButtonActionPerformed(evt);
            }
        });
        yellowPanel.add(memoryRecallButton);
        memoryRecallButton.setBounds(20, 80, 59, 23);

        squareButton.setText("X^2");
        squareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareButtonActionPerformed(evt);
            }
        });
        yellowPanel.add(squareButton);
        squareButton.setBounds(20, 110, 59, 23);

        squareRootButton.setText("√x");
        squareRootButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareRootButtonActionPerformed(evt);
            }
        });
        yellowPanel.add(squareRootButton);
        squareRootButton.setBounds(20, 140, 59, 23);

        switchXYButton.setText("X ⇆ Y");
        switchXYButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchXYButtonActionPerformed(evt);
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
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(yLabel)
                                        .addGap(136, 136, 136))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(switchXYButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                                    .addComponent(additionButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(powerButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(modulusButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(multiplicationButton)
                                                    .addComponent(subtractionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(divisionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(exitButton))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(yellowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(yInput, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(xLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(xInput, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(TitleLabel)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(output, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(xLabel)
                        .addComponent(xInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yLabel)
                            .addComponent(yInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(switchXYButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(multiplicationButton)
                            .addComponent(additionButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(powerButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modulusButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(subtractionButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(divisionButton)))
                        .addGap(18, 18, 18)
                        .addComponent(clearButton))
                    .addComponent(yellowPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    double memory;  //making a global value for calculator memory
    private void additionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additionButtonActionPerformed
        double x = getInputs()[0],
               y = getInputs()[1];
        
        output.setText(Double.toString(x + y));    //adding the x and y values together    
    }//GEN-LAST:event_additionButtonActionPerformed

    private void subtractionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractionButtonActionPerformed
        double x = getInputs()[0],
               y = getInputs()[1];
        
        output.setText(Double.toString(x - y));    //subracting the y value from the x value 
    }//GEN-LAST:event_subtractionButtonActionPerformed

    private void multiplicationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicationButtonActionPerformed
        double x = getInputs()[0],
               y = getInputs()[1];
        
        output.setText(Double.toString(x * y));    //multiplying the x and y values together 
    }//GEN-LAST:event_multiplicationButtonActionPerformed

    private void divisionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionButtonActionPerformed
        double x = getInputs()[0],
               y = getInputs()[1];
        
        output.setText(Double.toString(x / y));    //dividing the x value by the y value
    }//GEN-LAST:event_divisionButtonActionPerformed

    private void modulusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modulusButtonActionPerformed
        double x = getInputs()[0],
               y = getInputs()[1];
        
        output.setText(Double.toString(x % y));    //finding the remainder of x divided by y
    }//GEN-LAST:event_modulusButtonActionPerformed

    private void powerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerButtonActionPerformed
        double x = getInputs()[0],
               y = getInputs()[1];
        
        output.setText(Double.toString(Math.pow(x,y)));    //finding the value of x to the power of y
    }//GEN-LAST:event_powerButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        xInput.setText("0");    //reseting the text fields
        yInput.setText("0");
        output.setText("0");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void memoryAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryAddButtonActionPerformed
        switch(boxChoice()){
            case 1: memory = Double.parseDouble(yInput.getText());  //setting 'memory' to the selected value
                    break;
            case 2: memory = Double.parseDouble(xInput.getText());
                    break;
            case 3: memory = Double.parseDouble(output.getText());
                    break;
            default: redButtons();
        }
    }//GEN-LAST:event_memoryAddButtonActionPerformed

    private void memoryRecallButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryRecallButtonActionPerformed
        switch(boxChoice()){
            case 1: yInput.setText(Double.toString(memory));    //setting the selected value to 'memory'
                    break;
            case 2: xInput.setText(Double.toString(memory));
                    break;
            case 3: output.setText(Double.toString(memory));
                    break;
            default: redButtons();
        }
    }//GEN-LAST:event_memoryRecallButtonActionPerformed

    private void squareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareButtonActionPerformed
        double x = getInputs()[0],
               y = getInputs()[1],
               ans = getInputs()[2];
        
        switch(boxChoice()){
            case 1: output.setText(Double.toString(Math.pow(y,2)));    //squaring the selected value
                    break;
            case 2: output.setText(Double.toString(Math.pow(x,2)));
                    break;
            case 3: output.setText(Double.toString(Math.pow(ans,2)));
                    break;
            default: redButtons();
        }
    }//GEN-LAST:event_squareButtonActionPerformed

    private void inverseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inverseButtonActionPerformed
        double x = getInputs()[0],
               y = getInputs()[1],
               ans = getInputs()[2];
        
        switch(boxChoice()){
            case 1: output.setText(Double.toString(1 / y));    //dividing the selected value by 1
                    break;
            case 2: output.setText(Double.toString(1 / x));
                    break;
            case 3: output.setText(Double.toString(1 / ans));
                    break;
            default: redButtons();
        }
    }//GEN-LAST:event_inverseButtonActionPerformed

    private void squareRootButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareRootButtonActionPerformed
        double x = getInputs()[0],
               y = getInputs()[1],
               ans = getInputs()[2];
        
        switch(boxChoice()){
            case 1: output.setText(Double.toString(Math.sqrt(y)));    //finding the square root of the selcted value
                    break;
            case 2: output.setText(Double.toString(Math.sqrt(x)));
                    break;
            case 3: output.setText(Double.toString(Math.sqrt(ans)));   
                    break;
            default: redButtons();
        }
    }//GEN-LAST:event_squareRootButtonActionPerformed

    private void switchSignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchSignButtonActionPerformed
        double x = getInputs()[0],
               y = getInputs()[1],
               ans = getInputs()[2];
        
        switch(boxChoice()){
            case 1: yInput.setText(Double.toString(y * (-1)));    //switching the sign of the selected value
                    break;
            case 2: xInput.setText(Double.toString(x * (-1)));
                    break;
            case 3: output.setText(Double.toString(ans * (-1)));   
                    break;
            default: redButtons();
        }
    }//GEN-LAST:event_switchSignButtonActionPerformed

    private void switchXYButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchXYButtonActionPerformed
        double x = getInputs()[0],
               y = getInputs()[1];
        
        xInput.setText(Double.toString(y)); //swapping the x and y values
        yInput.setText(Double.toString(x)); 
    }//GEN-LAST:event_switchXYButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    public double[] getInputs(){
        if (yInput.getText().isEmpty()){    //these if statements will change null inputs to zero
            yInput.setText("0");
        }
        if (xInput.getText().isEmpty()){
            xInput.setText("0");
        }
        if (output.getText().isEmpty()){
            output.setText("0");
        }
        
        try{    //checking input data type
            double test = Double.parseDouble(yInput.getText()) + Double.parseDouble(xInput.getText()) + Double.parseDouble(output.getText());
        }
        catch(NumberFormatException E){
            output.setText("Illegal Input!");
        }
        double x = Double.parseDouble(xInput.getText()),
               y = Double.parseDouble(yInput.getText()),
               ans = Double.parseDouble(output.getText());
        double[] inputs = {x,y,ans};    //taking the number and putting them in an array to be returned to each function
        
        return inputs;
    }
    
    public int boxChoice(){
        getInputs();    //tacking on this method for the data check for use on buttons that don't take input
        affectYRadioButton.setBackground(null); //setting buttons to default colour
        affectXRadioButton.setBackground(null);
        affectANSRadioButton.setBackground(null);
        
        if (affectYRadioButton.isSelected()){   //returning a number based on which radio button is selected
            return 1;
        }
        else if (affectXRadioButton.isSelected()){
            return 2;
        }
        else if (affectANSRadioButton.isSelected()){
            return 3;
        }
        return 0;
    }
    
    public void redButtons(){
        affectYRadioButton.setBackground(Color.RED);    //changing the radio button colours to remind the user to select one
        affectXRadioButton.setBackground(Color.RED);
        affectANSRadioButton.setBackground(Color.RED);
    }
            
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton additionButton;
    private javax.swing.JRadioButton affectANSRadioButton;
    private javax.swing.ButtonGroup affectSelector;
    private javax.swing.JRadioButton affectXRadioButton;
    private javax.swing.JRadioButton affectYRadioButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton divisionButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton inverseButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton memoryAddButton;
    private javax.swing.JButton memoryRecallButton;
    private javax.swing.JButton modulusButton;
    private javax.swing.JButton multiplicationButton;
    private javax.swing.JTextField output;
    private javax.swing.JButton powerButton;
    private javax.swing.JButton squareButton;
    private javax.swing.JButton squareRootButton;
    private javax.swing.JButton subtractionButton;
    private javax.swing.JButton switchSignButton;
    private javax.swing.JButton switchXYButton;
    private javax.swing.JTextField xInput;
    private javax.swing.JLabel xLabel;
    private javax.swing.JTextField yInput;
    private javax.swing.JLabel yLabel;
    private javax.swing.JPanel yellowPanel;
    // End of variables declaration//GEN-END:variables
}
