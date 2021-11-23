/*
Math Methods
By Harry van der Veen
Made on 27/09/19

This program demonstrates the math methods
*/
package math.methods;

public class Math_Methods extends javax.swing.JFrame {

    public Math_Methods() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        instructionLabel1 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        exitButton = new javax.swing.JButton();
        calculateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLabel.setText("Math Methods");

        instructionLabel1.setText("Enter Number:");

        output.setColumns(20);
        output.setRows(5);
        jScrollPane1.setViewportView(output);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(calculateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exitButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(instructionLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(titleLabel))
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instructionLabel1)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calculateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        try{
            double test = Double.parseDouble(input.getText());
        }
        catch(NumberFormatException E){
            output.setText("Illegal Input!");
        }
        
        double number = Double.parseDouble(input.getText()),
               square,
               squareRoot,
               absolute,
               round,
               sin,
               cos,
               tan,
               loop;

        square = Math.pow(number,2);
        squareRoot = Math.sqrt(number);
        absolute = Math.abs(number);
        round = Math.round(number);
        sin = Math.sin(number);
        cos = Math.cos(number);
        tan = Math.tan(number);
        loop = looped(number);
        
        printer(number, square, squareRoot, absolute, round, sin, cos, tan, loop);
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    public double looped(double number){
        /*
        This method will return a decimal loop of the number
        Ex. 5 will output 0.55555... or
            1234 will output 0.123412341234...
        */
        
        int digits = Double.toString(number).length() - 2;  //finding out how many digits the number is.  The -2 is to omit the *.0 at the end of every double
        String nines = "";

        for (int i = 1; i <= digits; i++){
            nines += "9";   //adding a '9' for every digit
        }
        
        number /= Double.parseDouble(nines);    //this idea behind this is that anything divided by as many 9's as it ahs digits wil result in the repeated number
        return number;
    }
    
    public void printer(double number, double square, double squareRoot, double absolute, double round, double sin, double cos, double tan, double loop){
        output.setText(number + " squared is: " + square + "\n" +
                       "The square root of " + number + " is: " + squareRoot + "\n" +
                       "The absolute value of " + number + " is: " + absolute + "\n" +
                       number + " rounded is: " + round + "\n" +
                       "The sin of " + number + " is: " + sin + "\n" +
                       "The cos of " + number + " is: " + cos + "\n" +
                       "The tan of " + number + " is: " + tan + "\n" +
                       number + " looped is: " + loop);
        
        if (number % 2 == 0){
            output.setText(output.getText() + "\n" + number + " is an even number");
        }
        else{
            output.setText(output.getText() + "\n" + number + " is an odd number");
        }
    }
    
    public static void main(String args[]) {

        
        
        java.awt.EventQueue.invokeLater(() -> {
            new Math_Methods().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField input;
    private javax.swing.JLabel instructionLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea output;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
