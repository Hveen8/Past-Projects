/*
Revised by Harry van der Veen
On 03/25/19

**Comments made will be explaining how the code was changed, not what the code is actually doing
*/


/*
 * DEBUG THIS! Exercise - EZ Tip Calc
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  
 * 
 * This program is sales tax calculator. New York State sales tax varies by  
 * county. A sporting goods company has stores in the following counties:
 * 
 * Store#   County      Tax
 * 1        Onondaga    8.00%
 * 2        Jefferson   7.75%
 * 3        Hamilton    7.00%
 * 4        Erie        8.75%
 * 
 * Calculate the sales tax of an order subtotal when given the store number
 * 
 * SAMPLE OUTPUT(S): 
 * 
 * Enter Store # : 2
 * Enter order subtotal : 20
 * =======================
 * Subtotal:	20.000000
 * Tax Rate:	0.077500
 * Tax Amt:	1.550000
 * Total Amt:	21.550000
 * =======================
 * 
 * Enter Store # : 4
 * Enter order subtotal : 15.99
 * =======================
 * Subtotal:	15.990000
 * Tax Rate:	0.087500
 * Tax Amt:	1.399125
 * Total Amt:	17.389125
 * =======================
 * 
 Borrowed from Barry Burd*/

package ics3ue_week11;

import java.text.*;
import java.util.Scanner;

public class ICS3UE_Week11_fixed {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //This line is no longer a comment
        
        int storeNumber;    //These two lines are not a necessary change but they do make it easier to know what varibales will be used instead of initialising them right before they are used
        double subtotal, taxRate = 0.0, tax, total;
        
        System.out.print("Enter Store #, Between 1-4 : ");  //The string in the println now gives the options from 1-4 instead of 1-5
        storeNumber = input.nextInt();
        
        System.out.print("Enter order subtotal : ");
        subtotal = input.nextDouble();  //The scanner will now look for a double variable instead of an integer
        
    
        switch (storeNumber) {  //The proper argument has been put into the switch
            case 1:
                taxRate = 0.08;
                break;  //Break has been added here
                
            case 2: 
                taxRate = 0.0775;   //The tax rate is now 7.75% instead of 77.5%
                break;  //Break has been added here
               
            case 3: //The case is now '3' instead of '3.2'
                taxRate = 0.07;
                break;  //Break has been added here
                
            case 4:
                taxRate = 0.0875;
                break;
        }       
        
        tax = subtotal * taxRate; //The corrected formulas are now in front of the correct variables
        total = subtotal + tax;
        /*
        The output has been changed to match the sample outputs, however,
        I would have created two formats, one for dollar values and one for 
        the tax rate. This is so I could add the correct number of decimals
        and symbols for either values ($ and %)
        */
        DecimalFormat totalformat = new DecimalFormat("0.000000");
        
        System.out.println("==========================");  //minor changes have been made to mimic the sample outputs
        System.out.println("Subtotal: \t" + totalformat.format(subtotal));
        System.out.println("Tax Rate: \t" + totalformat.format(taxRate));
        System.out.println("Tax Amt: \t" + totalformat.format(tax));
        System.out.println("Total Amt : \t" + totalformat.format(total));
        System.out.println("==========================\n");      
    }      
}
