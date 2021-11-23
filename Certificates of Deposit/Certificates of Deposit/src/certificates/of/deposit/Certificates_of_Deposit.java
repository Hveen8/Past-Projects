/*
Certificates of Deposit
By Harry van der Veen
Made on 03/21/19

This program will find out how many years it will take for a principal to accumulate into
a final amount with interest using loops
*/
package certificates.of.deposit;

import java.text.DecimalFormat;

public class Certificates_of_Deposit extends javax.swing.JFrame {

    public Certificates_of_Deposit() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlelabel = new javax.swing.JLabel();
        initiallabel = new javax.swing.JLabel();
        interestlabel = new javax.swing.JLabel();
        finallabel = new javax.swing.JLabel();
        calculatebutton = new javax.swing.JButton();
        investinput = new javax.swing.JTextField();
        output = new javax.swing.JLabel();
        interestinput = new javax.swing.JTextField();
        finalinput = new javax.swing.JTextField();
        exitbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titlelabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        titlelabel.setText("CD Calculator");

        initiallabel.setText("Enter initial Investment ($)");

        interestlabel.setText("Enter Annual Interest Rate (%)");

        finallabel.setText("Enter Final Amount ($)");

        calculatebutton.setText("Calculate Number of Years");
        calculatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatebuttonActionPerformed(evt);
            }
        });

        investinput.setText("0");

        interestinput.setText("0");

        finalinput.setText("0");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(titlelabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(calculatebutton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(initiallabel)
                                    .addComponent(interestlabel)
                                    .addComponent(finallabel))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(investinput, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                    .addComponent(interestinput)
                                    .addComponent(finalinput))))
                        .addGap(0, 87, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitbutton))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlelabel)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(initiallabel)
                    .addComponent(investinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(interestlabel)
                    .addComponent(interestinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finallabel)
                    .addComponent(finalinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(calculatebutton)
                .addGap(33, 33, 33)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(exitbutton))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatebuttonActionPerformed
        //The varables will be the principal value, the interest (that gets divided by 100 to get percentage), the desired amount
        double investment = Double.parseDouble(investinput.getText()), 
               interest = Double.parseDouble(interestinput.getText()) / 100, 
               finalamount = Double.parseDouble(finalinput.getText()), 
               years = 0;
       
        if (investment <= 0 || interest <= 0){ //This statement will check if negative numbers have been inputed which will put the program into an infinite loop
          output.setText("Invalid Investment or Interest");
        }
        else{  
          /* This block will add the interest to the invested amount compunding. 
          It then increments the number of years and repeats the process
          until the investment is equal to or greater than the desired amount
          */
        while (investment < finalamount){    
            investment += investment * interest;
            years++; //The number we are trying to find is the number of times the loop repeats, so the years counter tracks this
        }
       
        DecimalFormat money = new DecimalFormat ("$0.00");
        DecimalFormat year = new DecimalFormat ("#");
       
        output.setText("Your investment will accumulate to " + money.format(investment) + " after " + year.format(years) + " years"); //printing the results
        }
    }//GEN-LAST:event_calculatebuttonActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        System.exit(0); //Exiting the program when the 'exit' button is pushed
    }//GEN-LAST:event_exitbuttonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Certificates_of_Deposit().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculatebutton;
    private javax.swing.JButton exitbutton;
    private javax.swing.JTextField finalinput;
    private javax.swing.JLabel finallabel;
    private javax.swing.JLabel initiallabel;
    private javax.swing.JTextField interestinput;
    private javax.swing.JLabel interestlabel;
    private javax.swing.JTextField investinput;
    private javax.swing.JLabel output;
    private javax.swing.JLabel titlelabel;
    // End of variables declaration//GEN-END:variables
}