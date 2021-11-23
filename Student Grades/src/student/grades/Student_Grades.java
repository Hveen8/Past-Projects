/*
Student Grades
By Harry van der Veen
Made on 10/13/19

This program uses 2d arrays to store and manipulate information
about a students name and several of their marks
 */
package student.grades;

import java.text.DecimalFormat;

public class Student_Grades extends javax.swing.JFrame {

    public Student_Grades() {
        initComponents();
    }
    

    String[][] info = new String[15][5];
    int students = 0;
    
    DecimalFormat mark = new DecimalFormat("#.00");
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        firstNameInput = new javax.swing.JTextField();
        lastNameInput = new javax.swing.JTextField();
        testInput1 = new javax.swing.JTextField();
        testInput2 = new javax.swing.JTextField();
        testInput3 = new javax.swing.JTextField();
        testInput4 = new javax.swing.JTextField();
        testLabel1 = new javax.swing.JLabel();
        testLabel2 = new javax.swing.JLabel();
        testLabel3 = new javax.swing.JLabel();
        testLabel4 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        listButton = new javax.swing.JButton();
        studentAverageButton = new javax.swing.JButton();
        courseAverageButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleLabel.setText("Student Grades");

        firstNameLabel.setText("First Name:");

        lastNameLabel.setText("Last Name:");

        testLabel1.setText("Test 1:");

        testLabel2.setText("Test 2:");

        testLabel3.setText("Test 3:");

