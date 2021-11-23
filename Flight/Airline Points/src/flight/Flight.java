/*
Airline Points
By Harry van der Veen
Made on 10/28/19

This program will record airline points data for its passengers
and to determine if a passenger qualifies for bonus points
 */
package flight;

import java.util.ArrayList;

public class Flight extends javax.swing.JFrame {

    public Flight() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        firstNameInput = new javax.swing.JTextField();
        lastNameInput = new javax.swing.JTextField();
        weekLabel1 = new javax.swing.JLabel();
        weekInput1 = new javax.swing.JTextField();
        weekLabel2 = new javax.swing.JLabel();
        weekInput2 = new javax.swing.JTextField();
        weekLabel3 = new javax.swing.JLabel();
        weekInput3 = new javax.swing.JTextField();
        weekLabel4 = new javax.swing.JLabel();
        weekInput4 = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        listButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        planePictureLabel = new javax.swing.JLabel();
        yellowPanel = new javax.swing.JPanel();
        totalPointsButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        passengerSelector = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(580, 601));

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        titleLabel.setText("Airline Points");

        firstNameLabel.setText("First Name:");

        lastNameLabel.setText("Last Name:");

        weekLabel1.setText("Week 1:");

        weekLabel2.setText("Week 2:");

        weekLabel3.setText("Week 3:");

        weekLabel4.setText("Week 4:");

        addButton.setText("Add");
        addButton.setMaximumSize(new java.awt.Dimension(89, 23));
        addButton.setMinimumSize(new java.awt.Dimension(89, 23));
        addButton.setPreferredSize(new java.awt.Dimension(89, 23));
        addButton.setRequestFocusEnabled(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.setMaximumSize(new java.awt.Dimension(89, 23));
        exitButton.setMinimumSize(new java.awt.Dimension(89, 23));
        exitButton.setPreferredSize(new java.awt.Dimension(89, 23));
        exitButton.setRequestFocusEnabled(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        listButton.setText("List");
        listButton.setMaximumSize(new java.awt.Dimension(89, 23));
        listButton.setMinimumSize(new java.awt.Dimension(89, 23));
        listButton.setPreferredSize(new java.awt.Dimension(89, 23));
        listButton.setRequestFocusEnabled(false);
        listButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setWheelScrollingEnabled(false);

        output.setEditable(false);
        output.setColumns(20);
        output.setRows(5);
        jScrollPane1.setViewportView(output);

        planePictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flight/Circle BackgroundV2.jpg"))); // NOI18N

        yellowPanel.setBackground(new java.awt.Color(255, 255, 0));
        yellowPanel.setLayout(null);

        totalPointsButton.setText("Total Points");
        totalPointsButton.setRequestFocusEnabled(false);
        totalPointsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPointsButtonActionPerformed(evt);
            }
        });
        yellowPanel.add(totalPointsButton);
        totalPointsButton.setBounds(10, 100, 150, 23);

        removeButton.setText("Remove");
        removeButton.setMaximumSize(new java.awt.Dimension(89, 23));
        removeButton.setMinimumSize(new java.awt.Dimension(89, 23));
        removeButton.setRequestFocusEnabled(false);
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        yellowPanel.add(removeButton);
        removeButton.setBounds(10, 60, 150, 23);

        passengerSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a Passenger" }));
        passengerSelector.setSelectedItem("- Choose Passenger -");
        passengerSelector.setToolTipText("");
        yellowPanel.add(passengerSelector);
        passengerSelector.setBounds(10, 20, 150, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(titleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameLabel)
                            .addComponent(lastNameLabel)
                            .addComponent(weekLabel1)
                            .addComponent(weekLabel2)
                            .addComponent(weekLabel3)
                            .addComponent(weekLabel4))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(firstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(listButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(weekInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(weekInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(weekInput3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(weekInput4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(planePictureLabel)))
                        .addGap(19, 19, 19)
                        .addComponent(yellowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(412, 412, 412)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(titleLabel)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(firstNameLabel)
                        .addGap(14, 14, 14)
                        .addComponent(lastNameLabel)
                        .addGap(20, 20, 20)
                        .addComponent(weekLabel1)
                        .addGap(17, 17, 17)
                        .addComponent(weekLabel2)
                        .addGap(17, 17, 17)
                        .addComponent(weekLabel3)
                        .addGap(17, 17, 17)
                        .addComponent(weekLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(firstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(listButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(weekInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(weekInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(weekInput3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(weekInput4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(planePictureLabel)))
                    .addComponent(yellowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //making an object arraylist
    ArrayList <passenger> passengerPoints = new ArrayList <>();
    
    class passenger {
        String firstName, lastName;
        int week1Points, week2Points, week3Points, week4Points;
        
        //setting up the class for the arrayList
        passenger (String _firstName, String _lastName, int _week1Points, int _week2Points, int _week3Points, int _week4Points) {
            firstName = _firstName;
            lastName = _lastName;
            week1Points = _week1Points;
            week2Points = _week2Points;
            week3Points = _week3Points;
            week4Points = _week4Points;
        }
    }
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
        //checking the inputs to make sure no errors occur here
        inputTest();
        
        //collecting all the inputs
        String firstName = firstNameInput.getText(),
               lastName = lastNameInput.getText();
        int week1Points = Integer.parseInt(weekInput1.getText()),
            week2Points = Integer.parseInt(weekInput2.getText()),
            week3Points = Integer.parseInt(weekInput3.getText()),
            week4Points = Integer.parseInt(weekInput4.getText());
        
        //putting all the info into the object array
        passenger i = new passenger(firstName, lastName, week1Points, week2Points, week3Points, week4Points);
        
        passengerPoints.add(i);
        
        //adding the choice to the combobox
        passengerSelector.addItem(firstName + " " + lastName);
        
        //confirming the actioin with the user
        output.setText("Passenger Added");
    }//GEN-LAST:event_addButtonActionPerformed

    private void listButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listButtonActionPerformed
        //clearing the output screen
        output.setText("");
        
        //listing off all the information for each passenger
        for (int n = 0; n <= passengerPoints.size() - 1; n++){
            output.append(passengerPoints.get(n).firstName + "\t" +
                          passengerPoints.get(n).lastName + "\t" +
                          passengerPoints.get(n).week1Points + "\t" +
                          passengerPoints.get(n).week2Points + "\t" +
                          passengerPoints.get(n).week3Points + "\t" +
                          passengerPoints.get(n).week4Points + "\n");
        }
    }//GEN-LAST:event_listButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed

        //taking the name of the passenger the user wishes to erase
        String name = (String)passengerSelector.getSelectedItem();
        
        //if no passengers are selected, the user gets a message
        if ("Choose a Passenger".equals(name)){
            output.setText("Please Select Valid Passenger!");
            return;
        }
        
        //if the passenger is found they will be deleted
        for (int n = 0; n <= passengerPoints.size() - 1; n++){
            if ((passengerPoints.get(n).firstName + " " + passengerPoints.get(n).lastName).equals(name)){
                passengerPoints.remove(n);
            }
        }
        
        //Deleting the passenger from the combobox
        passengerSelector.removeItem(passengerSelector.getSelectedItem());
        
        //comfirming the action so the user doesn't deleted extra passengers accidentally
        output.setText("Removed");
    }//GEN-LAST:event_removeButtonActionPerformed

    private void totalPointsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPointsButtonActionPerformed

        //taking the name of the passenger the user wishes see the point tally of
        String name = (String)passengerSelector.getSelectedItem();
        
        //these will be used to add up the points and determine the bonus for a passenger
        int totalPoints, bonus = 0;
        boolean getBonus = false;
        
        //if no passengers are selected, the user gets a message
        if ("Choose a Passenger".equals(name)){
            output.setText("Please Select Valid Passenger!");
            return;
        }
        
        //the passenger is located in the arraylist and their points and bonus are determined
        for (int n = 0; n <= passengerPoints.size() - 1; n++){
            if ((passengerPoints.get(n).firstName + " " + passengerPoints.get(n).lastName).equals(name)){
                
                //adding all of the points
                totalPoints = passengerPoints.get(n).week1Points +
                              passengerPoints.get(n).week2Points +
                              passengerPoints.get(n).week3Points +
                              passengerPoints.get(n).week4Points;
                
                //if their points are above 5000, they qualitfy for a 1000 point bonus (They do not get 1000 points for every 5000 points- just a flat bonus)
                if (totalPoints > 5000){
                    getBonus = true;
                }
                
                if (getBonus){
                    bonus = 1000;
                }
                
                //printing the point total and bonus
                output.setText((passengerPoints.get(n).firstName + " " + passengerPoints.get(n).lastName.charAt(0)) + //this is their name
                                "\'s Total Points are:\t" + totalPoints + "\tBonus:\t" + bonus);        
            }
        }
    }//GEN-LAST:event_totalPointsButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    public void inputTest (){
        //checking the data types of all the inputs by initializing test variables and catching any errors        
        try {
            String nameTest = firstNameInput.getText() + " " + lastNameInput.getText();
            int weekTest = Integer.parseInt(weekInput1.getText()) + Integer.parseInt(weekInput2.getText()) + 
                           Integer.parseInt(weekInput3.getText()) + Integer.parseInt(weekInput4.getText());
        }
        //notifying the user if there is a problem
        catch (NumberFormatException E){
            output.setText("Invalid Input!\n\nMake sure all fields are filled and with the correct data type!");
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Flight().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField firstNameInput;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameInput;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JButton listButton;
    private javax.swing.JTextArea output;
    private javax.swing.JComboBox<String> passengerSelector;
    private javax.swing.JLabel planePictureLabel;
    private javax.swing.JButton removeButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton totalPointsButton;
    private javax.swing.JTextField weekInput1;
    private javax.swing.JTextField weekInput2;
    private javax.swing.JTextField weekInput3;
    private javax.swing.JTextField weekInput4;
    private javax.swing.JLabel weekLabel1;
    private javax.swing.JLabel weekLabel2;
    private javax.swing.JLabel weekLabel3;
    private javax.swing.JLabel weekLabel4;
    private javax.swing.JPanel yellowPanel;
    // End of variables declaration//GEN-END:variables
}
