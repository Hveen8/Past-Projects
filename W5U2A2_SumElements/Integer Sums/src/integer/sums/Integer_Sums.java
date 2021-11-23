/*
Integer Sums
By Harry van der Veen
Made on 10/05/19

This program will use an array to add even and odd integers
together that have been inputed into an array
 */
package integer.sums;

import java.util.ArrayList;
import java.util.Collections;

public class Integer_Sums extends javax.swing.JFrame {

    public Integer_Sums() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        instructionLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        listButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputArray = new javax.swing.JTextArea();
        sumAllButton = new javax.swing.JButton();
        sumEvenButton = new javax.swing.JButton();
        sumOddButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        outputSum = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleLabel.setText("Integer Sums");

        input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputMouseClicked(evt);
            }
        });

        instructionLabel.setText("Enter an Integer:");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        listButton.setText("List");
        listButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        outputArray.setEditable(false);
        outputArray.setColumns(20);
        outputArray.setRows(5);
        outputArray.setAutoscrolls(false);
        jScrollPane1.setViewportView(outputArray);

        sumAllButton.setText("Sum All");
        sumAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumAllButtonActionPerformed(evt);
            }
        });

        sumEvenButton.setText("Sum Even");
        sumEvenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumEvenButtonActionPerformed(evt);
            }
        });

        sumOddButton.setText("Sum Odd");
        sumOddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumOddButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        outputSum.setEditable(false);
        outputSum.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(instructionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(listButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(sumAllButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sumOddButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sumEvenButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(titleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outputSum, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instructionLabel)
                    .addComponent(removeButton)
                    .addComponent(addButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(listButton)
                            .addComponent(jButton1))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sumAllButton)
                            .addComponent(exitButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sumEvenButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sumOddButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outputSum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ArrayList integers = new ArrayList();
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        inputTest();
        
        int integer = Integer.parseInt(input.getText());
        
        integers.add(integer);  //adding the input to the overall array
        
        updateOutput(1,false);  //updating the outputs
    }//GEN-LAST:event_addButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        inputTest();    //testing input data type
        
        int integer = Integer.parseInt(input.getText()),
            intPlace;
        
        if (!integers.contains(integer)){   //if there is no integer to remove, this shows an error message
            outputSum.setText("Invalid Input!");
        }
        
        intPlace = integers.indexOf(integer);
        integers.remove(intPlace);  //removing the integer
        
        updateOutput(1,false);
    }//GEN-LAST:event_removeButtonActionPerformed

    private void listButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listButtonActionPerformed
        Collections.sort(integers); //sorting the arraylist
        updateOutput(1,false);
    }//GEN-LAST:event_listButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        integers.clear();   //clearing the arraylist
        updateOutput(1,false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sumAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumAllButtonActionPerformed
        updateOutput(1,true);   //calling the addition of all numbers
    }//GEN-LAST:event_sumAllButtonActionPerformed

    private void sumEvenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumEvenButtonActionPerformed
        updateOutput(2,true);   //calling the addition of even numbers
    }//GEN-LAST:event_sumEvenButtonActionPerformed

    private void sumOddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumOddButtonActionPerformed
        updateOutput(3,true);   //calling the addition of odd numbers
    }//GEN-LAST:event_sumOddButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void inputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputMouseClicked
        input.setText(null);    //clearing the input with each click for quality of life
    }//GEN-LAST:event_inputMouseClicked

    public void updateOutput (int selector, boolean sumed){
        outputArray.setText(null);  //clearing the outputs
        outputSum.setText(null);
        
        int sum = 0;
        
        switch(selector){
            case 1: integers.forEach((n) -> outputArray.setText(outputArray.getText() + "\n" + n)); //this will go through the number list and print off each one
                    
                    for (Object n: integers){ //this will take every odd number and add then together
                            sum += (int) n;     
                    }
                    
                    if (sumed){ //if requested, the sum will appear
                        outputSum.setText("The total of the numbers is: " + sum);
                    }
                    break;
                    
            case 2: integers.stream().filter((n) -> ((int)n % 2 == 0)).forEachOrdered((n) -> {  //this will go through the number list and print off each even one
                        outputArray.setText(outputArray.getText() + "\n" + n);
                    });
            
                    for (Object n: integers){ //this will take every even number and add then together
                        if ((int) n % 2 == 0){
                            sum += (int) n;
                        }
                    }
                    
                    if (sumed){ //if requested, the sum will appear
                        outputSum.setText("The total of the even numbers is: " + sum);
                    }
                    break;
                    
            case 3: integers.stream().filter((n) -> ((int)n % 2 != 0)).forEachOrdered((n) -> {  //this will go through the number list and print off each odd one
                        outputArray.setText(outputArray.getText() + "\n" + n);
                    });
            
                    for (Object n: integers){ //this will take every odd number and add then together
                        if ((int) n % 2 != 0){
                            sum += (int) n;
                        }
                    }
                    
                    if (sumed){ //if requested, the sum will appear
                        outputSum.setText("The total of the odd numbers is: " + sum);
                    }
                    break;
        }
    }
    
    public void inputTest(){
        try{    //this will confirm the data type that has been put into the input
            int test = Integer.parseInt(input.getText());
        }
        catch(NumberFormatException E){
            outputSum.setText("Invalid Input!");
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Integer_Sums().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField input;
    private javax.swing.JLabel instructionLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listButton;
    private javax.swing.JTextArea outputArray;
    private javax.swing.JTextField outputSum;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton sumAllButton;
    private javax.swing.JButton sumEvenButton;
    private javax.swing.JButton sumOddButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
