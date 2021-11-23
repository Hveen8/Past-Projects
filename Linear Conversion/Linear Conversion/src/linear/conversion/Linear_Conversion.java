/*
Linear Conversion
By Harry van der Veen
Made on 04/15/19

This program will convert imperial units to metric and vice versa
 */
package linear.conversion;

import java.text.DecimalFormat;

public class Linear_Conversion extends javax.swing.JFrame {

    public Linear_Conversion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlelabel = new javax.swing.JLabel();
        choiceslabel = new javax.swing.JLabel();
        chooseConversionlabel = new javax.swing.JLabel();
        conversioninput = new javax.swing.JTextField();
        chooseValuelabel = new javax.swing.JLabel();
        valueinput = new javax.swing.JTextField();
        convertbutton = new javax.swing.JButton();
        output = new javax.swing.JLabel();
        otherwaytoggle = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titlelabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titlelabel.setText("Linear Conversion");

        choiceslabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        choiceslabel.setText("<html>1. Inches to Centimeters <P>2. Feet to Centimeters<P>3. Yards to Meters<P>4. Miles to Kilometers</html> ");

        chooseConversionlabel.setText("<html>Choose Conversion<P>(1-4)</html>");

        chooseValuelabel.setText("<html>Enter value to be converted</html>");

        convertbutton.setText("Convert");
        convertbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertbuttonActionPerformed(evt);
            }
        });

        otherwaytoggle.setText("<html>Reverse<P>Conversion</html>");
        otherwaytoggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherwaytoggleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titlelabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(choiceslabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(chooseValuelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(chooseConversionlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(conversioninput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                                    .addComponent(valueinput, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(convertbutton)
                                .addGap(18, 18, 18)
                                .addComponent(otherwaytoggle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlelabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(choiceslabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chooseConversionlabel)
                    .addComponent(conversioninput))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chooseValuelabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueinput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(otherwaytoggle)
                    .addComponent(convertbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertbuttonActionPerformed
        if (conversioninput.getText().length() == 0 || valueinput.getText().length() == 0){ //This will make sure something has actually been typed into the text fields
            output.setText("Invalid Conversion Type or Value");
        }
        
        output.setText("Invalid Conversion Type or Value"); //This will preload the output with an error statement  incase a letter has been typed and the next lines aren't able to rewrite the output
        
        int conversion = Integer.parseInt(conversioninput.getText());   //This will look at what conversion type the user has chosen
        double measurement;
        
        DecimalFormat twoplaces = new DecimalFormat("0.00");    //This will keep the output resricted to two decimal places
        
        switch (conversion){
            case 1:
                measurement = InchesandCentimeters(Double.parseDouble(valueinput.getText()));   //If inches to centimeters has been selected
                output.setText(twoplaces.format(measurement));
                break;
            case 2:
                measurement = FeetandCentimeters(Double.parseDouble(valueinput.getText()));   //If feet to meters has been selected
                output.setText(twoplaces.format(measurement));
                break;
            case 3:
                measurement = YardsandMeters(Double.parseDouble(valueinput.getText()));   //If yards to meters has been selected
                output.setText(twoplaces.format(measurement));
                break;
            case 4:
                measurement = MilesandKilometers(Double.parseDouble(valueinput.getText()));   //If miles to kilometers has been selected
                output.setText(twoplaces.format(measurement));
                break;
            default :
                output.setText("Invalid Conversion Type Selected"); //If a different number has been selected, the user will get an error
        }
    }//GEN-LAST:event_convertbuttonActionPerformed

    private void otherwaytoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherwaytoggleActionPerformed
        otherway = !otherway;   //this toggles the ability to go the reverse direction with conversions
    }//GEN-LAST:event_otherwaytoggleActionPerformed

    Boolean otherway = false;   //this allows multiple equations to be put into one method
    
    public double InchesandCentimeters(double value){
        if (otherway){
            return value / 2.54;    //divides the centimeters to make inches
        }
        else {
            return value * 2.54;    //multiplies the inches to make centimeters
        }
    }
    
    private double FeetandCentimeters (double value){
        if (otherway){
            return value / 30;  //divides the centimeters to make feet
        }
        else {
            return value * 30;  //multiplies the feet to make centimeters
        }
    }
    
    private double YardsandMeters (double value){
        if (otherway){
            return value / 0.91;  //divides the meters to make yards
        }
        else {
            return value * 0.91;  //multiplies the yards to make meters
        }
    }
    
    private double MilesandKilometers (double value){
            if (otherway){
                return value / 1.6;  //divides the kilometers to make miles
            }
            else {
                return value * 1.6;  //multiplies the miles to make kilometers
            }
        }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Linear_Conversion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel choiceslabel;
    private javax.swing.JLabel chooseConversionlabel;
    private javax.swing.JLabel chooseValuelabel;
    private javax.swing.JTextField conversioninput;
    private javax.swing.JButton convertbutton;
    private javax.swing.JToggleButton otherwaytoggle;
    private javax.swing.JLabel output;
    private javax.swing.JLabel titlelabel;
    private javax.swing.JTextField valueinput;
    // End of variables declaration//GEN-END:variables
}
