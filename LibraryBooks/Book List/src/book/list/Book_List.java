/*
Book List
By Harry van der Veen
Made on 11/12/19

This program will search through a list of books using 
linear and binary search methods for a numberd book in a list
 */
package book.list;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Book_List extends javax.swing.JFrame {

    public Book_List() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        explanationLabel = new javax.swing.JLabel();
        instructionLabel = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        locateButton = new javax.swing.JButton();
        linearLabel = new javax.swing.JLabel();
        binaryLabel = new javax.swing.JLabel();
        linearOutput = new javax.swing.JTextField();
        binaryOutput = new javax.swing.JTextField();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleLabel.setText("Children's Classics");

        explanationLabel.setText("<html>This program will find the tittle of a book according to the library<p>reference number. The program will use a Binary and a Linear Search.</html>");

        instructionLabel.setText("Enter the reference number:");

        locateButton.setText("Locate the Book");
        locateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locateButtonActionPerformed(evt);
            }
        });

        linearLabel.setText("Linear Search:");

        binaryLabel.setText("Binary Search:");

        linearOutput.setEditable(false);
        linearOutput.setBackground(new java.awt.Color(255, 255, 255));

        binaryOutput.setEditable(false);
        binaryOutput.setBackground(new java.awt.Color(255, 255, 255));

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
                        .addGap(87, 87, 87)
                        .addComponent(instructionLabel)
                        .addGap(18, 18, 18)
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(titleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(locateButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(exitButton)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(binaryLabel)
                                        .addComponent(linearLabel))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(linearOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(binaryOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(explanationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(explanationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instructionLabel)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(locateButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linearLabel)
                    .addComponent(linearOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(binaryLabel)
                    .addComponent(binaryOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //making a class to store each book with its number
    class book{
        int bookNumber;
        String bookTitle;
        
        book (int _bookNumber, String _bookTitle) {
            bookNumber = _bookNumber;
            bookTitle = _bookTitle;
        }   
    }    
           
    //making a comparator to sort the books by number
    class sortByNumber implements Comparator<book> { 
    
    @Override
    public int compare(book a, book b) { 
        return a.bookNumber - b.bookNumber; 
    } 
} 
    
    //this will be the place collected information gets stored
    ArrayList <book> library = new ArrayList <>();
    
    private void locateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locateButtonActionPerformed
        //taking the information from the text file and clearing the outputs
        readFile();
        
        linearOutput.setText("");
        binaryOutput.setText("");
        
        //making sure a number is typed into the input
        try {
            int test = Integer.parseInt(input.getText());
        }
        catch(NumberFormatException E){
            linearOutput.setText("Please enter integer number to search for a book!");
            return;
        }
        
        //collecting the book number
        int bookNumber = Integer.parseInt(input.getText());
        
        String linearBook,
               binaryBook;
        
        //sending the number to be found using linear and binary searches
        linearBook = linearSearch(bookNumber);
        
        binaryBook = binarySearch(bookNumber, 0, library.size());
        
        
        //outputing the book title (both should give the same output) If the book wasn't found, an appropriate message is shown
        if (linearBook.equals("")){
            linearOutput.setText("The title of book " + bookNumber + " could not be found.");
        }
        else {
            linearOutput.setText("The title of book " + bookNumber + " is \"" + linearBook + ".\"");
        }
        if (binaryBook.equals("")){
            binaryOutput.setText("The title of book " + bookNumber + " could not be found.");
        }
        else{
            binaryOutput.setText("The title of book " + bookNumber + " is \"" + binaryBook + ".\"");
        }
    }//GEN-LAST:event_locateButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    public void readFile (){            
        //making the reader and an arrayList to dump information to
        ArrayList <String> bookinfo = new ArrayList <>();
        BufferedReader br = null;
        //adding lines into the arrayList
        try {
            br = new BufferedReader(new FileReader("booklist.txt"));
            String word;
            while ((word = br.readLine()) != null ){
                bookinfo.add(word);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        //going through the info and putting each book and its number into a final arrayList
        for (int i = 0; i < bookinfo.size(); i += 2){
            book newBook = new book(Integer.parseInt(bookinfo.get(i)), bookinfo.get(i + 1));
            library.add(newBook);
        }
        
        //sorting the library
        Collections.sort(library, new sortByNumber());
    }
    
    public String linearSearch(int searchNumber){
        
        //going through every book in the library
        for (int i = 0; i < library.size(); i++){
            
            //if the book number is the one searched for, it will be returned, if not, "" will be returned
            if (library.get(i).bookNumber == searchNumber){
                return library.get(i).bookTitle;
            }
            else if (library.get(i).bookNumber > searchNumber){
                return "";
            }
        }
        //this will be returned if the search number is high and doesn't exist
        return "";
    }
    
    public String binarySearch (int searchNumber, int min, int max){
        
        int middle;
        //this will take the middle term in the library
        middle = (min + max) / 2;
        //this will identify if the book number doesn't exist in the doc
        if (min > max || middle == library.size()){
            return "";
        }
        //this chain will use recursion to narrow the search window to find the book
        if (library.get(middle).bookNumber == searchNumber){
            return library.get(middle).bookTitle;
        }
        else if (library.get(middle).bookNumber > searchNumber){
            return binarySearch(searchNumber, min, middle - 1);
        }
        else if (library.get(middle).bookNumber < searchNumber){
            return binarySearch(searchNumber, middle + 1, max);
        }
        
        //this shouldn't happen
        return "Something went wrong";
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Book_List().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel binaryLabel;
    private javax.swing.JTextField binaryOutput;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel explanationLabel;
    private javax.swing.JTextField input;
    private javax.swing.JLabel instructionLabel;
    private javax.swing.JLabel linearLabel;
    private javax.swing.JTextField linearOutput;
    private javax.swing.JButton locateButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
