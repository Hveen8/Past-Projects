/*
*Net Pay
*By Harry van der Veen
*Made on 03/01/19

This Program will calculate the net pay of a worker
who has worked 40 hours, at $5 and hour, with $2 
taken for insurance, and paying a tax of 22%
*/
package Net_Pay;

import java.text.DecimalFormat;

public class Net_Pay {
    public static void main(String[] args) {
       
// Making and defining variables for net pay, hours, rate, insuarance, and tax
        double n, h, w, i, t; 
       h = 40;       //hours
       w = 5.00;    // Working rate
       t = 0.22;    //tax
       i = 2.00;    //insurance
       
// Now to insert the formula for net pay
       n = (h*w-i)-t*(h*w-i);
      
       DecimalFormat moneyformat = new DecimalFormat ("#.00");
       
       System.out.println("The net pay is $" + moneyformat.format(n));  // Printing the result
    } 
}