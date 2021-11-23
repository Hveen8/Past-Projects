/*
Sorting Routines
By Harry van der Veen
Made on 11/19/19

This program will use various methods to
sort random numbers into order
 */
package sorting.routines;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_Routines extends javax.swing.JFrame {

    public Sorting_Routines() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AlgorithmButtonGroup = new javax.swing.ButtonGroup();
        orderButtonGroup = new javax.swing.ButtonGroup();
        titleLabel = new javax.swing.JLabel();
        instructionLabel = new javax.swing.JLabel();
        algorithmLabel = new javax.swing.JLabel();
        selectionButton = new javax.swing.JRadioButton();
        bubbleButton = new javax.swing.JRadioButton();
        insertionButton = new javax.swing.JRadioButton();
        quickButton = new javax.swing.JRadioButton();
        orderLabel = new javax.swing.JLabel();
        ascendingButton = new javax.swing.JRadioButton();
        descendingButton = new javax.swing.JRadioButton();
        numbersLabel = new javax.swing.JLabel();
        numberInput = new javax.swing.JTextField();
        sortButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        originalOutput = new javax.swing.JTextArea();
        originalLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sortedOutput = new javax.swing.JTextArea();
        sortedLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLabel.setText("Sorting Routines");

        instructionLabel.setText("Enter the Following Information:");

        algorithmLabel.setText("Sorting Algorithm");

        AlgorithmButtonGroup.add(selectionButton);
        selectionButton.setText("Selection");

        AlgorithmButtonGroup.add(bubbleButton);
        bubbleButton.setText("Bubble");

        AlgorithmButtonGroup.add(insertionButton);
        insertionButton.setText("Insertion");

        AlgorithmButtonGroup.add(quickButton);
        quickButton.setText("Quick");

        orderLabel.setText("Sorting Order");

        orderButtonGroup.add(ascendingButton);
        ascendingButton.setText("Ascending");

        orderButtonGroup.add(descendingButton);
        descendingButton.setText("Descending");

        numbersLabel.setText("Amount of Numbers to Sort:");

        sortButton.setText("Sort");
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });

        originalOutput.setEditable(false);
        originalOutput.setColumns(20);
        originalOutput.setRows(5);
        jScrollPane1.setViewportView(originalOutput);

        originalLabel.setText("Original Numbers");

        sortedOutput.setEditable(false);
        sortedOutput.setColumns(20);
        sortedOutput.setRows(5);
        jScrollPane2.setViewportView(sortedOutput);

        sortedLabel.setText("Sorted Numbers");

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
                        .addComponent(instructionLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(numbersLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(numberInput, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(algorithmLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(insertionButton)
                                            .addComponent(quickButton)
                                            .addComponent(selectionButton)
                                            .addComponent(bubbleButton))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(sortButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(orderLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(descendingButton)
                                            .addComponent(ascendingButton)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(originalLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sortedLabel)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exitButton, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(titleLabel)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instructionLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orderLabel)
                            .addComponent(ascendingButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descendingButton)
                        .addGap(53, 53, 53)
                        .addComponent(sortButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(algorithmLabel)
                            .addComponent(selectionButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bubbleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insertionButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quickButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numbersLabel)
                            .addComponent(numberInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(originalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sortedLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ArrayList <Integer> randomNumbers = new ArrayList<>();
    
    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
        //clearing outputs and arrays
        originalOutput.setText("");
        sortedOutput.setText("");
        randomNumbers.clear();
        
        //testing the input for numbers
        try {
            int test = Integer.parseInt(numberInput.getText());
        }
        catch (NumberFormatException E){
            sortedOutput.setText("Please enter a legal amount\nof numbers to sort!");
        }
        
        int numberAmount = Integer.parseInt(numberInput.getText());
        
        //generating a list of random number from -1000 to 1000
        for (int i = 0; i < numberAmount; i++){
            randomNumbers.add((int)(Math.ceil((Math.random() * 2000) - 1000)));
        }
        
        //outputing the unsorted values
        randomNumbers.forEach((n) -> {
            originalOutput.append(n + "\n");
        });

        //calling the chosen sort method
        switch (sortingMethod()){
            //calling a sorting method
            case 1:
                selectionSort();
                break;
            case 2:
                bubbleSort();
                break;
            case 3:
                insertionSort();
                break;
            case 4:
                quickSort(0, randomNumbers.size() - 1);
                break;
            case 5:
                //if no button is pushed
                sortedOutput.setText("Please choose sorting method!");
                return;     
        }
        
        //reversing the sorting order if the user seleced so
        switch (sortingOrder()){
            case 1:
                break;
            case 2:
                Collections.reverse(randomNumbers);
                break;
            case 3:
                //if no button is pushed
                sortedOutput.setText("Please choose sorting order!");
                return;   
        }
        
        //outputing the sorted values
        randomNumbers.forEach((n) -> {
            sortedOutput.append(n + "\n");
        });
        
    }//GEN-LAST:event_sortButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed
    
    public int sortingMethod(){
        
        //sending back whatever button was pushed
        if (selectionButton.isSelected()){
            return 1;
        }
        else if (bubbleButton.isSelected()){
            return 2;
        }
        else if (insertionButton.isSelected()){
            return 3;
        }
        else if (quickButton.isSelected()){
            return 4;
        }
        else{
            //if no button is pushed this will happen
            return 5;
        }
    }
    
    public int sortingOrder(){
        
        //sending back whatever button was pushed
        if (ascendingButton.isSelected()){
            return 1;
        }
        else if (descendingButton.isSelected()){
            return 2;
        }
        else{
            //if no button is pushed this will happen
            return 3;
        }
    }
    
    public void selectionSort(){
        
        /*
        This method will compare the first element
        with the preceding elements, switching them if
        they are smaller, until the first element is the smallest.
        This repeats for the second, third, until the last element.
        At that point, the list if fully sorted
        */
        for (int n = 0; n < randomNumbers.size(); n++){
            for (int i = n + 1; i < randomNumbers.size(); i++){
                if (randomNumbers.get(n) > randomNumbers.get(i)){
                    
                    //switching the numbers if the next one is lower
                    int temp = randomNumbers.get(n);
                    randomNumbers.set(n, randomNumbers.get(i));
                    randomNumbers.set(i, temp);
                }
            }
        }   
    }
    
    public void bubbleSort(){
        //setting up variables for the sorting
        boolean swapped = true;
        
        int arrayEnd = randomNumbers.size() - 1;
        
        while (swapped){
            
            swapped  = false;
            //this goes through every element and compares it to the next, if bigger, they swap
            for (int i = 0; i < arrayEnd; i++){
                if (randomNumbers.get(i) > randomNumbers.get(i + 1)){
                    //switching the numbers if the next one is higher
                        int temp = randomNumbers.get(i);
                        randomNumbers.set(i, randomNumbers.get(i + 1));
                        randomNumbers.set(i + 1, temp);
                        //if a swap occurs, this is flagged true
                        swapped = true;
                }               
            }
            //after each pass, the last element was the largest possible, and doesn't need to be compared
            arrayEnd--;
        }
    }
    
    public void insertionSort(){
        //going through every element starting at the second element
        for (int n = 1; n < randomNumbers.size(); n++){
            //setting an achor for comparison and looking at the element behind it
            int temp = randomNumbers.get(n);
            int i = n - 1;
            //if the anchor is smaller than the previous element, it will be swapped with previous elements until it is in the right spot
            while ((i >= 0) && (randomNumbers.get(i) > temp)){
                randomNumbers.set(i + 1, randomNumbers.get(i));
                i--;
            }
            randomNumbers.set(i + 1, temp);     
        } 
    }
    
    public void quickSort(int startPoint, int endPoint){
        
        int midPoint;
        
        //splitting the list into sections to sort
        if (startPoint < endPoint){
            midPoint = partition(startPoint, endPoint);
            quickSort(startPoint, midPoint - 1);
            quickSort(midPoint + 1, endPoint);
        }
        
    }
    
    public int partition(int startPoint, int endPoint){
        
        int lowIndex = startPoint,
            highIndex = endPoint + 1,
            pivot = randomNumbers.get(startPoint);
        
        do {
            //searching from the start for an element larger than the pivot
            do {
                lowIndex++;
                //preventing an out of bounds index exception here if pivot is already the largest
                if (lowIndex == randomNumbers.size()){
                    break;
                }
                
            } while (randomNumbers.get(lowIndex) < pivot);
            //searching from the end for an element smaller than the pivot
            do {
                highIndex--;
            } while (randomNumbers.get(highIndex) > pivot);
            //swapping the elements to the correct side of the pivot
            if (lowIndex < highIndex){
                Collections.swap(randomNumbers, lowIndex, highIndex);
            }
        } while (lowIndex < highIndex);
        
        Collections.swap(randomNumbers, startPoint, highIndex);
        
        return highIndex;
    }
       
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Sorting_Routines().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AlgorithmButtonGroup;
    private javax.swing.JLabel algorithmLabel;
    private javax.swing.JRadioButton ascendingButton;
    private javax.swing.JRadioButton bubbleButton;
    private javax.swing.JRadioButton descendingButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JRadioButton insertionButton;
    private javax.swing.JLabel instructionLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField numberInput;
    private javax.swing.JLabel numbersLabel;
    private javax.swing.ButtonGroup orderButtonGroup;
    private javax.swing.JLabel orderLabel;
    private javax.swing.JLabel originalLabel;
    private javax.swing.JTextArea originalOutput;
    private javax.swing.JRadioButton quickButton;
    private javax.swing.JRadioButton selectionButton;
    private javax.swing.JButton sortButton;
    private javax.swing.JLabel sortedLabel;
    private javax.swing.JTextArea sortedOutput;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
