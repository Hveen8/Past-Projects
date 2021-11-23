/*
Marks Program
By Harry van der Veen
Made on 23/04/19

This will record and analyse student marks
 */
package marks.program;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class Marks_Program extends javax.swing.JFrame {

    public Marks_Program() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        titlelabel = new javax.swing.JLabel();
        marklabel = new javax.swing.JLabel();
        markinput = new javax.swing.JTextField();
        addbutton = new javax.swing.JButton();
        sortbutton = new javax.swing.JButton();
        analyzebutton = new javax.swing.JButton();
        marksoutput = new javax.swing.JTextArea();
        output = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titlelabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        titlelabel.setText("Marks Program");

        marklabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        marklabel.setText("Student Mark:");

        markinput.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        addbutton.setText("Add");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        sortbutton.setText("Sort");
        sortbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortbuttonActionPerformed(evt);
            }
        });

        analyzebutton.setText("Analyze");
        analyzebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyzebuttonActionPerformed(evt);
            }
        });

        marksoutput.setColumns(20);
        marksoutput.setRows(5);

        output.setColumns(20);
        output.setRows(5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(marklabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(markinput, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addbutton))
                            .addComponent(titlelabel))
                        .addContainerGap(121, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(marksoutput, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(sortbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(analyzebutton)
                                .addGap(104, 104, 104))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlelabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marklabel)
                    .addComponent(markinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marksoutput, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                    .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortbutton)
                    .addComponent(analyzebutton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ArrayList <Integer> marks = new ArrayList();    //Creating the arraylists for the marks to go into
    ArrayList <Integer> unsortedmarks = new ArrayList();
    
    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed

        try{    //this will make sure a number has been typed into the mark input
            int mark = Integer.parseInt(markinput.getText());
        } 
        catch (NumberFormatException e){
            output.setText("Mark must be a numeric value \nand cannot have decimal places!"); //if trying to convert the string to an integer creates and error, we know that only numbers have not been typed and can display the appropriate message
        }
       
       int mark = Integer.parseInt(markinput.getText());    //creating a variable for real instead of as a test
       
        if (mark >= 0 && 100 >= mark){ //checking if the number is between 0 and 100
            output.setText(""); //making the text areas blank to avoid inaccurate analysis with the new mark array
            markinput.setText("");
        
             Collections.addAll(marks, mark); //finally adding the inputed mark to the mark array
             Collections.addAll(unsortedmarks, mark);   //this array will be what the user sees
             Collections.sort(marks);   //this array will be used in for m mthe math for the analysis button
        
             marksoutput.setText("");   //blanking the mark list so the new list isn't simply added to the old one
        
             for (int i = 0; i < marks.size(); i++){    //writing out the new list having each number on its own line
               marksoutput.append(Integer.toString(unsortedmarks.get(i)) + "\n");   //using the append method so each number is added to the text area instead of replacing the previous mark
            }
        } 
        else{
            output.setText("Mark must be between 0 and 100!");  //If the mark is not within 0 to 100, the user will see this error message
        }
    }//GEN-LAST:event_addbuttonActionPerformed

    private void analyzebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzebuttonActionPerformed
        
        if (marks.isEmpty()){
            output.setText("Please Enter a Mark!");
        }
        
        DecimalFormat percentage = new DecimalFormat("#.00'%'");    //This will prevent impossibly long class averages
        
        output.setText("Class Average:\t\t" + percentage.format(average()) + "\n\n" //showing the class average
                       + "Maximum Mark:\t\t" + maxmark() + "\n\n"   //showing the highest mark
                       + "Minimum Mark:\t\t" + minmark() + "\n\n"   //showing the lowest mark
                       + "Range:\t\t" + Integer.toString(Integer.parseInt(maxmark()) - Integer.parseInt(minmark())) + "\n\n");    //show the distance from the lowest mark to the highest mark
        
                       for (int i = 4; i >= 0; i--){    //this loop will output the number of marks at each level
                           if (i == 0){
                               output.setText(output.getText() + "Number at level R" + ":\t" + levels()[i] + "\n\n");   //the number at position '0' are the level 'R' marks
                           }
                           else{
                               output.setText(output.getText() + "Number at level " + i + ":\t" + levels()[i] + "\n\n");    //the level the marks are at coincide with their position in the array
                           }
                       }
    }//GEN-LAST:event_analyzebuttonActionPerformed

    private void sortbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortbuttonActionPerformed
        Collections.sort(unsortedmarks);    //sorting the mark list that the user will see
        
        marksoutput.setText("");    //clearing the mark list
        
        for (int i = 0; i < marks.size(); i++){    //writing out the new list having each number on its own line
               marksoutput.append(Integer.toString(unsortedmarks.get(i)) + "\n");   //using the append method so each number is added to the text area instead of replacing the previous mark
            }
    }//GEN-LAST:event_sortbuttonActionPerformed
    
    private double average(){
        
        double total = 0,
            size = marks.size(),    //creating a variable for how many numbers are in the array
            average;

        for (int i = 0; i < size; i++){
            total += marks.get(i);  //this will add all of the numbers together
        }

        average = total / size; //this divides the total by how many numbers there were to find the average

        return average;
    }

    private String maxmark(){
        
        return Integer.toString(marks.get(marks.size() - 1));   //this will find the size of the sorted array and get the last (and largest) number
    }

    private String minmark(){
        
        return Integer.toString(marks.get(0));  //this will find the first number in the sorted array (which will also be the smallest)
    }

    private int[] levels(){
        
        double size = marks.size();

        int levelr = 0, //creating the variables for the different grade levels
            level1 = 0,
            level2 = 0,
            level3 = 0,
            level4 = 0;

        for (int i = 0; i < size; i++){ //this will go through the following function with every item in the mark array

            switch(marks.get(i) / 10){  //By dividing the mark by 100, we can separate the marks into ten groups
                case 0: //marks 0-9
                case 1: //marks 10-19
                case 2: //marks 20-29
                case 3: //marks 30-39
                case 4: //marks 40-49
                    levelr++;   //increamenting the level r counter
                    break;
                case 5: //marks 50-59
                    level1++;   //increamenting the level 1 counter
                    break;
                case 6: //marks 60-69
                    level2++;   //increamenting the level 2 counter
                    break;
                case 7: //marks 70-79
                    level3++;   //increamenting the level 3 counter
                    break;
                case 8: //marks 80-89
                case 9: //marks 90-99
                case 10:    //mark 100
                    level4++;   //increamenting the level 4 counter
                    break;
            }
        }

        int [] levels = {levelr, level1, level2, level3, level4};   //making an array to store the levels

        return levels;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Marks_Program().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JButton analyzebutton;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField markinput;
    private javax.swing.JLabel marklabel;
    private javax.swing.JTextArea marksoutput;
    private javax.swing.JTextArea output;
    private javax.swing.JButton sortbutton;
    private javax.swing.JLabel titlelabel;
    // End of variables declaration//GEN-END:variables
}
