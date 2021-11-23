/*
Sorting Efficiencies
By Harry van der Veen
Made on 11/23/19

This program will count the cycles and comparisons needed
by different sorting algorithms
 */
package sorting.efficiencies;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_Efficiencies extends javax.swing.JFrame {

    public Sorting_Efficiencies() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numbersButtonGroup = new javax.swing.ButtonGroup();
        orderButtonGroup = new javax.swing.ButtonGroup();
        titleLabel = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        tenButton = new javax.swing.JRadioButton();
        onehundredButton = new javax.swing.JRadioButton();
        onethousandButton = new javax.swing.JRadioButton();
        fivethousandButton = new javax.swing.JRadioButton();
        sortButton = new javax.swing.JButton();
        orderLabel = new javax.swing.JLabel();
        ascendingButton = new javax.swing.JRadioButton();
        descendingButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        originalOutput = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        sortedOutput = new javax.swing.JTextArea();
        sortedLabel = new javax.swing.JLabel();
        resultsLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLabel.setText("Sorting Efficiencies");

        amountLabel.setText("Enter the amount of numbers in the list:");

        numbersButtonGroup.add(tenButton);
        tenButton.setText("10");

        numbersButtonGroup.add(onehundredButton);
        onehundredButton.setText("100");

        numbersButtonGroup.add(onethousandButton);
        onethousandButton.setText("1000");

        numbersButtonGroup.add(fivethousandButton);
        fivethousandButton.setText("5000");

        sortButton.setText("Sort Numbers");
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });

        orderLabel.setText("Sort Order");

        orderButtonGroup.add(ascendingButton);
        ascendingButton.setText("Ascending");

        orderButtonGroup.add(descendingButton);
        descendingButton.setText("Descending");

        jLabel2.setText("Original Numbers");

        originalOutput.setEditable(false);
        originalOutput.setColumns(20);
        originalOutput.setRows(5);
        jScrollPane1.setViewportView(originalOutput);

        sortedOutput.setEditable(false);
        sortedOutput.setColumns(20);
        sortedOutput.setRows(5);
        jScrollPane2.setViewportView(sortedOutput);

        sortedLabel.setText("Sorted Numbers");

        resultsLabel.setText("Sort Results:");

        output.setColumns(20);
        output.setRows(5);
        jScrollPane3.setViewportView(output);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(365, 365, 365))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exitButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amountLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(orderLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ascendingButton)
                                    .addComponent(descendingButton)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(sortedLabel)
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(78, 78, 78)
                                    .addComponent(sortButton))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tenButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(onehundredButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(onethousandButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fivethousandButton))
                            .addComponent(resultsLabel)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountLabel)
                    .addComponent(tenButton)
                    .addComponent(onehundredButton)
                    .addComponent(onethousandButton)
                    .addComponent(fivethousandButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sortButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderLabel)
                    .addComponent(ascendingButton)
                    .addComponent(resultsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(descendingButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sortedLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    ArrayList <Integer> randomNumbers = new ArrayList<>();
    ArrayList <Integer> randomNumbersPrime = new ArrayList<>();
    
    double startTime;
    
    //making variables to track comparisons and loops for every sorting method
    double selectionLoops = 0,
        selectionComparisons = 0,
        selectionShifts = 0,
        selectionTime = 0,
        bubbleLoops = 0,
        bubbleComparisons = 0,
        bubbleShifts = 0,
        bubbleTime = 0,
        insertionLoops = 0,
        insertionComparisons = 0,
        insertionShifts = 0,
        insertionTime = 0,
        quickLoops = 0,
        quickComparisons = 0,
        quickShifts = 0,
        quickTime = 0;
    
    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
        //clearing outputs, arrays and all other values
        originalOutput.setText("");
        sortedOutput.setText("");
        output.setText("");
        randomNumbersPrime.clear();
        randomNumbers.clear();
        clearTrackers();
        
        startTime = System.currentTimeMillis();
        
        //if no number is chosen, nothing happens
        if (elementNumber() == 0){
            return;
        }
        
        //generating a list of random number from -10000 to 10000
        for (int i = 0; i < elementNumber(); i++){
            randomNumbersPrime.add((int)(Math.ceil((Math.random() * 20000) - 10000)));
        }
        //putting the numbers onto a temporary array to be sorted
        randomNumbers = (ArrayList<Integer>)randomNumbersPrime.clone();
        
        //outputing the unsorted values
        randomNumbers.forEach((n) -> {
            originalOutput.append(n + "\n");
        });
        
        //using all of the sorting algorithms
        selectionSort();
        
        randomNumbers = (ArrayList<Integer>)randomNumbersPrime.clone();
        bubbleSort();
        
        randomNumbers = (ArrayList<Integer>)randomNumbersPrime.clone();
        insertionSort();
        
        randomNumbers = (ArrayList<Integer>)randomNumbersPrime.clone();
        quickSort(0, randomNumbers.size() - 1);

        
        //reversing the sorting order if the user seleced so
        switch (sortingOrder()){
            case 1:
                break;
            case 2:
                Collections.reverse(randomNumbers);
                break;
            case 3:
                //if no button is pushed
                output.setText("Please choose sorting order!");
                return;   
        }
        
        //outputing the sorted values
        randomNumbers.forEach((n) -> {
            sortedOutput.append(n + "\n");
        });
        
        output.setText(
                "Selection Sort"
                + "\nNumber of times the loop was executed: " + selectionLoops
                + "\nNumber of times a comparison was made: " + selectionComparisons
                + "\nNumber of times a value was shifted: " + selectionShifts
                + "\nNumber of millisseconds to complete sort: " + (selectionTime - startTime)
                + "\nBubble Sort"
                + "\nNumber of times the loop was executed: " + bubbleLoops
                + "\nNumber of times a comparison was made: " + bubbleComparisons
                + "\nNumber of times a value was shifted: " + bubbleShifts
                + "\nNumber of millisseconds to complete sort: " + (bubbleTime - startTime)
                + "\nInsertion Sort"
                + "\nNumber of times the loop was executed: " + insertionLoops
                + "\nNumber of times a comparison was made: " + insertionComparisons
                + "\nNumber of times a value was shifted: " + insertionShifts
                + "\nNumber of millisseconds to complete sort: " + (insertionTime - startTime)
                + "\nQuick Sort"
                + "\nNumber of times the loop was executed: " + quickLoops
                + "\nNumber of times a comparison was made: " + quickComparisons
                + "\nNumber of times a value was shifted: " + quickShifts
                + "\nNumber of millisseconds to complete sort: " + (quickTime - startTime));
    }//GEN-LAST:event_sortButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    public int elementNumber(){
        
        //sending back whatever button was pushed
        if (tenButton.isSelected()){
            return 10;
        }
        else if (onehundredButton.isSelected()){
            return 100;
        }
        else if (onethousandButton.isSelected()){
            return 1000;
        }
        else if (fivethousandButton.isSelected()){
            return 5000;
        }
        else{
            //if no button is pushed this will happen
            output.setText("Enter number of elements to be sorted");
            return 0;
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
    
    public void clearTrackers(){
        //restting the counters after every button press
        selectionLoops = 0;
        selectionComparisons = 0;
        selectionShifts = 0;
        selectionTime = 0;
        bubbleLoops = 0;
        bubbleComparisons = 0;
        bubbleShifts = 0;
        bubbleTime = 0;
        insertionLoops = 0;
        insertionComparisons = 0;
        insertionShifts = 0;
        insertionTime = 0;
        quickLoops = 0;
        quickComparisons = 0;
        quickShifts = 0;
        quickTime = 0;
        
    }
    
    //there are counters added during the begining of loops, after values are moved and atfer comparisons
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
                selectionLoops++;
                if (randomNumbers.get(n) > randomNumbers.get(i)){
                    selectionComparisons++;
                    //switching the numbers if the next one is lower
                    int temp = randomNumbers.get(n);
                    randomNumbers.set(n, randomNumbers.get(i));
                    randomNumbers.set(i, temp);
                    selectionShifts++;
                }
            }
        }   
        selectionTime = System.currentTimeMillis();
    }
    
    public void bubbleSort(){
        //setting up variables for the sorting
        boolean swapped = true;
        
        int arrayEnd = randomNumbers.size() - 1;
        
        while (swapped){
            
            swapped  = false;
            //this goes through every element and compares it to the next, if bigger, they swap
            for (int i = 0; i < arrayEnd; i++){
                bubbleLoops++;
                if (randomNumbers.get(i) > randomNumbers.get(i + 1)){
                    bubbleComparisons++;
                    //switching the numbers if the next one is higher
                        int temp = randomNumbers.get(i);
                        randomNumbers.set(i, randomNumbers.get(i + 1));
                        randomNumbers.set(i + 1, temp);
                        bubbleShifts++;
                        //if a swap occurs, this is flagged true
                        swapped = true;
                }               
            }
            //after each pass, the last element was the largest possible, and doesn't need to be compared
            arrayEnd--;
        }
        bubbleTime = System.currentTimeMillis();
    }
    
    public void insertionSort(){
        //going through every element starting at the second element
        for (int n = 1; n < randomNumbers.size(); n++){
            //setting an achor for comparison and looking at the element behind it
            int temp = randomNumbers.get(n);
            int i = n - 1;
            //if the anchor is smaller than the previous element, it will be swapped with previous elements until it is in the right spot
            while ((i >= 0) && (randomNumbers.get(i) > temp)){
                insertionLoops++;
                randomNumbers.set(i + 1, randomNumbers.get(i));
                insertionShifts++;
                i--;
            }
            insertionComparisons++;
            randomNumbers.set(i + 1, temp);
            insertionShifts++;
        }
        insertionTime = System.currentTimeMillis();
    }
    
    public void quickSort(int startPoint, int endPoint){
        
        int midPoint;
        quickLoops++;
        //splitting the list into sections to sort
        if (startPoint < endPoint){
            quickComparisons++;
            midPoint = partition(startPoint, endPoint);
            quickSort(startPoint, midPoint - 1);
            quickSort(midPoint + 1, endPoint);
        }
        quickTime = System.currentTimeMillis();
    }
    
    public int partition(int startPoint, int endPoint){
        
        int lowIndex = startPoint,
            highIndex = endPoint + 1,
            pivot = randomNumbers.get(startPoint);
        
        quickLoops++;
        do {
            //searching from the start for an element larger than the pivot
            do {
                quickLoops++;
                lowIndex++;
                //preventing an out of bounds index exception here if pivot is already the largest
                if (lowIndex == randomNumbers.size()){
                    break;
                }
                
            } while (randomNumbers.get(lowIndex) < pivot);
            quickComparisons++;
            //searching from the end for an element smaller than the pivot
            do {
                quickLoops++;
                highIndex--;
            } while (randomNumbers.get(highIndex) > pivot);
            quickComparisons++;
            //swapping the elements to the correct side of the pivot
            if (lowIndex < highIndex){
                quickComparisons++;
                Collections.swap(randomNumbers, lowIndex, highIndex);
                quickShifts++;
            }
        } while (lowIndex < highIndex);
        quickComparisons++;
        
        Collections.swap(randomNumbers, startPoint, highIndex);
        quickShifts++;
        
        return highIndex;
    }
     
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Sorting_Efficiencies().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountLabel;
    private javax.swing.JRadioButton ascendingButton;
    private javax.swing.JRadioButton descendingButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JRadioButton fivethousandButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.ButtonGroup numbersButtonGroup;
    private javax.swing.JRadioButton onehundredButton;
    private javax.swing.JRadioButton onethousandButton;
    private javax.swing.ButtonGroup orderButtonGroup;
    private javax.swing.JLabel orderLabel;
    private javax.swing.JTextArea originalOutput;
    private javax.swing.JTextArea output;
    private javax.swing.JLabel resultsLabel;
    private javax.swing.JButton sortButton;
    private javax.swing.JLabel sortedLabel;
    private javax.swing.JTextArea sortedOutput;
    private javax.swing.JRadioButton tenButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
