/*
Sleep Calculator
By Harry van der Veen
Made on 09/17/19

This will calculate the aproximate time you have slept based on your age
 */
package sleep.calculator;

public class Sleep_Calculator extends javax.swing.JFrame {

    public Sleep_Calculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new java.awt.Label();
        instructionLabel1 = new java.awt.Label();
        dayLabel = new java.awt.Label();
        monthLabel = new java.awt.Label();
        yearLabel = new java.awt.Label();
        instructionLabel2 = new java.awt.Label();
        dayLabel1 = new java.awt.Label();
        monthLabel1 = new java.awt.Label();
        yearLabel1 = new java.awt.Label();
        calculateButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        daysOutput = new javax.swing.JTextField();
        hoursOutput = new javax.swing.JTextField();
        daysInput = new javax.swing.JTextField();
        monthsInput = new javax.swing.JTextField();
        yearsInput = new javax.swing.JTextField();
        daysInputNow = new javax.swing.JTextField();
        monthsInputNow = new javax.swing.JTextField();
        yearsInputNow = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        titleLabel.setText("Sleep Calculator");

        instructionLabel1.setText("Enter your Birthdate");

        dayLabel.setText("Day");

        monthLabel.setText("Month");

        yearLabel.setText("Year");

        instructionLabel2.setText("Enter Current Date");

        dayLabel1.setText("Day");

        monthLabel1.setText("Month");

        yearLabel1.setText("Year");

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

        daysOutput.setEditable(false);
        daysOutput.setBackground(new java.awt.Color(255, 255, 255));

        hoursOutput.setEditable(false);
        hoursOutput.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(instructionLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(monthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(yearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(yearsInput, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(monthsInput, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(daysInput, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(instructionLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(yearLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(monthLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dayLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(yearsInputNow, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(monthsInputNow, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(daysInputNow, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(calculateButton)
                                    .addComponent(exitButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(daysOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                    .addComponent(hoursOutput)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(instructionLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(daysInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(monthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(monthsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(yearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yearsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(instructionLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dayLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(monthLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(daysInputNow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(monthsInputNow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(yearLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(yearsInputNow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(21, 21, 21)
                        .addComponent(calculateButton))
                    .addComponent(daysOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(hoursOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        daysOutput.setText("");
        hoursOutput.setText("");
        
        if(inputTest(1,1,1,1,1,1)){ //checking if data types are ok, no parameters yet
            return;
        }
        
        int day = Integer.parseInt(daysInput.getText()),
            dayNow = Integer.parseInt(daysInputNow.getText()),
            month = Integer.parseInt(monthsInput.getText()),
            monthNow = Integer.parseInt(monthsInputNow.getText()),
            year = Integer.parseInt(yearsInput.getText()),
            yearNow = Integer.parseInt(yearsInputNow.getText()),
            daysElapsed = 0,
            hoursSlept;

        if(inputTest(year,yearNow,month,monthNow,day,dayNow)){  //checking the values of the numbers
            return;
        }
        
        //daysElapsed = alternateWay(day, dayNow, month, monthNow, year, yearNow);  //A method that uses loops to find the days alive, but needs consistent year cycle
        
        daysElapsed = ((yearNow - year) * 365) + ((monthNow - month) * 30) + (dayNow - day);
        /*
        This line finds the differentce between the years, months, and days
        and multiplies that difference by the appropriate amount of days, 
        and adds it all together to find the days elapsed
        */
        
        hoursSlept = daysElapsed * 8;
        
        daysOutput.setText("You have been alive for " + daysElapsed + " days");
        hoursOutput.setText("You have slept around " + hoursSlept + " hours");
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    public boolean inputTest(int year, int yearNow, int month, int monthNow, int day, int dayNow){
        try{
            int inputTest = Integer.parseInt(daysInput.getText()) +
                    Integer.parseInt(daysInputNow.getText()) +
                    Integer.parseInt(monthsInput.getText()) +
                    Integer.parseInt(monthsInputNow.getText()) +
                    Integer.parseInt(yearsInput.getText()) +
                    Integer.parseInt(yearsInputNow.getText());
        }
        catch (NumberFormatException E){
            daysOutput.setText("Invalid Input!");
            return true;
        }
        /*
        This block takes the integer input from the textfields sees if it throws an error.
        If it does, then that means a double, letter, or nothing has been typed, which is an illegal input
        */
        
        if (monthNow > 12 || monthNow < 1 || month > 12 || month < 1 || dayNow > 30 || dayNow < 1 || day > 30 || day < 1){  //testing if the dates are above the number thresholds e.g. the 65th of the 14th month
                daysOutput.setText("Dates are Invalid!");
                return true;
        }
        if (((year * 365) + (month * 30) + day) > ((yearNow * 365) + (monthNow * 30) + dayNow)){  //testing if the "current" date is before the birthdate
                daysOutput.setText("Dates are Invalid!");
                return true;
        }
        return false;
    }
    
    public int alternateWay (int day, int dayNow, int month, int monthNow, int year, int yearNow){
        
        int daysElapsed = 0;
        
        while (day !=  dayNow || month != monthNow || year != yearNow){ //the loop will continue as long as the birth and current day don't match

            day ++;
            daysElapsed++;
            
            if (day == 31){ //after the 30th day, this resets the day count and increments the month
                day = 1;
                month++;
            }
            if (month == 13){   //after the 12th day, this resets the month count and increments the year
                month = 1;
                year++;
            }    
        } 
        /*
        This block will take the birthdate and count up 
        in days until it matches the current date
        */
        
        return daysElapsed;
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Sleep_Calculator().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateButton;
    private java.awt.Label dayLabel;
    private java.awt.Label dayLabel1;
    private javax.swing.JTextField daysInput;
    private javax.swing.JTextField daysInputNow;
    private javax.swing.JTextField daysOutput;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField hoursOutput;
    private java.awt.Label instructionLabel1;
    private java.awt.Label instructionLabel2;
    private java.awt.Label monthLabel;
    private java.awt.Label monthLabel1;
    private javax.swing.JTextField monthsInput;
    private javax.swing.JTextField monthsInputNow;
    private java.awt.Label titleLabel;
    private java.awt.Label yearLabel;
    private java.awt.Label yearLabel1;
    private javax.swing.JTextField yearsInput;
    private javax.swing.JTextField yearsInputNow;
    // End of variables declaration//GEN-END:variables
}