        testLabel4.setText("Test 4:");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        listButton.setText("List");
        listButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listButtonActionPerformed(evt);
            }
        });

        studentAverageButton.setText("Student Average");
        studentAverageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentAverageButtonActionPerformed(evt);
            }
        });

        courseAverageButton.setText("Course Average");
        courseAverageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseAverageButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        output.setEditable(false);
        output.setColumns(20);
        output.setRows(5);
        jScrollPane1.setViewportView(output);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameLabel)
                                    .addComponent(testLabel1)
                                    .addComponent(testLabel2)
                                    .addComponent(testLabel3)
                                    .addComponent(testLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(firstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(testInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(testInput3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(testInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(lastNameLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(listButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(studentAverageButton, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                                            .addComponent(courseAverageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGap(145, 145, 145)
                                                        .addComponent(exitButton))))))
                                    .addComponent(testInput4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(titleLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(lastNameLabel)
                    .addComponent(firstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(testInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testLabel1)
                    .addComponent(addButton)
                    .addComponent(studentAverageButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(testInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testLabel2)
                    .addComponent(listButton)
                    .addComponent(courseAverageButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(testInput3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testLabel3)
                    .addComponent(exitButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(testInput4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        output.setText("");

        //verify that all inputs given and are the correct data type
        try{
            String nameTest = firstNameInput.getText() + lastNameInput.getText();
            double test1 = Double.parseDouble(testInput1.getText()),
               test2 = Double.parseDouble(testInput2.getText()),
               test3 = Double.parseDouble(testInput3.getText()),
               test4 = Double.parseDouble(testInput4.getText());
            
            //if marks are beyond 0 or 100, this will trigger the catch statement
            if (test1 < 0 || test1 > 100 || test2 < 0 || test2 > 100 || test3 < 0 || test3 > 100 || test4 < 0 || test4 > 100){
            throw new NumberFormatException("Marks must be between 0 and 100");
            }
        }
        catch (NumberFormatException E){
            output.setText("Please give proper input!");
            return;
        }
        
        double test1 = Double.parseDouble(testInput1.getText()),
               test2 = Double.parseDouble(testInput2.getText()),
               test3 = Double.parseDouble(testInput3.getText()),
               test4 = Double.parseDouble(testInput4.getText());
        
        
        
        //The next few lines avoid super long names that mess with spacing in the output
        String name = firstNameInput.getText() + " " + lastNameInput.getText();
        
        /*
        12 characters is around the max number before formatting issues, 
        so we take the first name and the last initial 
        **this doesn't guarantee there will be not formatting issues
        but lowers the chances drastically, doesn't create too much ambiguity
        and is very simple to implement
        */
        
        if (name.length() > 11){    
            name = firstNameInput.getText() + " " + lastNameInput.getText().charAt(0);
        }
        
        
        
        
        //putting all the information about the student into the array
        info[students][0] = (name);
        info[students][1] = testInput1.getText();
        info[students][2] = testInput2.getText();
        info[students][3] = testInput3.getText();
        info[students][4] = testInput4.getText();
        
        students++;
    }//GEN-LAST:event_addButtonActionPerformed

    private void listButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listButtonActionPerformed
        //printing the data legend
        output.setText("\tStudent Name \t Test 1 Mark \t Test 2 Mark \t Test 3 Mark \t Test 4 Mark:\n\n");
        
        //Using imbeded for loops to print every element in the array
        for (int i = 0; i <= (info.length) - 1; i++){
            
            //if the next element set is null, this stops the printing process
            if (info[i][0] == null){
                return;
            }
            
            output.append("Student " + (i + 1) + ":\t");
            
            for (int n = 0; n <= 4; n++){
                output.append(info[i][n] + "\t");
            }
            
            output.append("\n");
        }
        
    }//GEN-LAST:event_listButtonActionPerformed

    private void studentAverageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentAverageButtonActionPerformed
        //printing the data legend
        output.setText("\tStudent Name \t Average:\n\n");
        
        double total,
               classTotal = 0,
               average;
        int nonNullElements = 0;
        
        //Using imbeded for loops to print every element in the array
        for (int i = 0; i <= (info.length) - 1; i++){
            
            total = 0;
            //if the next element set is null, this stops the printing process
            if (info[i][0] == null){
                break;
            }
                
            output.append("Student " + (i + 1) + ":\t" + info[i][0] + "\t");
            //adding up the marks to divide by 4 to find the average
            for (int n = 1; n <= 4; n++){
                total += Integer.parseInt(info[i][n]);
            }
            
            average = total / 4;
            classTotal += average;
            output.append(mark.format(average) + "\n");
        }
        //finding out how many students have been entered into the program
        for (int i = 0; i <= (info.length) - 1; i++){
            //if the next element set is null, this stops the printing process
            if (info[i][0] == null){
                break;
            }
            nonNullElements++;
        }
        //calculating the class average
        average = classTotal / nonNullElements;
        
        output.append("\nClass Average:\t" + mark.format(average));
    }//GEN-LAST:event_studentAverageButtonActionPerformed

    private void courseAverageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseAverageButtonActionPerformed
        //printing the data legend
        output.setText("\tTest 1 \t Test 2 \t Test 3 \t Test 4\n\n");
 
        double testAverage,
               total;
        int nonNullElements;
        
            output.append("Test Average \t");
        //Using imbeded for loops to print every element in the array
        for (int i = 1; i <= 4; i++){  
            
            nonNullElements = 0;
            total = 0;
            
            for (int n = 0; n <= info.length - 1; n++){ 
                //if the next element set is null, this stops the printing process
                if (info[n][0] == null){
                    break;
                }
                //finding the number of students for division of overall marks
                nonNullElements++;
                
                total += Integer.parseInt(info[n][i]);
            }
            
            testAverage = total / nonNullElements;
            output.append(mark.format(testAverage) + "\t");
        }
    }//GEN-LAST:event_courseAverageButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Student_Grades().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton courseAverageButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField firstNameInput;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameInput;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JButton listButton;
    private javax.swing.JTextArea output;
    private javax.swing.JButton studentAverageButton;
    private javax.swing.JTextField testInput1;
    private javax.swing.JTextField testInput2;
    private javax.swing.JTextField testInput3;
    private javax.swing.JTextField testInput4;
    private javax.swing.JLabel testLabel1;
    private javax.swing.JLabel testLabel2;
    private javax.swing.JLabel testLabel3;
    private javax.swing.JLabel testLabel4;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
