/*
Employee Records
By Harry van der Veen
Made on 10/27/19

This program will use an object array to store 
information about eployees of a company
 */
package employee.records;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Employee_Records extends javax.swing.JFrame {

    public Employee_Records() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        IDLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        salaryLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        IDInput = new javax.swing.JTextField();
        firstNameInput = new javax.swing.JTextField();
        lastNameInput = new javax.swing.JTextField();
        salaryInput = new javax.swing.JTextField();
        startDateInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        listButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleLabel.setText("Employee Records");

        IDLabel.setText("ID#:");

        firstNameLabel.setText("First Name:");

        lastNameLabel.setText("Last Name:");

        salaryLabel.setText("Annual Salary:");

        jLabel1.setText("Start Date:");

        startDateInput.setText("yyyymmdd");

        jLabel2.setText("<html>Enter and ID# and press Remove<p>to delete an Employee's Records</html>");

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

        output.setColumns(20);
        output.setRows(5);
        jScrollPane1.setViewportView(output);

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
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(exitButton)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(salaryLabel)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lastNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(firstNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(IDLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(salaryInput, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(startDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(firstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(IDInput, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(52, 52, 52)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(listButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(titleLabel)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameLabel)
                            .addComponent(firstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salaryInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salaryLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //making an object arrayList
    ArrayList <info> records = new ArrayList <>();
    
    class info {
        String employeeIdNumber, firstName, lastName, annualSalary, startDate;
        
        //setting up the class for the arrayList
        info (String _employeeIdNumber, String _firstName, String _lastName, String _annualSalary, String _startDate) {
            employeeIdNumber = _employeeIdNumber;
            firstName = _firstName;
            lastName = _lastName;
            annualSalary = _annualSalary;
            startDate = _startDate;
        }
    }
    
    DecimalFormat money = new DecimalFormat("$#.00");
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        inputTest(true);
        
        //grabbing all the inputs
        String employeeIdNumber = IDInput.getText(),
               firstName = firstNameInput.getText(),
               lastName = lastNameInput.getText(), 
               annualSalary = salaryInput.getText(), 
               startDate = startDateInput.getText();
        
        //putting the data into an obect array
        info i = new info (employeeIdNumber, firstName, lastName, annualSalary, startDate);
        
        //adding the new object array to the master arrayList
        records.add(i);
    }//GEN-LAST:event_addButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        
        inputTest(false);

        //taking the ID number of the employee the user wishes to erase
        String employeeIdNumber = IDInput.getText();
        boolean found = false;
        
        //if the ID is found it will be deleted
        for (int n = 0; n <= records.size() - 1; n++){
            if (records.get(n).employeeIdNumber.equals(employeeIdNumber)){
                records.remove(n);
                found = true;
            }
        }
        
        //if the ID isn't found, the user gets a message
        if (!found){
            output.setText("No Such employee!");
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void listButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listButtonActionPerformed
        //clearing the output screen
        output.setText("");
        
        //listing off all the information in blocks for each employee
        for (int n = 0; n <= records.size() - 1; n++){
            output.append("Employee ID: " + records.get(n).employeeIdNumber + "\n" +
                          "First Name: " + records.get(n).firstName + "\n" +
                          "Last Name: " + records.get(n).lastName + "\n" +
                          "AnnualSalary" + money.format(Integer.parseInt(records.get(n).annualSalary)) + "\n" +
                          "Start Date: " + records.get(n).startDate + "\n\n");
        }
    }//GEN-LAST:event_listButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void inputTest (boolean selector){
        if (selector){
            //this will ensure all text areas are filled and with a logical data type
            try{
                String testWords = firstNameInput.getText() + lastNameInput.getText();
                int testNumbers = Integer.parseInt(IDInput.getText()) + Integer.parseInt(salaryInput.getText()) + Integer.parseInt(startDateInput.getText());
            }
            catch (NumberFormatException E){
                output.setText("Invalid Input!\nMake sure all data fields are completed!");
            }
        }
        else{
            try{
                int testIdNumber = Integer.parseInt(IDInput.getText());
            }
            catch (NumberFormatException E){
                output.setText("Invalid Input!\nMake sure the ID is correct!");
            }
        }    
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Employee_Records().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDInput;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JButton addButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField firstNameInput;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameInput;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JButton listButton;
    private javax.swing.JTextArea output;
    private javax.swing.JButton removeButton;
    private javax.swing.JTextField salaryInput;
    private javax.swing.JLabel salaryLabel;
    private javax.swing.JTextField startDateInput;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
